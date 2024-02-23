package tests.US_043;


import org.testng.annotations.Test;
import pages.AdminFeaturedClients;
import pages.HomePage;
import testBase.BaseClass;
import utilities.TestData;

import static pages.AdminFeaturedClients.*;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;


public class US_043_TC_05 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_05(){
        test = extent.createTest("US_043_TC_05","5-Öne çıkarılan müşterinin logosunu homepage sayfasının body kısmında " +
                "görüntüleyebildiğimi doğrulyabilmeliyim");


        HomePage homePage = new HomePage(driver);
        test.info("kullanici home page sayfasina gider");

        driver.get(TestData.qaWebUrl);
        test.info("homepage sayfasinda yukledigi logonun gorunur oldugunu gorur");

        softAssert.assertTrue(HomePage.verifyMyLogo(TestData.fakeName),"Anasayfada body de logoyu gorur");
        softAssert.assertAll();


    }



}
