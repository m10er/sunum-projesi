package tests.US_045;


import org.testng.annotations.Test;
import pages.AdminNewsletterEmails;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_045_TC_04 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_04(){
        test = extent.createTest("US_045_TC_04","4-Add new butonu ile yeni haber abonesi ekleme sayfasını " +
                "görüntüleyebildiğimi doğrulyabilmeliyim");

        AdminNewsletterEmails adminNewsletterEmails= new AdminNewsletterEmails(driver);
        test.info("Kullanici admin olarak login olur");
        AdminNewsletterEmails.validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        AdminNewsletterEmails.clickHamburgerButton();
        test.info("Kullanici Newsletter Emails linkine tiklar");
        AdminNewsletterEmails.clickNewsletterEmail();
        test.info("Kullanici addnew butonuna tiklar");
        AdminNewsletterEmails.clickAddNewButton();
        test.info("Yeni bir email yazar");
        AdminNewsletterEmails.sendEmail(TestData.fakeEmail);
        test.info("Save butonuna tiklar");
        AdminNewsletterEmails.clickEditSaveButton();
        test.info("Islem sonucunun succes oldugunu gorur");
        softAssert.assertTrue(AdminNewsletterEmails.verifyDisplayedSuccessfullMessage());
        softAssert.assertTrue(AdminNewsletterEmails.verifyDisplayedNumberNewsletterEmail(), "Newsletter Email sayilarini gorur");
        softAssert.assertAll();
    }



}
