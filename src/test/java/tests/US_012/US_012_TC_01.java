package tests.US_012;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_012_TC_01 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_012_TC_01","1-Kayıtlı kullanıcı olarak siteye giriş yaptığımda " +
                "footer bölümünü görüntüleyebilmeliyim");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        softAssert.assertTrue(HomePage.verifyDisplayFooter(), "Kullanici footeri gorur");


        softAssert.assertAll();
    }



}
