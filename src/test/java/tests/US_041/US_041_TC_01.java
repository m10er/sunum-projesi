package tests.US_041;

import org.testng.annotations.Test;
import pages.AdminContactMessagesPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_041_TC_01 extends BaseClass {


    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_041_TC_01","1-Admin olarak giriş yaptıktan sonra sol menüde yeralan" +
                " contact message menüsü ile iletişim sayfasından gönderilen mesajlar sayfasını " +
                "görüntüleyebildiğimi doğrulyabilmeliyim");

        AdminContactMessagesPage adminContactMessagesPage = new AdminContactMessagesPage(driver);

        adminContactMessagesPage.validAdminLogin();
        test.info("Kullanici Gecerli mail ve sifre ile admin olarak giris yapar");
        adminContactMessagesPage.clickHamburgerButton();
        test.info("Kullanici hamburger butonuna tiklar");
        adminContactMessagesPage.clickContactMessageLink();
        test.info("Kullanici acilan menude Contact Messages linkine tiklar");
        String expectedUrl = "https://qa.jobexplorerpro.com/admin/contact-messages";
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl,"Kullanici"+expectedUrl+"url ine erisir.");
        test.info("Kullanici"+expectedUrl+"url ine erisir.");
        softAssert.assertAll();



    }



}
