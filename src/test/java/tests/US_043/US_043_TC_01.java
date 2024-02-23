package tests.US_043;


import org.testng.annotations.Test;
import pages.AdminFeaturedClients;
import testBase.BaseClass;

import static pages.AdminApplyMessagesPage.*;
import static pages.AdminFeaturedClients.clickFeatruedLink;
import static pages.AdminLoginPage.clickHamburgerButton;
import static pages.AdminLoginPage.validAdminLogin;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_043_TC_01 extends BaseClass {

    @Test(groups = {"e2e","smoke","regresion"})
    public void tc_01(){
        test = extent.createTest("US_043_TC_01","1-Admin olarak giriş yapınca sol menüde yer alan " +
                "featured Clients  menüsü ile önce çıkan müşterilerin bulunduğu sayfayı görüntüleyebildiğimi doğrulyabilmeliyim");

        AdminFeaturedClients adminFeaturedClients = new AdminFeaturedClients(driver);
        validAdminLogin();
        test.info("Kullanici Gecerli mail ve sifre ile admin olarak giris yapar");
        clickHamburgerButton();
        test.info("Kullanici hamburger butonuna tiklar");
        clickFeatruedLink();
        test.info("Kullanici acilan menude Featured Clients linkine tiklar");
        String expectedUrl = "https://qa.jobexplorerpro.com/admin/featured-clients";
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl,"Kullanici"+expectedUrl+"url ine erisir.");
        test.info("Kullanici"+expectedUrl+"url ine erisir.");
        softAssert.assertAll();
    }



}
