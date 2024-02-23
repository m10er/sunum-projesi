package tests.US_004;


import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_004_TC_01  extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_001_TC_01","Bir ziyaretçi olarak Home page sayfasının \n" +
                "header bölümündeki Search for Job menüsü ile\n" +
                " iş arama sayfasına ulaşıp iş arayıp sonuçları \n" +
                "görüntüleyebilmeliyim");

        HomePage homePage =new HomePage(driver);
        test.info("1- Bir browser acilmali");
        HomePage.getHomePage();
        String expectedUrl= TestData.qaWebUrl;
        test.info("2- Takip edilen linke tiklanmali https://qa.jobexplorerpro.com/");
        String actualUrl=driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        test.info("3- Ilgili sayfaya giris yapilabilmelidir");
        HomePage.clickSearchJobMenuLink();
        test.info("4- Search Job alanina giris yapilabilmeliyim");

        test.info("/5- Arama kriterlerini girebilmeli ve Search butonuna tikladigimda arama sonuclarini goruntuleyebilmeliyim");


        softAssert.assertAll();
    }



    }

