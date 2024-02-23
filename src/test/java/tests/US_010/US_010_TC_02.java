package tests.US_010;

import org.testng.annotations.Test;
import pages.UserHomePage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_010_TC_02 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc02(){
        test = extent.createTest("Kullanici ana sayfada header bolumunde home button testi","Kullanici ana sayfada header bolumunde home button gorunur ve aktif olmali");
        UserHomePage userHomePage = new UserHomePage(driver);

        UserHomePage.getLogin();
        test.info("Gecerli mail ve sifre ile login olur");

        softAssert.assertTrue(UserHomePage.verifyDisplayedUserPageHeaderHomeButton());
        UserHomePage.clickUserPageHeaderHomeButton();

        softAssert.assertTrue(UserHomePage.verifyDisplayedLogoInHeader());

        UserHomePage.clickUserPageHeaderLogo();

        String expectedUrl = TestData.qaWebUrl;
        String actualUrl = driver.getCurrentUrl();
        test.info("Home butonun yeniden ana sayfaya yonlendirdigi dogrulanir");
        softAssert.assertEquals(actualUrl,expectedUrl,"Home butonun yeniden ana sayfaya yonlendirdigi dogrulanir");
        softAssert.assertAll();
    }

}
