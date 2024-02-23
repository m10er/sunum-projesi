package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BaseClass;

import java.lang.invoke.CallSite;

public class AdminDashboardPage extends AdminLoginPage {
    public AdminDashboardPage(WebDriver driver) {
        super(driver);
    }

    // ugurun locateleri

    @FindBy(className = "page-title")
    public static WebElement platformStatisticsText ;

    @FindBy(xpath = "//*[@class='hamburger btn-link']")
    public  static WebElement hamburgerButonu ;

    @FindBy(xpath = "//*[@data-toggle='collapse']")
    public  static WebElement jobsMenuButonu ;

    @FindBy(xpath = "//*[@class=\'icon voyager-images\']")
    public static  WebElement jobsMediaButonu;

    public static boolean verifyDisplayedPlatrformStatisticText(){
        return platformStatisticsText.isDisplayed();
    }

    // muammerin locateleri
    @FindBy(xpath = "//*[@class='page-title']")
    public static  WebElement jobsPageTitle;

    @FindBy(xpath = "//*[@class='icon voyager-home']") public static WebElement dashboardLink;
    @FindBy(xpath = "//*[@data-toggle='dropdown']") public static WebElement profilLogo;
    @FindBy(xpath = "//*[@class='dropdown-menu dropdown-menu-animated']") public static WebElement profilLogoDetail;
    @FindBy(xpath = "//*[@class='class-full-of-rum']") public static WebElement profilDEtailLink;
    @FindBy(xpath = "//*[.='Edit My Profile']") public static WebElement editMyProfilButton;
    @FindBy(css = "[name='bio']") public static WebElement bioTExt;
    @FindBy(css = "[name='location']") public static WebElement locationText;
    @FindBy(xpath = "(//*[@type='submit'])[2]") public static WebElement profileSaveButton;
    @FindBy(css = "[class='toast-message']") public static WebElement profileSaveSuccessMessage;
    @FindBy(css = "[class='voyager-home']") public static WebElement homeLink;
    @FindBy(css = "[class='voyager-power']") public static WebElement logoutButton;

    public static void clickLogoutButton(){
        click(logoutButton);
    }

    public static void clickHomeLink(){
        click(homeLink);
    }
    public static boolean verifyDisplayProfileSaveSuccessMessage(){
        waitForVisibility(profileSaveSuccessMessage);
        return profileSaveSuccessMessage.isDisplayed();
    }

    public static void clickProfileSave(){
        click(profileSaveButton);
    }
    public static void sendlocationText(String location){
        sendKeys(locationText, location);
    }
    public static void sendBio(String bio){
        sendKeys(bioTExt, bio);
    }

    public static void clickEditMyProfilButton(){
        click(editMyProfilButton);
    }

    public static void clickProfilDetail(){
        click(profilDEtailLink);
    }
    public static boolean verifylogoDisplayDetail(){
        waitForVisibility(profilLogoDetail);
        return profilLogoDetail.isDisplayed();
    }
    public static void clickDashboardLink(){
        click(dashboardLink);
    }
    public static void clickLogo(){
        click(profilLogo);
    }

}
