package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.TestData;

public class AdminLoginPage extends BasePage{
    public AdminLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email") public static WebElement emailTextBox;
    @FindBy(xpath = "//*[@type='password']") public static WebElement passwordTextBox;
    @FindBy(xpath = "//*[.='Login']") public static WebElement loginPageLoginButton;
    @FindBy(xpath = "//*[@class='hamburger btn-link']") public static WebElement hamburgerMenuButton;

    public static void clickHamburgerButton(){
        clickWithJs1(hamburgerMenuButton);
    }
    public static void getAdminLoginPage(){
        driver.get(TestData.qaAdminWebUrl);
    }

    public static void sendEmail(String email){
        emailTextBox.clear();
        sendKeys(emailTextBox,email);
    }
    public static void sendPassword(String  password){
        passwordTextBox.clear();
        sendKeys(passwordTextBox,password);
    }
    public static void sendPassword(){
        sendKeys(passwordTextBox,TestData.gecerliAdminSifre);
    }
    public static void clickLoginButton(){
        click(loginPageLoginButton);
    }


    public static void validAdminLogin(){
        getAdminLoginPage();
        sendEmail(TestData.gecerliAdminMuammerEmail);
        sendPassword();
        clickLoginButton();
    }
    public static void tryAdminLogin(String email, String password){
        getAdminLoginPage();
        sendEmail(email);
        sendPassword(password);
        clickLoginButton();
    }
    public static void getAdminUgurLogin() {
        getAdminLoginPage();
        sendEmail(TestData.gecerliAdminMuammerEmail);
        sendPassword();
        clickLoginButton();
    }
    public static void getAdminOrkunLogin() {
        getAdminLoginPage();
        sendEmail(TestData.gecerliAdminOrkunEmail);
        sendPassword();
        clickLoginButton();
    }
    public static void getAdminDeryaLogin() {
        getAdminLoginPage();
        sendEmail(TestData.gecerliAdminDeryaEmail);
        sendPassword();
        clickLoginButton();
    }
    public static void getAdminAbdurrahimLogin() {
        getAdminLoginPage();
        sendEmail(TestData.gecerliAdminAbdurrahimEmail);
        sendPassword();
        clickLoginButton();
    }


}
