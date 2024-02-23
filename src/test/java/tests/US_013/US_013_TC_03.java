package tests.US_013;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;
import utilities.TestData;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_013_TC_03 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_03_1(){
        test = extent.createTest("US_013_TC_03","3-Kullanıcı menüsünden şirketlerim,işlerim,ayaralar menüsünden" +
                " herhangi biri ile kullanıcı dashboard'a ulaşabildiğimi doğrulayabilmeliyim");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        test.info("kullanici profile ismine tiklayarak acilan menude Mycompaniese tiklar");
        HomePage.clickMyCompaniesLinkInProfileDropdown();
        String expectedMyCompUrl=TestData.qaCompaniesUrl;
        String actualMyCompUrl= driver.getCurrentUrl();
        softAssert.assertEquals(actualMyCompUrl, expectedMyCompUrl,"my companies assert");

        softAssert.assertAll();
    }

    @Test(groups = {"e2e","regression"})
    public void tc_03_2(){
        test = extent.createTest("US_013_TC_03","3-Kullanıcı menüsünden şirketlerim,işlerim,ayaralar menüsünden" +
                " herhangi biri ile kullanıcı dashboard'a ulaşabildiğimi doğrulayabilmeliyim");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");


        test.info("kullanici profile ismine tiklayarak acilan menude My Jobs tiklar");
        HomePage.clickMyJobsLinkInProfileDropdown();
        String expectedMyJobsUrl=TestData.qaMyJobsUrl;
        String actualMyJobsUrl= driver.getCurrentUrl();
        softAssert.assertEquals(actualMyJobsUrl, expectedMyJobsUrl,"my jobs assert");

        softAssert.assertAll();
    }
    @Test(groups = {"e2e","regression"})
    public void tc_03_3(){
        test = extent.createTest("US_013_TC_03","3-Kullanıcı menüsünden şirketlerim,işlerim,ayaralar menüsünden" +
                " herhangi biri ile kullanıcı dashboard'a ulaşabildiğimi doğrulayabilmeliyim");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");


        test.info("kullanici profile ismine tiklayarak acilan menude Search tiklar");
        HomePage.clickSearchLinkInProfileDropdown();
        String expectedSearchUrl=TestData.qaSearchUrl;
        String actualSearchUrl= driver.getCurrentUrl();
        softAssert.assertEquals(actualSearchUrl, expectedSearchUrl,"my profile assert");

        softAssert.assertAll();
    }
    @Test(groups = {"e2e","regression"})
    public void tc_03_4(){
        test = extent.createTest("US_013_TC_03","3-Kullanıcı menüsünden şirketlerim,işlerim,ayaralar menüsünden" +
                " herhangi biri ile kullanıcı dashboard'a ulaşabildiğimi doğrulayabilmeliyim");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");


        test.info("kullanici profile ismine tiklayarak acilan menude Settings tiklar");
        HomePage.clickSettingsLinkInProfileDropdown();
        String expectedSettingsUrl=TestData.qaSettingsUrl;
        String actualSettingsUrl= driver.getCurrentUrl();
        softAssert.assertEquals(actualSettingsUrl, expectedSettingsUrl,"settings assert");

        softAssert.assertAll();
    }
    @Test(groups = {"e2e","regression"})
    public void tc_03_5(){
        test = extent.createTest("US_013_TC_03","3-Kullanıcı menüsünden şirketlerim,işlerim,ayaralar menüsünden" +
                " herhangi biri ile kullanıcı dashboard'a ulaşabildiğimi doğrulayabilmeliyim");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        test.info("kullanici profile ismine tiklayarak acilan menude Settings tiklar");
        HomePage.clickLogoutLinkInProfileDropdown();
        String expectedoutsUrl=TestData.qaWebUrl;
        String actualoutUrl= driver.getCurrentUrl();
        softAssert.assertEquals(actualoutUrl, expectedoutsUrl,"logout assert");

        softAssert.assertAll();
    }

}
