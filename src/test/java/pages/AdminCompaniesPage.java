package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.TestData;

public class AdminCompaniesPage extends AdminLoginPage{
    public AdminCompaniesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@class='hamburger btn-link']")
    public static WebElement hamburgerButton;

    @FindBy (xpath ="//div[@id='adminmenu']/ul[1]/li[4]/a[1]" )
    public static  WebElement companiesTitle;

    @FindBy (xpath = "(//input[@class='form-control'])[3]")
    public static WebElement addCompaniesSlug;


    @FindBy (xpath = "//*[@class='page-title']")
    public static  WebElement companiesText;


    @FindBy (xpath = "//a[contains(@class,'btn btn-success')]")
    public static  WebElement companiesAddNewButton;

    @FindBy (xpath = "//*[@name='user_id']")
    public  static WebElement addCompaniesUserId;

    @FindBy (xpath = "//*[@name='name']")
    public static  WebElement addCompaniesName;

    @FindBy (xpath = "//button[@class='btn btn-primary save']")
    public static  WebElement addCompaniesSaveButton;

    @FindBy (xpath = "//*[@class='btn btn-sm btn-primary pull-right edit']")
    public  static WebElement companiesEditButton;

    @FindBy (xpath = "//*[@class='page-title']")
    public static  WebElement editCompaniesText;


    @FindBy (xpath = "//*[@class='btn btn-sm btn-danger pull-right delete']")
    public  static WebElement companiesDeleteButton;

    @FindBy (xpath = "//*[@class='modal-title']")
    public static  WebElement companiesDeleteText;
    @FindBy (xpath = "//input[@placeholder='Hq']")
    public static WebElement addCompaniesHg;
    @FindBy (xpath = "//input[@placeholder='Website Url']")
    public static WebElement addCompaniesWebsiteUrl;

    @FindBy (xpath = "//input[@placeholder='Email']")
    public static WebElement addCompaniesEmail;
    @FindBy (xpath = "//input[@placeholder='Description']")
    public static WebElement addCompaniesDescription;
    @FindBy (xpath = "//*[@id='toast-container']/div/div")
    public static WebElement addCompaniesSuccesfullMesage;
    @FindBy (xpath = "//input[@type='submit']")
    public static WebElement companiesDeleteSubmit;
    @FindBy (xpath = "//*[@id='toast-container']/div/div")
    public static WebElement addCompaniesDeleteSuccesfullMesage;
    public static boolean verifyDisplayedCompaniesText() {
        return companiesText.isDisplayed();
    }

    public static void clickCompaniesTitle() {
        click(companiesTitle);
    }

    public static void clickCompaniesAddNewButton() {
       clickWithJs1(companiesAddNewButton);
    }

    public static void sendCompaniesUserId() {
        sendKeys(addCompaniesUserId, TestData.fakeCompanyId);
    }


    public static void sendCompaniesName() {
        sendKeys(addCompaniesName, TestData.fakeName);
    }

    public static void sendCompaniesSlug() {
        sendKeys(addCompaniesSlug, TestData.fakebisey);
    }

    public static void sendAddCompaniesHg() {
        sendKeys(addCompaniesHg, TestData.fakebisey);
    }


    public static void sendCompaniesWebSiteUrl() {
        sendKeys(addCompaniesWebsiteUrl, TestData.fakebisey);
    }

    public static void sendCompaniesEmail() {
        sendKeys(addCompaniesEmail, TestData.fakeEmail);
    }

    public static void sendCompaniesDescription() {
        sendKeys(addCompaniesDescription, TestData.fakebisey);
    }

    public static void clickCompaniesSaveButton() {
        click(addCompaniesSaveButton);
    }

    public static boolean verifyAddCompaniesSuccesfullMesage() {
        return addCompaniesSuccesfullMesage.isDisplayed();
    }

    public static void clickCompaniesEditButton() {
        click(companiesEditButton);
    }

    public static void clickAddCompaniesSaveButton() {
        click(addCompaniesSaveButton);
    }

    public static void clickCompaniesDeleteButton() {
        click(companiesDeleteButton);
    }

    public static void clickCompaniesDeletSubmit() {
        click(companiesDeleteSubmit);
    }

    public static boolean verifyCompaniesDeleteSuccesfullMesage() {
        return addCompaniesDeleteSuccesfullMesage.isDisplayed();
    }
}
