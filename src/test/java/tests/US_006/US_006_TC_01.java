package tests.US_006;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.AdminContactMessagesPage;
import pages.BasePage;
import pages.HomePage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_006_TC_01 extends BaseClass {


        @Test(groups = {"e2e","regression"})
        public void tc_01(){
            test = extent.createTest("US_001_TC_01","Footer'da Logo testi");

           HomePage homePage = new HomePage(driver);

        test.info("Ana sayfaya erisim saglanir");
        driver.get(TestData.qaWebUrl);

        HomePage.clickFooterLogo();
        test.info("Footer bolumunde Logoya tiklanir");

        String expectedUrl = TestData.qaWebUrl;
        String actualUrl = driver.getCurrentUrl();
            test.info("Logonun yeniden ana sayfaya yonlendirdigi dogrulanir");

        softAssert.assertEquals(actualUrl,expectedUrl,"Logonun yeniden ana sayfaya yonlendirdigi dogrulanir");

        softAssert.assertAll();
    }

}
