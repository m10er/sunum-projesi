package tests.US_011;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_011_TC_06 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_06(){
        test = extent.createTest("US_011_TC_06","6-Populer tagları görüntüleyebilmeliyim ve " +
                "tagların aktif olarak çalıştığını doğrulayabilmeliyim");

        HomePage homePage = new HomePage(driver);

        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        softAssert.assertTrue(HomePage.verifyDisplayedPopularTags());
        test.info("Kullanici popular taglerin etkin oldugunu gorur.");



        softAssert.assertAll();
    }



}
