package tests.US_045;


import org.testng.annotations.Test;
import pages.AdminNewsletterEmails;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_045_TC_02 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_02(){
        test = extent.createTest("US_045_TC_02","2-Haber aboneleri sayfasındaki haber abonesi sayısını ve " +
                "haber abonlerini görünütleyebildiğimi doğrulyabilmeliyim");

        AdminNewsletterEmails adminNewsletterEmails= new AdminNewsletterEmails(driver);
        test.info("Kullanici admin olarak login olur");
        AdminNewsletterEmails.validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        AdminNewsletterEmails.clickHamburgerButton();
        test.info("Kullanici Newsletter Emails linkine tiklar");
        AdminNewsletterEmails.clickNewsletterEmail();
        test.info("Kullanici tablo altindaki sayilari gorur");
        softAssert.assertTrue(AdminNewsletterEmails.verifyDisplayedNumberNewsletterEmail(), "Newsletter Email sayilarini gorur");
        softAssert.assertAll();
    }



}
