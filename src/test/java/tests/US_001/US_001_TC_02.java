package tests.US_001;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_001_TC_02 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_001_TC_01","Ziyaretçi olarak ana sayfaya erişebilmeliyim.");

        HomePage homePage = new HomePage(driver);
        test.info("1- Bir browser acilmali");
        HomePage.getHomePage();
        String expectedUrl= TestData.qaWebUrl;
        test.info("2- Takip edilen linke tiklanmali https://qa.jobexplorerpro.com/");
        String actualUrl=driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        test.info("3- Ilgili sayfaya giris yapilabilmelidir");

        softAssert.assertAll();
    }



}
