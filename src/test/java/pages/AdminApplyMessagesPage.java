package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.TestData;

public class AdminApplyMessagesPage extends AdminLoginPage{
    public AdminApplyMessagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[.='Apply Messages']") public static WebElement applyMessagesButton;

    @FindBy(xpath = "//*[@role='status']") public static WebElement showingEntriesNumberText;
    @FindBy(xpath = "//*[.='Add New']") public static WebElement addNewButton;
    @FindBy(xpath = "(//*[@title='View'])[1]") public static WebElement viewButton;
    @FindBy(css = "[class='voyager-book']") public static WebElement viewginApplyMessageText;
    @FindBy(xpath = "//*[@placeholder='Name']") public static WebElement nameTextBox;
    @FindBy(xpath = "//*[@placeholder='Email']") public static WebElement emailTextBox;
    @FindBy(xpath = "//*[@placeholder='Message']") public static WebElement messageTextBox;
    @FindBy(css = "[placeholder='Skills']") public static WebElement skillsTextBox;
    @FindBy(xpath = "(//*[@placeholder='Email'])[2]") public static WebElement email2TextBox;
    @FindBy(xpath = "(//*[@type='submit'])[2]") public static WebElement saveButton;
    @FindBy(css = "[placeholder='LinkedIn']") public static WebElement linkeldnTextBox;

    public static void  clickApplyMessagesButton(){
        clickWithJs1(applyMessagesButton);

    }
    public static boolean verifyShowingNumberText(){
        waitForVisibility(showingEntriesNumberText);
        return showingEntriesNumberText.isDisplayed();
    }
    public static void clickAddNewButton(){
        click(addNewButton);
    }
    public static void sendEmail(){
        sendKeys(emailTextBox, TestData.fakeEmail);
    }
    public static void sendName(){
        sendKeys(nameTextBox, TestData.fakeName);
    }
    public static void sendMessages(){
        sendKeys(messageTextBox,TestData.fakeMessage);
    }
    public static void sendSkills(){
        sendKeys(skillsTextBox, TestData.fakeSkills);
    }
    public static void sendEmail2(){
        sendKeys(email2TextBox, TestData.fakeEmail);
    }
    public static void sendLInkeldn(){
        sendKeys(linkeldnTextBox,TestData.fakeLinkeldn);
    }
    public static void clickSsaveButton(){
        click(saveButton);
    }
    public static void clickViewButton(){
        click(viewButton);
    }
    public static boolean verifyDisplayedViewApplyMessageText(){
        waitForVisibility(viewginApplyMessageText);
        return viewginApplyMessageText.isDisplayed();
    }


}
