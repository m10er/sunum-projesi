package tests.US_045;


import org.testng.annotations.Test;
import pages.AdminNewsletterEmails;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_045_TC_03 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_03(){
        test = extent.createTest("US_045_TC_03","4-Yeni haber abonesi ekleme formunu doldurarak " +
                "haber abonesi ekleyebildiğimi doğrulyabilmeliyim");

        AdminNewsletterEmails adminNewsletterEmails= new AdminNewsletterEmails(driver);
        test.info("Kullanici admin olarak login olur");
        AdminNewsletterEmails.validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        AdminNewsletterEmails.clickHamburgerButton();
        test.info("Kullanici Newsletter Emails linkine tiklar");
        AdminNewsletterEmails.clickNewsletterEmail();
        test.info("Kullanici addnew butonuna tiklar");
        AdminNewsletterEmails.clickAddNewButton();
        test.info("Yeni ekleme sayfasina ulastigini gorur");
        String expectedUrl= "https://qa.jobexplorerpro.com/admin/newsletter-emails/create";
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl,"Ekleme sayfasina ulastigini gorur");
        softAssert.assertAll();
    }



}
