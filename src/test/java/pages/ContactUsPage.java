package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.TestException;
import utilities.TestData;

public class ContactUsPage extends HomePage{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@class='form-control title-form ']")
    public static WebElement emailTextBox;

    @FindBy(xpath = "(//input[@class='form-control title-form '])[2]")
    public static WebElement subjectTextBox;

    @FindBy(xpath = "//textarea[@placeholder='Message']")
    public static WebElement messageTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement submitButton;
    @FindBy(xpath = "//button[@class='btn btn-primary ']")
    public static WebElement succesMessage;

    public static boolean verifyEmailTextBoxEnabled(){
        return emailTextBox.isEnabled();
    }

    public static boolean verifySubjectTextBox(){
        return subjectTextBox.isEnabled();
    }

    public static boolean verifyDisplayedMessagesTextBox(){
        return messageTextBox.isEnabled();
    }
    public static boolean verifySubmitButton(){
        return submitButton.isEnabled();
    }


    public static boolean verifyEnabledContacPage() {
        return contactInHeader.isEnabled();
    }

    public static void sendContactEmail() {
        emailTextBox.clear();
        sendKeys(emailTextBox, "Team5@efsanesi.com");
    }


    public static void sendContactSubject() {
        subjectTextBox.clear();
        sendKeys(subjectTextBox,"Team5>POM");
    }

    public static void sendContactMeesage() {
        messageTextBox.clear();
        sendKeys(messageTextBox, "Biz daha iyisini yapana kadar en iyisi bu :)");
    }

    public static void clickContactSubmit() {
        click(submitButton);
    }

    public static boolean verifySuccesMessage() {
        return succesMessage.isDisplayed();
    }
}
