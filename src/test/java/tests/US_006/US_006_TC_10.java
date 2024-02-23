package tests.US_006;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import static pages.HomePage.footerDarkButton;
import static pages.HomePage.footerTermsConditionsButton;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_006_TC_10 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc10(){
        test = extent.createTest("US_001_TC_10","Footer'da Dark & Light buton testi\", \"Dark sayfaya gecis yapilir");
        HomePage homePage = new HomePage(driver);

        driver.get(TestData.qaWebUrl);
        test.info("Ana sayfaya erisim saglanir");

        ReusableMethods.click(driver,footerDarkButton);
        test.info("Footer bolumunde Dark linkine tiklanir");
        softAssert.assertAll();
    }
}




