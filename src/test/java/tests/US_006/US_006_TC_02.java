package tests.US_006;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_006_TC_02 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc02(){
        test = extent.createTest("US_001_TC_02","Footer'da facebook testi\", \"facebook sayfasina gecis yapilir");
        HomePage homePage = new HomePage(driver);
        driver.get(TestData.qaWebUrl);
        test.info("Ana sayfaya erisim saglanir");

        HomePage.clickfoooterFacebookButton();
        test.info("Footer bolumunde facebook linkine tiklanir");
        ReusableMethods.switchToWindowWithTitle(driver, TestData.facebookTitle);


        String expectedURl = TestData.facebookUrl;
        String actualUrl = driver.getCurrentUrl();
        test.info("Facebook sayfasina gecis yapildigi dogrulanir");

        softAssert.assertEquals(actualUrl,expectedURl,"Facebook sayfasina gecis yapildigi dogrulanir");
        softAssert.assertAll();
    }
}
