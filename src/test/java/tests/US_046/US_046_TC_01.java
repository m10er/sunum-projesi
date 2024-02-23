package tests.US_046;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.AdminNewsletterEmails;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_046_TC_01 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_046_TC_01","1-Admin le giriş yaptıktan sonra admin dashboard'un header bölümündeki" +
                " logoya tıklayarak açılan menüyü görüntleyebildiğimi doğrulayabilmeliyim");

        AdminDashboardPage adminDashboardPage= new AdminDashboardPage(driver);
        test.info("Kullanici admin olarak login olur");
        AdminDashboardPage.validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        AdminDashboardPage.clickHamburgerButton();
        test.info("kullanici Dashboard linkine tiklar");
        AdminDashboardPage.clickDashboardLink();
        test.info("Kullanici headerdaki profil logoya tiklar");
        AdminDashboardPage.clickLogo();
        test.info("Kullanici profil detaylarini gorur");
        softAssert.assertTrue(AdminDashboardPage.verifylogoDisplayDetail());
        test.info("Kullanici profili kaydet tusuna tiklar");


        softAssert.assertAll();
    }



}
