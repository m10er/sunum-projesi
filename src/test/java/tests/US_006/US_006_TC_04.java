package tests.US_006;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_006_TC_04 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc04(){
        test = extent.createTest("US_001_TC_04","Footer'da instagram testi\", \"instagram sayfasina gecis yapilir");
        HomePage homePage = new HomePage(driver);

        driver.get(TestData.qaWebUrl);
        test.info("Ana sayfaya erisim saglanir");

        ReusableMethods.click(driver, HomePage.footerInstagramButton);
        test.info("Footer bolumunde instagram linkine tiklanir");


        ReusableMethods.titleIleWindowDegistir(driver, TestData.twitterTitle);


        ReusableMethods.titleIleWindowDegistir(driver, TestData.instagramTitle);
        String expectedTitle = TestData.instagramTitle;
        String actualTitle = driver.getTitle();

        softAssert.assertEquals(actualTitle,expectedTitle,"Instagram sayfasina gecis yapildigi dogrulanir");
        softAssert.assertAll();

    }
}




