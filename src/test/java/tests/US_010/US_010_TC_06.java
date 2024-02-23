package tests.US_010;

import org.testng.annotations.Test;
import pages.UserHomePage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_010_TC_06 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc06(){
        test = extent.createTest("Kullanici ana sayfada header bolumunde FAQ button testi","Kullanici ana sayfada header bolumunde FAQ button gorunur ve aktif olmali");
        UserHomePage userHomePage = new UserHomePage(driver);

        UserHomePage.getLogin();
        test.info("Gecerli mail ve sifre ile login olur");

        softAssert.assertTrue(UserHomePage.verifyDisplayeduserPageHeaderFaqButton());
        UserHomePage.clickuserPageHeaderFaqButton();

        String expectedUrl = TestData.qaHelpFaqWebUrl;
        String actualUrl = driver.getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl,"FAQ butonun FAQ sayfasina yonlendirdigi dogrulanir");
        softAssert.assertAll();


    }

}
