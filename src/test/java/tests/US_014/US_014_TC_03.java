package tests.US_014;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_014_TC_03 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_03(){
        test = extent.createTest("US_014_TC_03","3-Kullanıcı menüsünden search Job linkine tıklayarak" +
                " iş arama formuna ulaşabildiğimi doğrulayabilmeliyim");

        HomePage homePage = new HomePage(driver);
        test.info("Kullanici gecerli mail ve sifre ile login olur");
        LoginPage.getLogin();
        test.info("Kullanici menude Search a Job linkine tiklar.");
        HomePage.clickSearchJobMenuLink();
        String expectedUrl= "https://qa.jobexplorerpro.com/search";
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);


        softAssert.assertAll();
    }



}
