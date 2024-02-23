package tests.US_041;


import org.testng.annotations.Test;
import pages.AdminContactMessagesPage;
import pages.AdminLoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_041_TC_02 extends BaseClass {


    @Test(groups = {"e2e","regresion"})
    public void tc_02(){
        test = extent.createTest("US_041_TC_02","2-Admin olarak giriş yaptıktan sonra sol menüde yeralan " +
                "contact message menüsü ile iletişim sayfasından gönderilen mesaj sayısını görüntüleyebildiğimi doğrulyabilmeliyim");
        AdminContactMessagesPage adminContactMessagesPage = new AdminContactMessagesPage(driver);

        AdminLoginPage.validAdminLogin();
        test.info("Kullanici Gecerli mail ve sifre ile admin olarak giris yapar");
        AdminLoginPage.clickHamburgerButton();
        test.info("Kullanici hamburger butonuna tiklar");
        AdminContactMessagesPage.clickContactMessageLink();
        test.info("Kullanici acilan menude Contact Messages linkine tiklar");
        test.info("Kullanici acilan sayfada tablo altinda yer alan gonderilen mesaj sayisini goruntuler");
        softAssert.assertTrue(AdminContactMessagesPage.verifyDisplayedNumberText());

        softAssert.assertAll();

    }


}
