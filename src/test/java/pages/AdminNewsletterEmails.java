package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminNewsletterEmails extends AdminLoginPage{
    public AdminNewsletterEmails(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='icon voyager-mail']/following-sibling::span[1]") public static WebElement newsletterLink;
    @FindBy(xpath = "//*[@class='show-res']") public static WebElement numberNewsletterEmailText;
    @FindBy(xpath = "//div/div/div/a[1]") public static WebElement addNewButton;
    @FindBy(xpath = "//*[@name='email']") public static WebElement emailTextBox;
    @FindBy(xpath = "//*[.='Save']") public static WebElement saveButton;
    @FindBy(xpath = "(//*[.='Successfully Added New Newsletter Email'])[1]") public static WebElement successfullSaveMessage;
    @FindBy(xpath = "//*[@class='toast-message']") public static WebElement successfullUpdateMessage;
    @FindBy(xpath = "//td/a[2]") public static WebElement editNewsletterButton;
    @FindBy(xpath = "//div/div/input") public static WebElement editEmailText;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/form[1]/div[2]/button") public static WebElement editSaveButton;
    @FindBy(xpath = "//td/a[1]") public static List<WebElement> deleteNewsletterButtons;
    @FindBy(xpath = "//form/input[3]") public static WebElement yesDeleteItButton;
    @FindBy(xpath = "(//*[.='Successfully Deleted Newsletter Email'])[3]") public static WebElement successDeletMessage;

    public static void clickNewsletterEmail(){
        clickWithJs1(newsletterLink);
    }
    public static boolean verifyDisplayedNumberNewsletterEmail(){
        waitForVisibility(numberNewsletterEmailText);
        return numberNewsletterEmailText.isDisplayed();
    }
    public static void clickAddNewButton(){
        clickWithJs1(addNewButton);
    }
    public static void sendEmail(String email){
        sendKeys(emailTextBox, email);
    }
    public static void clickSaveButton(){
        click(saveButton);
    }
    public static boolean verifyDisplayedSuccessfullMessage(){
        return successfullSaveMessage.isDisplayed();
    }
    public static void clickEditNewsletterButton(){
        waitForVisibility(editNewsletterButton);
        click(editNewsletterButton);
    }
    public static void sendEmailEditText(String email){
        editEmailText.clear();
        sendKeys(editEmailText, email);
    }
    public static void clickEditSaveButton(){
        click(editSaveButton);
    }
    public static void clickDeleteNewsletterButton(){
        click(deleteNewsletterButtons.get(0));
    }
    public static void clickYesDeletItButton(){
        click(yesDeleteItButton);
    }
    public static boolean verifyDisplayedSuccessDeletMessage(){
        waitForVisibility(successDeletMessage);
        return successDeletMessage.isDisplayed();
    }
    public static boolean verifyDisplaySuccesUpdateMessage(){
        waitForVisibility(successfullUpdateMessage);
        return successfullUpdateMessage.isDisplayed();
    }


}
