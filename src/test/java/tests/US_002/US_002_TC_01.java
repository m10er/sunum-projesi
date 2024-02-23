package tests.US_002;


import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_002_TC_01 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_001_TC_01","Bir ziyaretçi olarak Home page sayfasının header bölümündeki contact menüsü ile " +
                "iletişim formuna ulaşıp mesaj gönderebilmeliyim");

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        test.info("1- Bir browser acilmali");
        HomePage.getHomePage();
        String expectedUrl= TestData.qaWebUrl;
        test.info("2- Takip edilen linke tiklanmali https://qa.jobexplorerpro.com/");
        String actualUrl=driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        test.info("3- Ilgili sayfaya giris yapilabilmelidir");
        HomePage.clickContactInHeader();
        test.info("4- Contact menuyu tiklayabilmelim");

        test.info("//5- Contact Us bolumundaki Email address Subject Message alanlarina giris yapabilmeliyim");
        softAssert.assertTrue(ContactUsPage.verifyDisplayedMessagesTextBox());
        softAssert.assertTrue(ContactUsPage.verifyEmailTextBoxEnabled());
        softAssert.assertTrue(ContactUsPage.verifySubjectTextBox());
        softAssert.assertTrue(ContactUsPage.verifySubmitButton());

        softAssert.assertAll();
    }
}


