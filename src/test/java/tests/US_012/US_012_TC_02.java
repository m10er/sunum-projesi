package tests.US_012;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_012_TC_02 extends BaseClass {
    HomePage homePage= new HomePage(driver);

    @Test(groups = {"e2e","regression"})
    public void tc_02_01(){
        test = extent.createTest("US_012_TC_02","2- Footer bölümündeki logoyu,Contact page," +
                " Help & FAQ, Privacy Policy,Terms and Conditions öğelerini ve" +
                " linklerin doğru olarak çalıştıklarını doğrulayabilmeliyim");
        HomePage homePage= new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        test.info("Kullanici footer logooya tiklayarak ana sayfaya gider.");
        HomePage.clickFooterLogo();
        String expectedUrl = "https://qa.jobexplorerpro.com/";
        String actualUrl = driver.getCurrentUrl();
        test.info("Kullanici footer logooya tiklayarak"+expectedUrl+"gider");
        softAssert.assertEquals(actualUrl, expectedUrl, "footer logosuna tiklandiginda"+expectedUrl+ "gidilir");


        softAssert.assertAll();
    }
    @Test(groups = {"e2e","regression"})
    public void tc_02_02(){
        test = extent.createTest("US_012_TC_02","2- Footer bölümündeki logoyu,Contact page," +
                " Help & FAQ, Privacy Policy,Terms and Conditions öğelerini ve" +
                " linklerin doğru olarak çalıştıklarını doğrulayabilmeliyim");

        HomePage homePage= new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        HomePage.clickInFooterContactPageLink();
        String expectedContacUrl = TestData.qaContactWebUrl;
        String actualContactUrl = driver.getCurrentUrl();
        test.info("Kullanici footerdaki contacta tiklayarak"+expectedContacUrl+"gider");
        softAssert.assertEquals(actualContactUrl, expectedContacUrl, "footer logosuna tiklandiginda"+expectedContacUrl+ "gidilir");

        softAssert.assertAll();
    }
    @Test(groups = {"e2e","regression"})
    public void tc_02_03(){
        test = extent.createTest("US_012_TC_02","2- Footer bölümündeki logoyu,Contact page," +
                " Help & FAQ, Privacy Policy,Terms and Conditions öğelerini ve" +
                " linklerin doğru olarak çalıştıklarını doğrulayabilmeliyim");

        HomePage homePage= new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");


        HomePage.clickHelpFaqInFooter();
        String expectedHelpUrl ="https://qa.jobexplorerpro.com/pages/help";
        String actualHelpUrl= driver.getCurrentUrl();
        test.info("Kullanici footerdaki help faq butonuna tiklayarak"+expectedHelpUrl+"gider");
        softAssert.assertEquals(actualHelpUrl, expectedHelpUrl);

        softAssert.assertAll();
    }
    @Test(groups = {"e2e","regression"})
    public void tc_02_04(){
        test = extent.createTest("US_012_TC_02","2- Footer bölümündeki logoyu,Contact page," +
                " Help & FAQ, Privacy Policy,Terms and Conditions öğelerini ve" +
                " linklerin doğru olarak çalıştıklarını doğrulayabilmeliyim");

        HomePage homePage= new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");


        HomePage.clickPrivacyPoliciyInFooter();
        String expectedPrivacyUrl = "https://qa.jobexplorerpro.com/pages/privacy";
        String actualPrivacyUrl = driver.getCurrentUrl();
        test.info("Kullanici footerdaki Privacy tiklayarak"+expectedPrivacyUrl+"gider");
        softAssert.assertEquals(actualPrivacyUrl, expectedPrivacyUrl);

        softAssert.assertAll();
    }
    @Test(groups = {"e2e","regression"})
    public void tc_02_05(){
        test = extent.createTest("US_012_TC_02","2- Footer bölümündeki logoyu,Contact page," +
                " Help & FAQ, Privacy Policy,Terms and Conditions öğelerini ve" +
                " linklerin doğru olarak çalıştıklarını doğrulayabilmeliyim");

        HomePage homePage= new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        HomePage.clickInFooterTersmConditons();
        String expectedUTermsUrl ="https://qa.jobexplorerpro.com/pages/terms-and-conditions";
        String actualTermsUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualTermsUrl,expectedUTermsUrl);
        test.info("Kullanici footerdaki Privacy tiklayarak"+expectedUTermsUrl+"gider");


        softAssert.assertAll();
    }



}
