package tests.US_041;

import org.testng.annotations.Test;
import pages.AdminContactMessagesPage;
import pages.AdminLoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_041_TC_03 extends BaseClass {

    @Test(groups = {"e2e","smoke","regresion"})
    public void tc_03(){
        test = extent.createTest("US_041_TC_03","3-Admin olarak giriş yaptıktan sonra sol meüde yeralan" +
                "contact message menüsü ile iletişim sayfasından gönderilen mesajlarların ayrıntısını" +
                " görüntüleyebildiğimi doğrulyabilmeliyim");
        AdminContactMessagesPage adminContactMessagesPage = new AdminContactMessagesPage(driver);

        AdminLoginPage.validAdminLogin();
        test.info("Kullanici Gecerli mail ve sifre ile admin olarak giris yapar");
        AdminLoginPage.clickHamburgerButton();
        test.info("Kullanici hamburger butonuna tiklar");
        AdminContactMessagesPage.clickContactMessageLink();
        test.info("Kullanici acilan menude Contact Messages linkine tiklar");
        AdminContactMessagesPage.clickMessageViewButton();
        test.info("Kullanici ilk siradaki meesajin oldugu satirdaki View butonuna tiklar");
        test.info("Kullanici acilan sayfada 'Viewing Contact Message' yazisini goruntuler");
        softAssert.assertTrue(AdminContactMessagesPage.verifyDisplayedViewingMessageContactText());

        softAssert.assertAll();


    }


}
