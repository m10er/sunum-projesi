package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.TestData;

import java.awt.*;

public class AdminMoneyPage extends AdminLoginPage{

        public AdminMoneyPage(WebDriver driver) {
                super(driver);
        }


        @FindBy(xpath = "//*[@class='hamburger btn-link']") public static  WebElement hamburgerMenuButton;
        @FindBy(xpath = "//span[text()='Money']") public static  WebElement moneyMenuBotton;
        @FindBy(xpath = "//span[text()='Transactions']") public  static  WebElement transactionMenuLink;
        @FindBy(xpath = "//div[@role='status']") public static  WebElement isimSayisiMetin;
        @FindBy(xpath = "(//*[@title='View'])[1]") public static   WebElement transactionsViewLink;
        @FindBy(xpath = "//*[text()='Return to List']") public static   WebElement returnToListLink;
        @FindBy(xpath ="//span[@class='icon voyager-receipt']" ) public static  WebElement invoicesLink;
        @FindBy(xpath ="//*[@href='#33-dropdown-element']" ) public  static WebElement taxesButton;
        @FindBy(xpath ="//span[text()='Taxes']" ) public static  WebElement taxesparentLink;
        @FindBy(xpath = "//div[@class='show-res']") public  static  WebElement faturaSayisiMetin;
        @FindBy(xpath = "(//a[@class='btn btn-sm btn-warning pull-right view'])[4]") public  static  WebElement invoicesViewLink;
        @FindBy(xpath = "//*[text()='Invoice From']") public  static  WebElement invoiceFromText;
        @FindBy(xpath = "//div[@role='status']") public  static  WebElement taxSayisiMetin;
        @FindBy(xpath = "//span[text()='Add New']") public  static  WebElement taxAddNewButton;
        @FindBy(xpath = "//input[@name='name']") public static   WebElement taxNameKutusu;
        @FindBy(xpath = "//input[@name='percentage']") public  static  WebElement taxPercentageKutusu;
        @FindBy(xpath = "//label[text()='Exclusive']") public  static  WebElement taxExclusiveSecimi;
        @FindBy(xpath = "//select[@class='form-control select2-ajax select2-hidden-accessible']")
        public static  WebElement taxCountryDropdown;
        @FindBy(xpath = "//button[text()='Save']") public  static WebElement taxSaveButton;
        @FindBy(xpath = "(//span[text()='View'])[1]") public static  WebElement taxNewTaxViewLink;
        @FindBy (xpath = "//span[text()='Return to List']") public  static  WebElement taxReturnLink;
        @FindBy (xpath = "(//a[@title='Edit'])[1]") public  static  WebElement taxEditLink;
        @FindBy(xpath = "//*[text()='Inclusive']") public  static  WebElement taxEditInclusive;
        @FindBy (xpath = "(//button[@type='submit'])[2]") public  static  WebElement taxEditSaveButton;
        @FindBy(xpath = "(//span[text()='Delete'])[1]") public  static WebElement taxDeleteButton;
        @FindBy(xpath = "//span[text()='Countries']") public static  WebElement countriesLink;
        @FindBy(xpath = "//div[@role='status']") public static  WebElement ulkeSayisiMetin;
        @FindBy(xpath = "(//a[@title='View'])[1]") public  static WebElement ulkeViewLinki;
        @FindBy(xpath = "//span[text()='Return to List']") public  static  WebElement ulkeReturntoListLink;
        @FindBy (xpath = "//*[@id='27-dropdown-element']/div/ul/li[1]/a/span[2]")
        public static WebElement subscriptionsButton;
        @FindBy (xpath = "//*[@class='page-title']")
        public static WebElement subscriptionsTitle;


        @FindBy (xpath = "//*[@class='hamburger btn-link']")
        public static WebElement hamburgerButton;

        @FindBy (xpath = "//span[text()='Money']")
        public static WebElement moneyButton;


        @FindBy (xpath = "//*[@class='btn btn-success btn-add-new']")
        public static  WebElement subscriptionsAddNewButton;

        @FindBy (xpath = "//input[@class='form-control']")
        public static  WebElement subscriptiosnUserIdText;

        @FindBy (xpath = "(//input[@class='form-control'])[2]")
        public  static WebElement subscriptonsJobIdText;

        @FindBy (xpath = "//button[contains(@class,'btn btn-primary')]")
        public static  WebElement subscriptionSaveButton;

        @FindBy (xpath = "//*[@id='toast-container']/div/div")
        public static  WebElement subscriptionsSuccesfullMesage;

        @FindBy (xpath = "//a[@title='Edit']")
        public static  WebElement subscriptionsEditButton;

        @FindBy (xpath = "(//*[@class='btn btn-sm btn-danger pull-right delete'])[1]")
        public  static WebElement subscriptionDeleteButton;

        @FindBy (xpath = "//*[@class='btn btn-danger pull-right delete-confirm']")
        public  static WebElement yesDeleteButton;

        @FindBy (xpath = "//*[@id='toast-container']/div/div")
        public static  WebElement deleteSuccesfullMesage;

        @FindBy(xpath = "(//input[@class='form-control'])[3]")
        public static WebElement planId;
        @FindBy(xpath = "//input[@placeholder='Paypal ID']")
        public static WebElement paypalId;

        @FindBy(xpath = "//input[@placeholder='Paypal Plan ID']")
        public static WebElement paypalPlanId;
        @FindBy(xpath = "//input[@placeholder='Ccbill Id']")
        public static WebElement ccbrilId;
        @FindBy(xpath = "//input[@placeholder='Stripe ID']")
        public static WebElement stripId;
        @FindBy(xpath = "//input[@placeholder='Type']")
        public static WebElement type;

        @FindBy(xpath = "//input[@type='submit']")
        public static WebElement yesDeletItButton;
        @FindBy(xpath = "(//span[@class='icon voyager-credit-card']/following-sibling::span)[2]")
        public static WebElement taxesChildLInk;

        @FindBy(xpath = "(//*[.='Successfully Deleted Tax'])[1]")
        public static WebElement succesDeletMessage;
        public static void sendSInfoText() {

                sendKeys(subscriptiosnUserIdText, TestData.fakeUserId);
                sendKeys(subscriptonsJobIdText, TestData.fakeUserId);
                sendKeys(planId, TestData.fakeUserId);
                sendKeys(paypalId, TestData.fakeUserId);
                sendKeys(paypalPlanId, TestData.fakeUserId);
                sendKeys(ccbrilId, TestData.fakeUserId);
                sendKeys(stripId,TestData.fakeUserId);
                sendKeys(type, TestData.fakeName);

        }

        public static void clickSubscriptionsButton() {
                clickWithJs1(subscriptionsButton);
        }


        public static boolean verifySubscriptionTitle() {
                return  subscriptionsTitle.isDisplayed();
        }

        public static void clickAddNewButton() {
                click(subscriptionsAddNewButton);
        }

        public static void sendSubscriptionUserIdText() {
                subscriptiosnUserIdText.clear();
                sendKeys(subscriptiosnUserIdText, TestData.fakeUserId);
        }

        public static void sendSubscriptionJobIdText() {
                subscriptonsJobIdText.clear();
                sendKeys( subscriptonsJobIdText, TestData.skillId);
        }

        public static void clickSubscriptionSaveButton() {
                click(subscriptionSaveButton);
        }

        public static boolean verifySuccessSubsciptionMessages() {
                return subscriptionsSuccesfullMesage.isDisplayed();
        }

        public static void clickSubscriptionEdit() {
                click(subscriptionsEditButton);
        }

        public static void sendKSubscriptionUserIdTExt() {
                subscriptiosnUserIdText.clear();
                sendKeys(subscriptiosnUserIdText, TestData.fakeUserId);
        }

        public static void clickSubscriptionsDeletButton() {
                click(subscriptionDeleteButton);
        }

        public static void clickSubscriptionsYesDeletButton() {
                click(yesDeleteButton);
        }

        public static boolean verifySubscriptionsSuccessDeletMessage() {
                return deleteSuccesfullMesage.isDisplayed();
        }


        public static void clickMOneyMenuButton() {
                click(moneyMenuBotton);
        }

        public static void clickTransactionMenuLink() {
                click(transactionMenuLink);
        }

        public static boolean verifyDisplayedIsimSaysiMetin() {
                return isimSayisiMetin.isDisplayed();
        }

        public static void clickTransactionViewLInk() {
                click(transactionsViewLink);
        }

        public static boolean verifyDisplayedtaxReturnLink() {
                return taxReturnLink.isDisplayed();
        }

        public static void clickInvoicesLInk() {
                click(invoicesLink);
        }

        public static boolean verifyDisplayedfaturaSayisiMetin() {
                return faturaSayisiMetin.isDisplayed();
        }

        public static void clickInvoicesViewLink() {
                click(invoicesViewLink);
        }

        public static boolean verifyDisplayedinvoiceFromText() {
                return invoiceFromText.isDisplayed();
        }

        public static void clickTaxesLink() {
                click(taxesparentLink);
        }

        public static void clickTaxesChildLink() {
                click(taxesChildLInk);
        }

        public static boolean verifyDisplaytaxesSayisimetin() {
                return taxSayisiMetin.isDisplayed();
        }

        public static void clickTaxAddNewButton() {
                clickWithJs1(taxAddNewButton);
        }

        public static void sendTaxNameKutusu() {
                taxNameKutusu.clear();
                sendKeys(taxNameKutusu, "NewTax");
        }

        public static void sendTaxPercentageKutusu() {
                taxPercentageKutusu.clear();
                sendKeys(taxPercentageKutusu, "20");
        }

        public static void clickTaxExclusiveSecimi() {
                click(taxExclusiveSecimi);
                Select selectAll = new Select(taxCountryDropdown);
                selectAll.selectByValue("1");
        }

        public static void clickTaxSaveButton() {
                click(taxSaveButton);
        }

        public static boolean verifyDisplayTAxAddNewButton() {
                return taxAddNewButton.isDisplayed();
        }

        public static void clickTAxNewTaxLink() {
                click(taxNewTaxViewLink);
        }

        public static void clickTaxEditLink() {
                click(taxEditLink);
        }

        public static void clickTaxEditInclusive() {
                click(taxEditInclusive);
        }

        public static void clickTaxEdiSaveButton() {
                click(taxEditSaveButton);
        }

        public static void clickTaxDeletebutton() {
        click(taxDeleteButton);
        }

        public static void clickYesDeletItButton() {
                click(yesDeletItButton);
        }

        public static boolean verifySuccesDeletMessage() {
                return succesDeletMessage.isDisplayed();
        }

        public static void clickCountriesLink() {
                click(countriesLink);
        }

        public static boolean verifyUlkeSayisiMetin() {
                return  ulkeSayisiMetin.isDisplayed();
        }

        public static void clickUlkeViewLink() {
                click(ulkeViewLinki);
        }

        public static boolean verifyUlkeReturntoListLink() {
                return ulkeReturntoListLink.isDisplayed();
        }
}


