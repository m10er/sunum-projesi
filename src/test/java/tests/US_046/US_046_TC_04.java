package tests.US_046;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_046_TC_04 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_04(){
        test = extent.createTest("US_046_TC_04","4-Admin le giriş yaptıktan sonra admin dashboard'un header bölümündeki logoya tıklayarak açılan menüdeki logout linki ile çıkış yaparak \n" +
                "admin login sayfasına gidebildiğimi doğrulayabilmeliyim");

        AdminDashboardPage adminDashboardPage= new AdminDashboardPage(driver);
        test.info("Kullanici admin olarak login olur");
        AdminDashboardPage.validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        AdminDashboardPage.clickHamburgerButton();
        test.info("kullanici Dashboard linkine tiklar");
        AdminDashboardPage.clickDashboardLink();
        test.info("Kullanici headerdaki profil logoya tiklar");
        AdminDashboardPage.clickLogo();
        test.info("Kullanici Logout tiklar");
        AdminDashboardPage.clickLogoutButton();
        test.info("Kullanici login sayfasina gittigini gorur.");
        String expectedUrl = "https://qa.jobexplorerpro.com/admin/login";
        String actualUrl=driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl,"Sitenin ana sayfasina gittigini gorur.");

        softAssert.assertAll();
    }



}
