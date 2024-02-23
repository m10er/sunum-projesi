package tests.US_006;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import static pages.HomePage.footerTwitterButton;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_006_TC_03 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc03(){
        test = extent.createTest("US_001_TC_03","Footer'da twitter testi\", \"twitter sayfasina gecis yapilir");
        HomePage homePage = new HomePage(driver);
        driver.get(TestData.qaWebUrl);
        test.info("Ana sayfaya erisim saglanir");

        ReusableMethods.click(driver, HomePage.footerTwitterButton);
        test.info("Footer bolumunde twitter linkine tiklanir");

        ReusableMethods.titleIleWindowDegistir(driver, TestData.twitterTitle);

        String expectedUrl = TestData.twitterUrl;
        String actualUrl = driver.getCurrentUrl();
        test.info("Facebook sayfasina gecis yapildigi dogrulanir");

        softAssert.assertEquals(actualUrl,expectedUrl,"Twitter sayfasina gecis yapildigi dogrulanir");
        softAssert.assertAll();
    }
}




