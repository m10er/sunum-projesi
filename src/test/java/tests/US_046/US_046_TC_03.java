package tests.US_046;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_046_TC_03 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_03(){
        test = extent.createTest("US_046_TC_03","3-Admin le giriş yaptıktan sonra admin dashboard'un " +
                "header bölümündeki logoya tıklayarak açılan menüdeki Home linki ile site anasayfasına " +
                "gidebildiğimi dorulyabilmeliyim");

        AdminDashboardPage adminDashboardPage= new AdminDashboardPage(driver);
        test.info("Kullanici admin olarak login olur");
        AdminDashboardPage.validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        AdminDashboardPage.clickHamburgerButton();
        test.info("kullanici Dashboard linkine tiklar");
        AdminDashboardPage.clickDashboardLink();
        test.info("Kullanici headerdaki profil logoya tiklar");
        AdminDashboardPage.clickLogo();
        test.info("Kullanici Home tiklar");
        AdminDashboardPage.clickHomeLink();
        test.info("Kullanici anaSayfaya gittigini gorur.");
        String expectedUrl = "https://qa.jobexplorerpro.com/";
        String actualUrl=driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl,"Sitenin ana sayfasina gittigini gorur.");

        softAssert.assertAll();
    }



}
