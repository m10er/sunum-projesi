package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.TestData;

public class AdminJobsPage extends AdminLoginPage{

    public AdminJobsPage(WebDriver driver) {
        super(driver);
    }

    // Ugur'un aldigi locate'ler :
    @FindBy(xpath = "//*[@class='hamburger btn-link']")

    public static WebElement hamburgerButonu ;

    @FindBy(xpath = "(//*[@data-toggle='collapse'])[1]")
    public static  WebElement jobsParentButonu;

    @FindBy(xpath = "(//*[@class='icon voyager-book'])[1]")
    public static  WebElement jobsChildButonu;

    @FindBy(xpath = "//*[@class='btn btn-success btn-add-new']")
    public static  WebElement jobsAddNewButonu;

    @FindBy(xpath = "//*[@name='user_id']")
    public  static WebElement jobsUserIdTextBox;

    @FindBy(xpath = "//*[@name='company_id']")
    public static  WebElement jobsCompanyIdTextBox;

    @FindBy(xpath = "//*[@name='category_id']")
    public static  WebElement jobsCategoryIdTextBox;

    @FindBy(xpath = "//*[@name='title']")
    public static  WebElement jobsTitleTextBox;

    @FindBy(xpath = "//*[@name='slug']")
    public static  WebElement jobsSlugTextBox;

    @FindBy(xpath = "//*[@name='status']")
    public static  WebElement jobsStatusTextBox;

    @FindBy(xpath = "//*[@name='type']")
    public static  WebElement jobsTypeTextBox;

    @FindBy(xpath = "//*[@name='description']")
    public static  WebElement jobsDescriptionTextBox;

    @FindBy(xpath = "//*[@name='salary']")
    public static  WebElement jobsSalaryTextBox;

    @FindBy(xpath = "//*[@name='location']")
    public static  WebElement jobsLocationTextBox;

    @FindBy(xpath = "//*[@name='application_link']")
    public static WebElement jobsApplicationLinkTextBox;

    @FindBy(xpath = "//*[@class='btn btn-primary save']")
    public static  WebElement jobsSaveButonu;

    @FindBy(xpath = "//*[@class='icon voyager-images']")
    public static  WebElement mediaButonu;

    @FindBy(xpath = "(//*[@data-toggle='collapse'])[1]")
    public static  WebElement jobsMenuButonu ;

    @FindBy(xpath = "//*[@id=\"41-dropdown-element\"]/div/ul/li[2]/a")
    public static  WebElement jobsCategoriesButonu;

    public static boolean verifyDisplayedMediaButton(){
    return mediaButonu.isDisplayed();
}
    public static boolean verifyJObsMenuButton(){
    return  jobsMenuButonu.isDisplayed();
}

    public static void clickJObsMenuButton(){
      click(jobsMenuButonu);
    }
    public static void clickJobsMedaButton(){
    click(mediaButonu);
    }





    // Orkun'un aldigi locate'ler :

    @FindBy (xpath = "(//li[@class='dropdown']//span)[2]")
    public static  WebElement jobsButton;


    //Skills locate alinamiyor

    @FindBy(xpath = "//*[@class='hamburger btn-link']")
    public  static WebElement hamburgersButton;

    @FindBy(xpath = "//span[@class='icon voyager-javascript']/following-sibling::span[1]")
    public static  WebElement skillsButton;

    @FindBy(xpath = "btn btn-success btn-add-new")
    public static  WebElement skillsAddButton;

    @FindBy(xpath = "//*[span='Add New']")
    public static  WebElement AddNewButton;

    @FindBy(xpath = "//*[@class='form-control']")
    public static  WebElement AddNewsNameKutusu;

    @FindBy(xpath = "//*[@class='btn btn-primary save']")
    public static  WebElement AddNewSaveButonu;

    @FindBy(xpath = "//*[@class='page-title']")
    public static  WebElement jsSkillElementi;

    @FindBy(xpath = "(//a[contains(@class,'btn btn-sm')])[2]")
    public  static  WebElement editButton;

    @FindBy(xpath = "//*[@class='form-control']")
    public  static WebElement editNameBox;

    @FindBy(xpath = "(//*[@type='checkbox'])[1]")
    public static  WebElement skillsEditlendiginiGoruntuleText;

    @FindBy (xpath = "(//*[@class='hidden-xs hidden-sm'])[1]")
    public static  WebElement skillsDeleteButton;

    @FindBy(xpath = "(//*[@class='btn btn-danger pull-right delete-confirm'])[1]")
    public static  WebElement yesDeleteButton;

    @FindBy(xpath = "//*[@role='status']")
    public  static WebElement silinenYetenegiDogrulamaElementi;

    @FindBy(xpath = "//*[@class='icon voyager-people']")
    public  static WebElement applicantsRangerMenu;

    @FindBy(xpath = "//*[@class='page-title']")
    public static  WebElement applicantsMenuElementi;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public  static WebElement applicantsNameBox;

    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public static  WebElement applicantsMinRangeBox;

    @FindBy(xpath = "(//*[@class='form-control'])[3]")
    public static  WebElement applicantsMaxRangeBox;

    @FindBy(xpath = "//*[@class='pull-left']")
    public  static WebElement applicantsGoruntulemeElementi;

    @FindBy(xpath = "(//*[@class='icon voyager-dollar'])[1]")
    public static  WebElement salaryRangersTikla;

    @FindBy(xpath = "//*[@class='form-control']")
    public static  WebElement rangeBox;

    @FindBy(xpath = "//*[@class='icon voyager-calendar']")
    public static  WebElement jobsTypeTikla;

    @FindBy(xpath = "//*[@class='page-title']")
    public  static WebElement jobsTypeGorunurElementi;

    @FindBy(xpath = "//*[@class='icon voyager-tag']")
    public static  WebElement jobsSkillTikla;

    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public static  WebElement skillIdBox;

    @FindBy(xpath = "//input[@class='form-control']")
    public static WebElement jobId;
    public static void clickSkillsButton() {
        click(skillsButton);
    }

    public static boolean verifyDisplayedAddNewButton() {
        return AddNewButton.isDisplayed();
    }
    public static void clickJobsParentButton(){
        click(jobsButton);
    }

    public static void clickAddNewButton() {
        clickWithJs1(AddNewButton);
    }

    public static void sendAddNewsNameKutusu() {
        sendKeys(AddNewsNameKutusu, TestData.fakeName);
    }

    public static boolean verifyDisplayedJsSkillElementi() {
        return jsSkillElementi.isDisplayed();
    }

    public static void clickAdnewSaveButton() {
        click(AddNewSaveButonu);
    }

    public static void clickEditButton() {
        clickWithJS2(editButton);
    }

    public static void sendEditNameBox() {
        editNameBox.clear();
        sendKeys(editNameBox,TestData.fakeSkills);
    }

    public static void clickAddNewSaveButton() {
        click(AddNewSaveButonu);
    }

    public static boolean skillsEditlendiginiGoruntuleText() {
        return  skillsEditlendiginiGoruntuleText.isDisplayed();
    }

    public static void clickSkillDeleteButton() {
        click(skillsDeleteButton);
    }

    public static void applicantsRangerMenu() {
        click(applicantsRangerMenu);
    }

    public static void applicationsMenuElement() {
        click(applicantsMenuElementi);
    }

    public static boolean verifyADisplayedApplicantsMenuElementi() {
        return applicantsMenuElementi.isDisplayed();
    }

    public static void sendApllicantsMinRangeBox() {
        applicantsMinRangeBox.clear();
        sendKeys(applicantsMinRangeBox, TestData.applicantsRangeMin);
    }

    public static void sendApplicantssMaxRangeBox() {
        sendKeys(applicantsMaxRangeBox, TestData.applicantsRangeMax);
    }

    public static boolean verifyDisplayedapplicantsGoruntulemeElementi() {
        return applicantsGoruntulemeElementi.isDisplayed();
    }

    public static void clickYesDeleteButton() {
        click(yesDeleteButton);
    }

    public static boolean silinenYetenegiDogrulamaElementi() {
        return silinenYetenegiDogrulamaElementi.isDisplayed();
    }

    public static void clickSalaryRangers() {
        click(salaryRangersTikla);
    }

    public static void sendRangeBox() {
    sendKeys(rangeBox, TestData.applicantsRangeMax);
    }

    public static boolean verifyJSkillElementi() {
        return jsSkillElementi.isDisplayed();
    }

    public static void clickJobsType() {
        click(jobsTypeTikla);
    }

    public static boolean jobsTypeGorunurluk() {
        return jobsTypeGorunurElementi.isDisplayed();
    }

    public static boolean skillsEditlendiginiGoruntuleTex() {
        return  skillsEditlendiginiGoruntuleText.isDisplayed();
    }

    public static void clickJobskill() {
        click(jobsSkillTikla);
    }

    public static void sendSkillIdBox(String skillID) {
        skillIdBox.clear();
        sendKeys(skillIdBox,skillID);
    }


    public static void clickJObsChildButton() {
        click(jobsChildButonu);
    }

    public static void sendJobId(String id) {
        sendKeys( jobId, id);

    }
}
