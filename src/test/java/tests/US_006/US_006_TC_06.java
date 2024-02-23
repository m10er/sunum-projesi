package tests.US_006;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import static pages.HomePage.footerContactPageButton;
import static pages.HomePage.footerYoutubeButton;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_006_TC_06 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc06(){
        test = extent.createTest("US_001_TC_06","Footer'da Contact Page testi\", \"Contact sayfasina gecis yapilir");
        HomePage homePage = new HomePage(driver);



        driver.get(TestData.qaWebUrl);
        test.info("Ana sayfaya erisim saglanir");

        ReusableMethods.click(driver,footerContactPageButton);
       test.info("Footer bolumunde Contact linkine tiklanir");

        String expectedUrl = TestData.qaContactWebUrl;
        String actualUrl = driver.getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl,"Contact sayfasina gecis yapildigi dogrulanir");
        softAssert.assertAll();
    }
}




