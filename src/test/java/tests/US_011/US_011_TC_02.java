package tests.US_011;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchAJobPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_011_TC_02 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_02(){
        test = extent.createTest("US_011_TC_02","2- Kullanici olarak Search Job butonuna tıklayınca " +
                "iş arama formunu görüntüleyebilmeliyim");

        HomePage homePage= new HomePage(driver);
        HomePage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        test.info("Kullanici 'search a job' butonuna tiklar");
        HomePage.clicksearchaJobButton();
        test.info("kullanici is arama formuna ulasir");

        String expectedUrl = TestData.qaSearchJobWebUrl;
        String actualUrl = driver.getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl, "Is arama formuna ulasir");

        softAssert.assertAll();
    }



}
