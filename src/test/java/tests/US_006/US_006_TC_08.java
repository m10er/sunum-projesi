package tests.US_006;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import static pages.HomePage.footerHelpFaqButton;
import static pages.HomePage.footerPrivacyPolicyButton;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_006_TC_08 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc08(){
        test = extent.createTest("US_001_TC_08","Footer'da Privacy Policy testi\", \"Privacy Policy sayfasina gecis yapilir");
        HomePage homePage = new HomePage(driver);


       driver.get(TestData.qaWebUrl);
       test.info("Ana sayfaya erisim saglanir");

        ReusableMethods.click(driver,footerPrivacyPolicyButton);
        test.info("Footer bolumunde Privacy Policy linkine tiklanir");

        String expectedUrl = TestData.qaPrivacyPolicyWebUrl;
        String actualUrl = driver.getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl,"Privacy Policy sayfasina gecis yapildigi dogrulanir");
        softAssert.assertAll();
    }
}




