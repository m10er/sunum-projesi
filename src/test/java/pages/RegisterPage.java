package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.TestData;

public class RegisterPage extends LoginPage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='brand-logo pb-4']")
    public static WebElement registerPageLogo;

    @FindBy(xpath = "//input[@id='name']")
    public static WebElement registerPageNameTextBox;

    @FindBy(xpath = "//input[@id='email']")
    public static WebElement registerPageEmailTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement registerPagePasswordTextBox;

    @FindBy(xpath = "//input[@id='password-confirm']")
    public static WebElement registerPageConfirmPasswordTextBox;

    @FindBy(xpath = "//label[@for='tosAgree']")
    public static WebElement registerPageCheckBox;

    @FindBy(xpath = "//*[@id='register-form']/div[6]/div/button")
    public static WebElement registerPageRegisterButton;

    @FindBy(xpath = "//a[@class='text-primary text-gradient font-weight-bold']")
    public static WebElement registerPageSignInButton;


    // Method'lar
    static Faker faker =new Faker();
    public static void sendRegisterPageNameTextBox(){

    sendKeys(registerPageNameTextBox,faker.name().firstName());
    }

    public static void sendEmailTextBox(){
        sendKeys(registerPageEmailTextBox,faker.internet().emailAddress());
    }

    public static void sendPassword(){
        sendKeys(registerPagePasswordTextBox, TestData.gecerliAdminSifre);
    }
    public static void sendConfirmPassword(){
        sendKeys(registerPageConfirmPasswordTextBox,TestData.gecerliAdminSifre);
    }
    public static void clickRegisterPageCheckBox(){
        click(registerPageCheckBox);
    }
    public static void clickRegisterCheckButton(){
        clickWithJs1(registerPageRegisterButton);
    }

    public static boolean verifyDisplayedRegisterPageSigninButton(){
        return registerPageSignInButton.isDisplayed();
    }
    public static void clickSignupButton(){
        click(registerPageSignInButton);
    }

    public static boolean verifyDisplayedRegisterPageLogo(){
        waitForVisibility(registerPageLogo);
        return registerPageLogo.isDisplayed();
    }
    public static boolean verifyRegisterPageNameTextBox(){
        waitForVisibility(registerPageNameTextBox);
        return  registerPageNameTextBox.isDisplayed();
    }
    public static boolean verifyREgisterPageEmailTextBox(){
        waitForVisibility(registerPageEmailTextBox);
        return registerPageEmailTextBox.isDisplayed();
    }
    public static boolean verifyREgisterPagePasswordTextBox(){
        waitForVisibility(registerPagePasswordTextBox);
        return registerPagePasswordTextBox.isDisplayed();
    }
    public static boolean verifyREgisterPageCheckBox(){
        waitForVisibility(registerPageConfirmPasswordTextBox);
        return registerPageCheckBox.isDisplayed();
    }
    public static boolean verifyREgisterPageConfirmPasswordTextBox(){
        waitForVisibility(registerPageConfirmPasswordTextBox);
        return registerPageConfirmPasswordTextBox.isDisplayed();
    }
    public static boolean verifyREgisterPageREgisterButton(){
        waitForVisibility(registerPageRegisterButton);
        return registerPageRegisterButton.isDisplayed();
    }




}
