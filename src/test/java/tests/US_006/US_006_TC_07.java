package tests.US_006;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import static pages.HomePage.footerContactPageButton;
import static pages.HomePage.footerHelpFaqButton;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_006_TC_07 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc07(){
        test = extent.createTest("US_001_TC_07","Footer'da Help & FAQ testi\", \"Help & FAQ sayfasina gecis yapilir");
        HomePage homePage = new HomePage(driver);



        driver.get(TestData.qaWebUrl);
        test.info("Ana sayfaya erisim saglanir");

        ReusableMethods.click(driver,footerHelpFaqButton);
        test.info("Footer bolumunde Help & FAQ linkine tiklanir");

        String expectedUrl = TestData.qaHelpFaqWebUrl;
        String actualUrl = driver.getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl,"Help & FAQ sayfasina gecis yapildigi dogrulanir");
        softAssert.assertAll();
    }
}




