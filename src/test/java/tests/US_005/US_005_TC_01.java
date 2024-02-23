package tests.US_005;


import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_005_TC_01 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_001_TC_01","Bir ziyaretçi olarak Home page sayfasının \n" +
                "header bölümündeki contact menüsü ile iletişim formuna ulaşıp mesaj gönderebilmeliyim");

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        test.info("1- Bir browser acilmali");
        ContactUsPage.getHomePage();
        softAssert.assertTrue(ContactUsPage.verifyEnabledContacPage());
        test.info(" \"Header\" bolumundeki contact menuyu goruntuleyebilmeliyim");
        ContactUsPage.clickContactInHeader();
        String expectedUrl= TestData.qaContactWebUrl;
        String actualUrl= driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        test.info("Contact menusundeki iletisim formunu goruntuleybilmeliyim");
        ContactUsPage.sendContactEmail();
        ReusableMethods.bekle(1);
        ContactUsPage.sendContactSubject();
        ReusableMethods.bekle(2);
        ContactUsPage.sendContactMeesage();
        ReusableMethods.bekle(2);
        ContactUsPage.clickContactSubmit();
        softAssert.assertTrue(ContactUsPage.verifySuccesMessage());

        softAssert.assertAll();
    }


}

