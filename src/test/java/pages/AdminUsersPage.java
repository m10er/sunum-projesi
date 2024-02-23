package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.TestData;

public class AdminUsersPage extends AdminLoginPage{

    public AdminUsersPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (xpath = "//*[@class='hamburger btn-link']")
    public static WebElement hamburgerButton;

    @FindBy (xpath = "(//*[@data-toggle='collapse'])[2]")
    public static WebElement parentUsersMenu;

    @FindBy (xpath ="//*[@id='29-dropdown-element']/div/ul/li[1]/a/span[2]" )
    public static WebElement childUsersMenu;

    @FindBy (xpath = "//h1[@class='page-title']//i[1]")
    public static WebElement usersPageTitle;

    @FindBy (css = "[class='btn btn-success btn-add-new']")
    public static WebElement usersAddNewButton;

    @FindBy (xpath = "//*[@name='name']")
    public static WebElement addUserNameText;

    @FindBy (xpath = "//*[@name='email']")
    public static WebElement addUserEmailText;

    @FindBy (xpath = "//*[@name='password']")
    public static WebElement addUserPasswordText;

    @FindBy (xpath = "//*[@class='btn btn-primary save']")
    public static WebElement addUserSaveButton;

    @FindBy (xpath = "//*[@id='toast-container']/div/div")
    public static WebElement addUsersSuccesfullMesage;

    @FindBy (xpath = "(//a[contains(@class,'btn btn-sm')])[2]")
    public static WebElement addUsersEditButton;

    @FindBy (xpath = "//span[@class='hidden-xs hidden-sm']")
    public static WebElement usersDeleteButton;

    @FindBy (xpath = "//span[text()='Identity Checks']")
    public static WebElement identityChecksButton;

    @FindBy (xpath = "//h1[@class='page-title']")
    public static WebElement identityChecksPage;

    @FindBy (xpath = "//a[contains(@class,'btn btn-success')]")
    public static WebElement identityChecksAddNewButton;

    @FindBy (xpath = "(//a[@title='Edit'])[2]")
    public static WebElement identityChecksEditButton;

    @FindBy (xpath = "//input[@class='form-control']")
    public static WebElement identityChecksUserIdText;

    @FindBy (xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/form[1]/div[1]/div[4]/input")
    public static WebElement identityChecksFilesText;

    @FindBy (xpath = "//input[@name='rejectionReason']")
    public static WebElement identityChecksRejectionReasonText;

    @FindBy (xpath = "select2-status-ry-container")
    public static WebElement identityChecksStatusText;

    @FindBy (xpath = "//*[@id='select2-status-kp-container']")
    public static WebElement IdentityChecksStatusDropdown;

    @FindBy (xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/form[1]/div[1]/div[7]/input")
    public static WebElement identityChecksCreateDate;

    @FindBy ( className = "select2-selection__rendered")
    public static WebElement statusRejectedText;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public static WebElement identityChecksSaveButton;

    @FindBy (xpath = "//*[@id='toast-container']/div/div")
    public static WebElement identityChecksSuccesfullMesage;

    @FindBy (xpath = "//span[text()='User Reports']")
    public static WebElement userReportsButton;

    @FindBy (xpath = "/html/body/div[2]/div[2]/div[2]/div/div[1]/h1/i")
    public static WebElement userReportsPageTitle;

    @FindBy (xpath =   "//*[@id='dataTable']/tbody/tr[1]/td[8]/a[3]/i")
    public static WebElement userReportsViewButton;

    @FindBy (xpath = "//input[@class='form-control']")
    public static WebElement userReportsJobIdText;

    @FindBy (xpath = "(//input[@class='form-control'])[2]")
    public static WebElement userReportsCompanyIdText;

    @FindBy (xpath = "(//input[@class='form-control'])[3]")
    public static WebElement userReportsDetailsText;

    @FindBy (xpath = "select2-type-at-container")
    public static WebElement userReportsTypeText;

    @FindBy (xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/form[1]/div[1]/div[6]/input")
    public static WebElement userReportsStatusText;

    @FindBy (xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/form[1]/div[2]/button")
    public static WebElement userReportsSaveButton;

    @FindBy (xpath = "//*[@id='toast-container']/div/div")
    public static WebElement userReportsSuccesfullMesage;

    @FindBy (xpath = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/form[1]/div[2]/button")
    public static WebElement identityEditSaveButton;

    @FindBy (xpath = "(//*[@class='voyager-edit'])[1]")
    public static WebElement userReportsEditButton;


    public static void clickParentUserMenu() {
        click(parentUsersMenu);
    }

    public static void clickChildUserMenu() {
        click(childUsersMenu);
    }

    public static boolean verifyDisplayedUsersPageTitle() {
        return usersPageTitle.isDisplayed();
    }

    public static void clickUsersAddNewButton() {
        clickWithJs1(usersAddNewButton);
    }

    public static void sendAddUserNameTExt() {
        sendKeys(addUserNameText, TestData.fakeName);
    }

    public static void sendUserEmailText() {
        sendKeys(addUserEmailText, TestData.fakeEmail);
    }

    public static void sendUserPasswordTExt() {
    sendKeys(addUserPasswordText,TestData.fakebisey);
    }

    public static void clickAddUserSaveButton() {
        click(addUserSaveButton);
    }

    public static boolean verifyAddUsersSuccesfullMesage() {
        return  addUsersSuccesfullMesage.isDisplayed();
    }

    public static void clickAddUsersEditButton() {
       clickWithJs1(addUsersEditButton);
    }

    public static void sendAddUserEmailText() {
        sendKeys(addUserEmailText, TestData.fakeEmail);
    }

    public static void clickUserDeletButton() {
       clickWithJs1(usersDeleteButton);
    }

    public static boolean verifyUDisplayedsersDeleteButton() {
        return  usersDeleteButton.isDisplayed();
    }

    public static void clickIdentityChecksButton() {
        click(identityChecksButton);
    }

    public static boolean verifyIdentityChecksPage() {
        return identityChecksPage.isDisplayed();
    }

    public static void clickIdentityCheckEditButton() {
       clickWithJs1(identityChecksEditButton);
    }

    public static void sendIdnetityChecksUserIdText() {
        identityChecksUserIdText.clear();
        sendKeys(identityChecksUserIdText, TestData.fakeUserId);
    }

    public static void clickIdentityCheckEditSaveButton() {
        click(identityEditSaveButton);
    }

    public static boolean verifyidentityChecksSuccesfullMesage() {
        return identityChecksSuccesfullMesage.isDisplayed();
    }

    public static void clickUsersReportButton() {
        clickWithJs1(userReportsButton);
    }

    public static boolean userReportsPageTitle() {
        return usersPageTitle.isDisplayed();
    }

    public static void sendUsersReportJObIdText() {
        userReportsJobIdText.clear();
        sendKeys(userReportsJobIdText, TestData.fakeUserId);
    }

    public static void sendUserReportsDetailText() {
        userReportsDetailsText.clear();
        sendKeys(userReportsDetailsText, TestData.fakeMessage);
    }

    public static void clickUserReportEditButton() {
        click(userReportsEditButton);
    }

    public static void sendUserReportStatusText() {
        userReportsStatusText.clear();
        sendKeys(userReportsStatusText, TestData.fakebisey);
    }

    public static void clickUserReportSaveButton() {
        click(userReportsSaveButton);
    }
}
