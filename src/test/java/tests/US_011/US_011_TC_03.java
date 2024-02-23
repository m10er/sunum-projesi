package tests.US_011;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;
import utilities.TestData;

import static pages.AdminDashboardPage.verifylogoDisplayDetail;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_011_TC_03 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_03(){
        test = extent.createTest("US_011_TC_03","3-Post a job for 10$ butonu ile" +
                " üye girişi sayfasına ulaşabilmeliyim");

        HomePage homePage= new HomePage(driver);
        HomePage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        test.info("Kullanici 'Job for 10$' butonuna tiklar");
        HomePage.clicksearchaJobButton();
        test.info("kullanici uye girisi sayfasina ulasir");


        String expectedUrl ="https://qa.jobexplorerpro.com/jobs/create";
        String actualUrl = driver.getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl, "Uye girisi sayfasina ulasir");

        softAssert.assertAll();
    }



}
