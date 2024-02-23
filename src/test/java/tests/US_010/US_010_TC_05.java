package tests.US_010;

import org.testng.annotations.Test;
import pages.UserHomePage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_010_TC_05 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc05(){
        test = extent.createTest("Kullanici ana sayfada header bolumunde search job button testi","Kullanici ana sayfada header bolumunde search job button gorunur ve aktif olmali");
        UserHomePage userHomePage = new UserHomePage(driver);

        UserHomePage.getLogin();
        test.info("Gecerli mail ve sifre ile login olur");


        softAssert.assertTrue(UserHomePage.verifyDisplayeduserPageHeaderPostJobButton());

        UserHomePage.clickUserPageHeaderPostJobButton();


        String expectedUrl = TestData.qaPostJobWebUrl;
        String actualUrl = driver.getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl,"Post job butonun post job sayfasina yonlendirdigi dogrulanir");
        softAssert.assertAll();

    }

}
