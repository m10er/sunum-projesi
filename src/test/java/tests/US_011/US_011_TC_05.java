package tests.US_011;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_011_TC_05 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_05(){
        test = extent.createTest("US_011_TC_05","5-Email adresimle haber listesine abone olabilmeliyim");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");
        test.info("Kullanici mail adresini girerek Suscribe butonuna tiklar");

        softAssert.assertTrue(HomePage.verifyEmailSubscribe());
        test.info("Kullanici basari mesajini gorur.");



        softAssert.assertAll();
    }



}
