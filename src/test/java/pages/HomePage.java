package pages;


import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;
import utilities.TestData;


import java.util.List;

public class HomePage extends LoginPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/contact']")
    public static WebElement contactInHeader;

    @FindBy(xpath = "//*[@*='brand-logo d-inline-block align-top']")
    public static WebElement footerLogo;

    @FindBy(xpath = "/html/body/footer/div/div[1]/div/div[2]/a[1]")
    public static WebElement footerContactPageButton;

    @FindBy(xpath = "//a[text()='Help & FAQ']")
    public static WebElement footerHelpFaqButton;

    @FindBy(xpath = "//a[text()='Privacy Policy']")
    public static WebElement footerPrivacyPolicyButton;

    @FindBy(xpath = "(//*[@class='text-dark m-2'])[3]")
    public static WebElement footerTermsConditionsButton;

    @FindBy(xpath = "(//a[@class='m-2'])[1]")
    public static WebElement footerFacebookButton;

    @FindBy(xpath = "(//a[@class='m-2'])[2]")
    public static WebElement footerTwitterButton;

    @FindBy(xpath = "(//a[@class='m-2'])[3]")
    public static WebElement footerInstagramButton;

    @FindBy(xpath = "(//a[@class='m-2'])[4]")
    public static WebElement footerYoutubeButton;

    @FindBy(xpath = "//*[@class='d-block text-truncate side-menu-label ml-1']")
    public static WebElement footerDarkButton;

    @FindBy(xpath = "//a[@class='nav-link']")
    public static WebElement headerLoginButton;

    @FindBy(xpath = "//a[@class='text-primary text-gradient font-weight-bold']")
    public static WebElement loginPageSignUpButton;
    @FindBy(css = "[class='mx-4 mb-4 mb-md-1 grayscale featured-client-logo']")
    public static List<WebElement> clietLogoList;
    @FindBy(xpath = "//span[@class='h4 font-weight-bold']")
    public static List<WebElement> categoriesTitle;
    @FindBy(css = "[class='h4 font-weight-bold']")
    public static List<WebElement> jobsTitle;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[2]/div/img")
    public static List<WebElement> clientLogos;

    @FindBy(css = "[type='email']")
    public static WebElement emailTextBox;
    @FindBy(xpath = "//*[.='Subscribe']")
    public static WebElement suscribeButton;

    @FindBy(xpath = "//div/div/div/div/div/div/a/span")
    public static List<WebElement> popularTags;

    @FindBy(css = "[class='row d-flex justify-content-start align-items-center']")
    public static WebElement bodyBigTitle;
    @FindBy(xpath = "(//ul[@class='navbar-nav ']//li)[3]")
    public static WebElement searchaJobButton;
    @FindBy(xpath = "(//div[contains(@class,'d-flex justify-content-center')]//a)[2]")
    public static WebElement postaJobfor10Button;
    @FindBy(xpath = "//*[.='First, tell us about the position']")
    public static WebElement tellUsAboutText;
    @FindBy(css = "[class='btn btn-outline-primary mb-0']")
    public static List<WebElement> viewAllButtons;

    @FindBy(xpath = "//*[@class='mr-auto']")
    public static WebElement succesSubscribeMessage;

    @FindBy(id = "navbarDropdown")
    public static WebElement profileNameInHeader;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public static WebElement myCompaniesInMyProfile;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[2]")
    public static WebElement myJobsInMyProfile;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[3]")
    public static WebElement searchInMyProfile;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[4]")
    public static WebElement settingsInMyProfile;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[5]")
    public static WebElement logoutInMyProfile;
    @FindBy(xpath = "(//*[.='SEARCH JOB'])[1]")
    public static WebElement searchJobMenuLink;

    @FindBy(xpath = "//p[contains(@class,'mb-0 text-muted')]")
    public static WebElement paragraphBody;

    @FindBy(css = "[class='btn btn-outline-primary mb-0']")
    public static List<WebElement> viewAllJobsButton;

    public static boolean verifyEnabledViewAllJobsButton(){
        boolean result= false;
        for (WebElement element: viewAllJobsButton){
            element.isEnabled();
            result= true;
        }
        return result;
    }

    public static boolean verifyDisplayedParagraph(){
        return paragraphBody.isDisplayed();
    }


    public static void clickContactInHeader(){
        click(contactInHeader);
    }

    public static void getHomePage(){
        driver.get(TestData.qaWebUrl);
    }
    public static void clickMyCompaniesLinkInProfileDropdown(){
        click(profileNameInHeader);
        clickWithJs1(myCompaniesInMyProfile);

    }
    public static void clickMyJobsLinkInProfileDropdown(){
        click(profileNameInHeader);
        clickWithJs1(myJobsInMyProfile);
    }
    public static void clickSearchLinkInProfileDropdown(){
        click(profileNameInHeader);
        clickWithJs1(searchInMyProfile);
    }
    public static void clickSettingsLinkInProfileDropdown(){
        click(profileNameInHeader);
        clickWithJs1(settingsInMyProfile);
    }
    public static void clickLogoutLinkInProfileDropdown(){
        click(profileNameInHeader);
       clickWithJs1(logoutInMyProfile);
    }

    public static boolean verifyEmailSubscribe(){
        Faker faker = new Faker();
        scrollToElementWithAction(emailTextBox);
        boolean result = false;
        sendKeys(emailTextBox,faker.internet().emailAddress());
        click(suscribeButton);
        if (succesSubscribeMessage.isDisplayed()){
            result = true;
        }
return  result;
    }

    public static boolean verifyEnabledViewAllButtons(){
        boolean result= true;
        for (WebElement each: viewAllButtons){
            if (!each.isEnabled()){
                result=false;
            }
        }
        return result;
    }

    public static boolean verifyDisplayedCategoriesTitle(){
        boolean result= true;
        for (WebElement each: categoriesTitle){
            if (!each.isDisplayed()){
                result=false;
            }
        }
        return result;
    }

    public static boolean verifyDisplayedTellUsAbout(){
        return tellUsAboutText.isDisplayed();
    }

    public static void clicksearchaJobButton(){
        click(searchaJobButton);
    }

    public static boolean verifyEnabledPOstaJobfor10Button(){
        return postaJobfor10Button.isEnabled();
    }

    public static boolean verifyDisplayedSearchaJobButton(){
        return  searchaJobButton.isEnabled();
    }

    public static boolean verifyDisplayedbodyBigTitle(){
        return bodyBigTitle.isDisplayed();
    }
    public static boolean verifyDisplayedPopularTags(){

        boolean result = true;
        for (WebElement each: popularTags){
           if (!each.isEnabled()){
               result = false;
           }
        }
        return result;
    }

    public static boolean verifyDisplayedEmailText(){
        scrollToElementWithAction(emailTextBox);
        return emailTextBox.isDisplayed();
    }
    public static boolean verifyDisplayedSuscribeButton(){
        scrollToElementWithAction(emailTextBox);
        return suscribeButton.isDisplayed();
    }
    public static void clickFooterLogo(){
        scrollToElementWithAction(footerLogo);
        click(footerLogo);
    }
    public static void clickfoooterFacebookButton(){
        scrollToElementWithAction(footerFacebookButton);
        click(footerFacebookButton);
    }

    public static boolean verifyMyLogo(String clientName) {
        waitForVisibility(clietLogoList.get(0));
        boolean result = false;
        for (WebElement each : clietLogoList) {
            if (each.getCssValue("title").equals(clientName)) {
                result = true;
            }
        }
        return result;
    }

    public static boolean verifyCategoryTitle(String categoryName, int order) {
        boolean result = false;
        if (categoriesTitle.get(order).getText().equals(categoryName)) {

            result=true;
        }System.out.println(categoriesTitle.get(order).getText());
        return result;
    }

    public static boolean verifyDisplayedClientLogos (){
        boolean result= true;
        for (WebElement each: clientLogos){
            if (!each.isDisplayed()){
                result= false;
            }
        }
      return result;
    }
    public static boolean verifyDisplayedTitleJobs (){
        return jobsTitle.get(0).isDisplayed();
    }

    public static boolean verifyDisplayFooter(){
        scrollToElementWithAction(footerLogo);
        return footerLogo.isDisplayed();
    }
    public static void clickInFooterContactPageLink(){
        scrollToElementWithAction(footerContactPageButton);
        click(footerContactPageButton);
    }
    public static void clickHelpFaqInFooter(){
        scrollToElementWithAction(footerHelpFaqButton);
        click(footerHelpFaqButton);
    }
    public static void clickPrivacyPoliciyInFooter(){
        scrollToElementWithAction(footerPrivacyPolicyButton);
        click(footerPrivacyPolicyButton);
    }
    public static void clickInFooterTersmConditons(){
        scrollToElementWithAction(footerTermsConditionsButton);
        click(footerTermsConditionsButton);
    }

    public static void clickInFooterFAcebookIcon(){
        scrollToElementWithAction(footerFacebookButton);
        click(footerFacebookButton);
    }
    public static void clickInFooterTwitterIcon(){
        scrollToElementWithAction(footerTwitterButton);
        click(footerTwitterButton);
    }
    public static void  clickInFooterInstagramIcon(){
        scrollToElementWithAction(footerInstagramButton);
        click(footerInstagramButton);
    }
    public static void clickInFooterYoutubeIcon(){
        scrollToElementWithAction(footerYoutubeButton);
        click(footerYoutubeButton);
    }
    public static boolean verifyDisplayedProfileName(){
        return profileNameInHeader.isDisplayed();
    }
    public static boolean verifyDisplayedProfileDropdownMenu(){
        click(profileNameInHeader);
        return myCompaniesInMyProfile.isEnabled();
    }

    public static void clickSearchJobMenuLink(){
        click(searchJobMenuLink);
    }

    public static void clickPostaJobButton(){
        click(postaJobfor10Button);
    }
}



