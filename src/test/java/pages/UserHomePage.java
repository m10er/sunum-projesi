package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserHomePage extends LoginPage{


    public UserHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@class='rounded-circle home-user-avatar ml-3']")
    public static  WebElement userMenu;

    @FindBy (xpath = "//*[@class='d-inline-block align-top image-256']")
    public static  WebElement userPageHeaderLogo;

    @FindBy (xpath = "//*[text()='HOME']")
    public  static WebElement userPageHeaderHomeButton;

    @FindBy (xpath = "//*[text()='ABOUT']")
    public static  WebElement userPageHeaderAboutButton;

    @FindBy (xpath = "//*[text()='SEARCH JOB']")
    public static  WebElement userPageHeaderSearchJobButton;

    @FindBy (xpath = "//*[text()='POST JOB']")
    public  static WebElement userPageHeaderPostJobButton;

    @FindBy (xpath = "//*[text()='FAQ']")
    public  static WebElement userPageHeaderFaqButton;

    @FindBy (xpath = "//*[text()='CONTACT']")
    public static  WebElement userPageHeaderContactButton;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[2]/li/div/a[5]")
    public static  WebElement userPageLogoutButton;

    public static boolean verifyDisplayedUserHomePageUserMenu(){
        return userMenu.isDisplayed();
    }
    public static boolean verifyDisplayedLogoInHeader(){
        return userPageHeaderLogo.isDisplayed();
    }
    public static void clickUserPageHeaderLogo(){
        click(userPageHeaderLogo);
    }

    public static boolean verifyDisplayedUserPageHeaderHomeButton(){
        return userPageHeaderHomeButton.isDisplayed();
    }
    public static void clickUserPageHeaderHomeButton(){
        click(userPageHeaderHomeButton);
    }
    public static boolean verifyDisplayedUserPageAboutLink(){
        return userPageHeaderAboutButton.isDisplayed();
    }

    public static void clickUserPageAboutLink() {
        click(userPageHeaderAboutButton);
    }
    public static boolean verifyDisplayeduserPageHeaderSearchJobButton(){
        return userPageHeaderSearchJobButton.isDisplayed();
    }
    public static void clickUserPageHeaderSearchJobButton(){
        click(userPageHeaderSearchJobButton);
    }

    public static boolean verifyDisplayeduserPageHeaderPostJobButton() {
        return userPageHeaderPostJobButton.isDisplayed();
    }

    public static void clickUserPageHeaderPostJobButton() {
        click(userPageHeaderPostJobButton);
    }

    public static boolean verifyDisplayeduserPageHeaderFaqButton() {
        return userPageHeaderFaqButton.isDisplayed();
    }

    public static void clickuserPageHeaderFaqButton() {
        click(userPageHeaderFaqButton);
    }

    public static boolean verifyDisplayeduserPageHeaderContactButton() {
        return userPageHeaderContactButton.isDisplayed();
    }

    public static void clickuserPageHeaderContactButton() {
        click(userPageHeaderContactButton);
    }

    public static boolean verifyDisplayeduserMenu() {
        return userMenu.isDisplayed();
    }

    public static void clickUserMenu() {
        click(userMenu);
    }

    public static void clickuserPageLogoutButton() {
        click(userPageLogoutButton);
    }
}
