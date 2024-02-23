package tests.US_010;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserHomePage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_010_TC_01 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc01(){
        test = extent.createTest("Kullanici ana sayfada logo testi","Kullanici ana sayfada header bolumunde logo gorunur ve aktif olmali");
        UserHomePage userHomePage = new UserHomePage(driver);

        UserHomePage.getLogin();
        test.info("Gecerli mail ve sifre ile login olur");

        softAssert.assertTrue(UserHomePage.verifyDisplayedLogoInHeader());

        UserHomePage.clickUserPageHeaderLogo();




        String expectedUrl = TestData.qaWebUrl;
        String actualUrl = driver.getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl,"Logonun yeniden ana sayfaya yonlendirdigi dogrulanir");
        softAssert.assertAll();
    }

}
