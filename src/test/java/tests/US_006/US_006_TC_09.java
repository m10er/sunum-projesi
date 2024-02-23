package tests.US_006;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import static pages.HomePage.footerPrivacyPolicyButton;
import static pages.HomePage.footerTermsConditionsButton;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_006_TC_09 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc09(){
        test = extent.createTest("US_001_TC_09","Footer'da Terms and conditions testi\", \"Terms and conditions sayfasina gecis yapilir");
        HomePage homePage = new HomePage(driver);


        driver.get(TestData.qaWebUrl);
        test.info("Ana sayfaya erisim saglanir");

        ReusableMethods.click(driver,footerTermsConditionsButton);
        test.info("Footer bolumunde Terms and conditions linkine tiklanir");

        String expectedUrl = TestData.qaTermsAndConditionsWebUrl;
        String actualUrl = driver.getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl,"Terms and conditions sayfasina gecis yapildigi dogrulanir");
        softAssert.assertAll();
    }
}




