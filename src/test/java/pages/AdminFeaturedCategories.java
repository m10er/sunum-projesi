package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminFeaturedCategories extends AdminLoginPage{
    public AdminFeaturedCategories(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[class='icon voyager-rocket']") public static WebElement featuredCategoriesLink;
    @FindBy(xpath = "//*[.='Add New']") public static WebElement addNewButton;
    @FindBy(css = "[role='combobox']") public static WebElement categoryDropdown;
    @FindBy(xpath = "//*[@class='select2-results__option']") public static List<WebElement> categoryLists;
    @FindBy(css = "[name='order']") public static WebElement orderTextBox;
    @FindBy(xpath = "(//*[@type='submit'])[2]") public static WebElement saveButton;
    @FindBy(xpath = "//*[.='Successfully Added New Featured Category']") public static WebElement successSaveText;
    @FindBy(css = "[class='show-res']") public static WebElement tableNumberText;
    @FindBy(xpath = "//*[@id='dataTable']/tbody/tr[1]/td[3]") public static WebElement orderText;
    @FindBy(xpath = "//*[@title='Edit']") public static List<WebElement> categoryEditButtons;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/form[1]/div[1]/div[2]/input") public static WebElement orderEditTextBox;
    @FindBy(xpath = "//*[.='Save']") public static WebElement editSaveButton;
    @FindBy(xpath = "(//*[.='Successfully Updated Featured Category'])[1]") public static  WebElement successfullUpdateCategoryText;
    @FindBy(xpath= "//td/a[1]") public static List<WebElement> deleteButtons;
    @FindBy(xpath = "//input[@value='Yes, Delete it!']") public static WebElement yesDeleteItButton;
    @FindBy(xpath = "(//*[.='Successfully Deleted Featured Client'])[1]") public static WebElement successDeleteText;
    public static void clickFirstEditButton(){
        click(categoryEditButtons.get(0));
    }

    public static void clickFeaturedCategoriesLink(){
        scrollToElementWithAction(featuredCategoriesLink);
        click(featuredCategoriesLink);
    }
    public static void clickAddNewButton(){
        clickWithJs1(addNewButton);
    }
    public static void clickCategoryDropdown(){
        click(categoryDropdown);
    }
    public static void clickFirstCategory(){
        click(categoryLists.get(1));
    }
    public static void sendOrder(String order){
        sendKeys(orderTextBox,order);
    }
    public static void clickSaveButton(){
        click(saveButton);
    }
    public static boolean verifyDisplaySuccessText(){
        waitForVisibility(successSaveText);
        return successSaveText.isDisplayed();
    }
    public static boolean verifyDisplay(){
        waitForVisibility(tableNumberText);
        return tableNumberText.isDisplayed();
    }
    public static boolean verifyOrderNumber(String order){
        waitForVisibility(orderText);
        return orderText.equals(order);
    }
    public static void senfOrderEdit(String order){
        sendKeys(orderEditTextBox, order);
    }
    public static void clickEditSaveButton(){
        clickWithJs1(editSaveButton);
    }
    public static boolean verifySuccessfulUpdateCategoryText(){
        return successfullUpdateCategoryText.isDisplayed();
    }
    public static void clickDeleteCategoryButton(){clickWithJs1(deleteButtons.get(0));
    }
    public static void clickYesDeletItButton(){
        clickWithJs1(yesDeleteItButton);
    }
    public static boolean verifysuccessDeleteText(){
        waitForVisibility(successDeleteText);
        return successDeleteText.isDisplayed();
    }

}
