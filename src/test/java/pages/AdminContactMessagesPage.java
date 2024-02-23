package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminContactMessagesPage extends AdminLoginPage{

    public AdminContactMessagesPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[.='Contact Messages']") public static WebElement contactMessageLink;
    @FindBy(xpath = "//*[@role='status']") public static WebElement showingEntiresNumberText;
    @FindBy(xpath = "//*[@class='no-sort no-click bread-actions']") public static List<WebElement> messageViewButtons;
    @FindBy(xpath="//*[@class='page-title']") public static WebElement viewingMesajContactText;

    public static void clickContactMessageLink(){
       click(contactMessageLink);
    }
    public static void clickMessageViewButton(){
        click(messageViewButtons.get(0));
    }
    public static boolean verifyDisplayedNumberText(){
        waitForVisibility(showingEntiresNumberText);
        return showingEntiresNumberText.isDisplayed();
    }

    public static boolean verifyDisplayedViewingMessageContactText(){
        waitForVisibility(viewingMesajContactText);
        return viewingMesajContactText.isDisplayed();
    }



}
