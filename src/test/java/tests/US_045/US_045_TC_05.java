package tests.US_045;


import org.testng.annotations.Test;
import pages.AdminNewsletterEmails;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_045_TC_05 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_05(){
        test = extent.createTest("US_045_TC_05","5-Kendi eklediğim haber abonesinin bilgilerini düzenleyebildiğimi ve" +
                " aboneyi silebildiğimi doğrulyabilmeliyim");

        AdminNewsletterEmails adminNewsletterEmails= new AdminNewsletterEmails(driver);
        test.info("Kullanici admin olarak login olur");
        AdminNewsletterEmails.validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        AdminNewsletterEmails.clickHamburgerButton();
        test.info("Kullanici Newsletter Emails linkine tiklar");
        AdminNewsletterEmails.clickNewsletterEmail();
        test.info("Kullanici Edit butonuna tiklar");
        AdminNewsletterEmails.clickEditNewsletterButton();
        test.info("KUllanici yeni bir email girer");
        AdminNewsletterEmails.sendEmailEditText(TestData.fakeEmail);
        test.info("Kullanici save butonuna tiklar");
        AdminNewsletterEmails.clickEditSaveButton();
        test.info("Kullanici succes mesajini gorur");
        softAssert.assertTrue(AdminNewsletterEmails.verifyDisplaySuccesUpdateMessage(), "DEgisikligin basarili oldugu mesajini gorur");
        test.info("Kullanici yeni kayit ettigi mesaj satirindaki Delet butonuna tiklar");
        AdminNewsletterEmails.clickDeleteNewsletterButton();
        test.info("KUllanici gelen mesaji Yes Delet it olarak cavaplar");
        AdminNewsletterEmails.clickYesDeletItButton();
        test.info("Kullanici succes mesajini goruntuler");
        softAssert.assertTrue(AdminNewsletterEmails.verifyDisplayedSuccessDeletMessage(),"Silme isleminin basarili oldugnu gosteren mesaji gorur");
        softAssert.assertTrue(AdminNewsletterEmails.verifyDisplayedNumberNewsletterEmail(), "Kaydettigi emaili sildigini gorur");
        softAssert.assertAll();
    }



}
