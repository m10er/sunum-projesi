package tests.US_006;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import static pages.HomePage.footerYoutubeButton;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_006_TC_05 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc05(){
        test = extent.createTest("US_001_TC_05","Footer'da youtube testi\", \"youtube sayfasina gecis yapilir");
        HomePage homePage = new HomePage(driver);


        driver.get(TestData.qaWebUrl);
        test.info("Ana sayfaya erisim saglanir");

        ReusableMethods.click(driver, footerYoutubeButton);
        test.info("Footer bolumunde youtube linkine tiklanir");

        ReusableMethods.titleIleWindowDegistir(driver,TestData.youtubeTitle);
        String expectedTitle = TestData.youtubeTitle;
        String actualTitle = driver.getTitle();

        softAssert.assertEquals(actualTitle,expectedTitle,"Youtube sayfasina gecis yapildigi dogrulanir");
        softAssert.assertAll();

    }
}




