package tests.US_003;

import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_003_TC_01 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_001_TC_01","Bir ziyaretçi olarak Home page sayfasının" +
                " body bölümündeki öğelerin görünür ve fonksiyonların aktif olduğunu görüntüleyebilmeliyim");

       HomePage homePage =new HomePage(driver);
        test.info("1- Bir browser acilmali");
        HomePage.getHomePage();
        String expectedUrl= TestData.qaWebUrl;
        test.info("2- Takip edilen linke tiklanmali https://qa.jobexplorerpro.com/");
        String actualUrl=driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        test.info("3- Ilgili sayfaya giris yapilabilmelidir");

        test.info("4-  Body bolumundeki Trusted by the world's leading companies basligini goruntuleyebilmeliyim");
        softAssert.assertTrue(HomePage.verifyDisplayedParagraph());
        test.info("5- Body bolumunde yer alan View all job section ni tikladiginda  ilgili job post lara ulasabilmeliyim");

        softAssert.assertTrue(HomePage.verifyEnabledViewAllJobsButton());

        test.info("8- Popular tags alaninda yer alan tum tag leri goruntuleyebilmeli ve tiklandiginda ilgili" +
                " tag ler altindaki fonsiyonlara ulasabilmeliyim.");

        softAssert.assertTrue(HomePage.verifyDisplayedPopularTags());

        softAssert.assertAll();
    }

}



