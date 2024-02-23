package tests.US_009;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;
import utilities.TestData;

import static pages.LoginPage.getLoginPage;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_009_TC_01 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc01(){
        test = extent.createTest("Post a job butonu ile uyelik olusturma testi","Header bolumunde post a job butonu ile dogru bilgilerle uyelik olusturabilmeliyim");
        HomePage homePage= new HomePage(driver);

        HomePage.getHomePage();
        test.info("Ana sayfaya erisim saglanir");

        HomePage.clickPostaJobButton();
        test.info("Header bolumunde Post a job butonuna tiklanir");

        String expectedUrl = TestData.qaLoginUrl;
        String actualUrl = driver.getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl,"Login sayfasina erisim saglandigi dogrulanir");
        test.info("\"Login sayfasina erisim saglandigi dogrulanir");


        softAssert.assertAll();
    }

}
