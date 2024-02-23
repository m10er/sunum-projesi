package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.TestData;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//*[.='Login'])[1]") public static WebElement loginButtonInHomePage;
    @FindBy(xpath = "//*[@id='email']") public static WebElement  emailLoginTextBox;
    @FindBy(css = "[name='password']") public static WebElement passwordTLoginextBox;
    @FindBy(xpath = "//*[@type='submit']") public static WebElement loginPageLoginButton;
    @FindBy(id = "forgotPass-label") public static WebElement forgotYourPasswordButton;
    @FindBy(xpath = "//*[@class='text-primary text-gradient font-weight-bold']") public static WebElement signUpButton;



    public static boolean verifyDisplayedEmailTExtBox(){
        return emailLoginTextBox.isDisplayed();
    }
    public static boolean verifyDisplayedPasswordTextBox(){
        return passwordTLoginextBox.isDisplayed();
    }
    public static boolean verifyDisplayedForgotYourPasswordButton(){
        return forgotYourPasswordButton.isDisplayed();
    }
    public static boolean verifyDisplayedLOginPageLoginButton(){
        return  loginPageLoginButton.isDisplayed();
    }
    public static void getLoginPage(){
        driver.get(TestData.qaLoginUrl);
    }
    public static void clickLoginButtonInHomePage(){
        loginButtonInHomePage.click();
    }
    public static void sendEmail(String email){
        emailLoginTextBox.sendKeys(email);
    }
    public static void  sendEmail(){
        emailLoginTextBox.sendKeys(TestData.gecerliUserMeltemEmail);
    }
    public static void sendPassword(){
        passwordTLoginextBox.sendKeys(TestData.gecerliUserSifre);
    }
    public static void sendPassword(String password) {
        passwordTLoginextBox.sendKeys(password);
    }

    public static void clickLoginButton(){
        loginPageLoginButton.click();
    }


    public static void getLogin(){
        getLoginPage();
        sendPassword();
        sendEmail();
        clickLoginButton();
    }
    public static void tryLogin(String email, String password){
        getLoginPage();
        sendPassword(password);
        sendEmail(email);
        clickLoginButton();
    }


}
