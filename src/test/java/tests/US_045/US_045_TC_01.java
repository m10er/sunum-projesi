package tests.US_045;


import org.testng.annotations.Test;
import pages.AdminFeaturedCategories;
import pages.AdminNewsletterEmails;
import testBase.BaseClass;

import static pages.AdminFeaturedCategories.clickFeaturedCategoriesLink;
import static pages.AdminLoginPage.clickHamburgerButton;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_045_TC_01 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_045_TC_01","1-Admin olarak giriş yapınca sol menüde yer alan Newsletter Emails " +
                "menüsü ile haber abonelerinin bulunduğu sayfayı görüntüleyebildiğimi doğrulyabilmeliyim");

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
