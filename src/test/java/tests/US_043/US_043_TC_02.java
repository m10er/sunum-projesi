package tests.US_043;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AdminFeaturedClients;
import testBase.BaseClass;

import static pages.AdminFeaturedClients.*;
import static pages.AdminLoginPage.clickHamburgerButton;
import static pages.AdminLoginPage.validAdminLogin;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_043_TC_02 extends BaseClass {
    @DataProvider
    public static Object[][] order() {
        String[][] orders = {{"order1"},{"orderli"},{"4"}};
        return orders;
    }

    @Test(dataProvider ="order")
    public void tc_02(){
        test = extent.createTest("US_043_TC_02","2-Admin olarak giriş yapıp öne çıkan müşteriler sayfasına " +
                "ulaştığımda öne çıkan müşterileri ve öne çıkan müşteri sayısını görüntüleyebildiğimi doğrulyabilmeliyim");

        AdminFeaturedClients adminFeaturedClients = new AdminFeaturedClients(driver);
        test.info("Kullanici Gecerli mail ve sifre ile admin olarak giris yapar");
        validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        clickHamburgerButton();
        test.info("Kullanici acilan menude Featured Clients linkine tiklar");
        clickFeatruedLink();
        test.info("Kullanici one cikan musteri tablosunu goruntuler");
        softAssert.assertTrue(verifyDisplayedViewNumber());

        softAssert.assertAll();
    }



}
