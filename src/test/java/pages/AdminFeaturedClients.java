package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AdminFeaturedClients extends AdminLoginPage{

    public AdminFeaturedClients(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[.='Featured Clients']") public static WebElement featuredLink;
    @FindBy(xpath = "//*[@class='show-res']") public static  WebElement viewNumberEntires;
    @FindBy(css = "[class='voyager-plus']") public static WebElement addFeaturedNewButton;
    @FindBy(css = "[role='combobox']") public static WebElement companyDropdown;
    @FindBy(className = "select2-selection__rendered") public static List<WebElement> compannyOptions;
    @FindBy(css = "[name='client_name']") public  static WebElement nameTextBox;
    @FindBy(css = "[name='order']") public  static WebElement orderTextBox;
    @FindBy(xpath = "//*[.='Save']") public static WebElement saveButton;
    @FindBy(xpath = "(//*[.='Successfully Added New Featured Client'])[3]") public static WebElement succesfulSaveText;
    @FindBy(xpath = "(//*[.='Successfully Updated Featured Client'])[1]") public static  WebElement successfullUpdateTex;
    @FindBy(xpath = "//tbody/tr[1]/td[3]") public static WebElement newClientName;
    @FindBy(css = "[name='client_logo[]']") public static WebElement logoFileChoose;
    @FindBy(xpath = "//tbody/tr[1]/td[4]") public static WebElement logoPathText;
    @FindBy(className = "voyager-edit") public static List<WebElement> editButtons;
    @FindBy(id= "delete-72") public static List<WebElement> deleteButtons;
    @FindBy(xpath = "//input[@value='Yes, Delete it!']") public static WebElement yesDeleteItButton;
    @FindBy(xpath = "(//*[.='Successfully Deleted Featured Client'])[1]") public static WebElement successDeleteText;

    public static void clickFeatruedLink(){
        click(featuredLink);
    }
    public static boolean verifyDisplayedViewNumber(){
        waitForVisibility(viewNumberEntires);
        return viewNumberEntires.isDisplayed();
    }
    public static void clickaddNewFeatured(){
       clickWithJs1(addFeaturedNewButton);
    }
    public static void clickCompanyDropdown(){
        click(companyDropdown);
    }
    public static void sendNameText(String name){
        sendKeys(nameTextBox, name);
    }
    public static void sendOrder(String order){
        orderTextBox.clear();
    sendKeys(orderTextBox, order);
    }

    public static void clickSaveButton(){
        clickWithJs1(saveButton);
    }
    public static  boolean verifyDisplayedSuccesfulText(){
        waitForVisibility(succesfulSaveText);
        return succesfulSaveText.isDisplayed();
    }
    public static boolean verifyDisplayedUpdate(){
        waitForVisibility(successfullUpdateTex);
        return  successfullUpdateTex.isDisplayed();
    }
    public static void clickfirstCompanyOption(){
        click(compannyOptions.get(0));
    }
    public static void clickCompanyOption(int index){
        click(compannyOptions.get(index));
    }

    public static boolean verifyNewClientName(String name){
        waitForVisibility(newClientName);
        boolean result= newClientName.getText().equals(name);
        return result;
    }
    public static void sendLogo(String path){
        sendKeys(logoFileChoose, path);
    }
    public static boolean verifyDisplayedLogoPath(){
        waitForVisibility(logoPathText);
        return logoPathText.isDisplayed();
    }
    public static void clickEditButton(){
        click(editButtons.get(0));
    }
    public static void clickDeleteButton(){click(deleteButtons.get(0));}
    public static void clickYesDeletItButton(){
        clickWithJs1(yesDeleteItButton);
    }
    public static boolean verifysuccessDeleteText(){
        waitForVisibility(successDeleteText);
        return successDeleteText.isDisplayed();
    }


}
