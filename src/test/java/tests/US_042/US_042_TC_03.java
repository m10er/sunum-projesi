package tests.US_042;

import org.testng.annotations.Test;
import pages.AdminApplyMessagesPage;
import testBase.BaseClass;

import static pages.AdminApplyMessagesPage.*;
import static pages.AdminLoginPage.clickHamburgerButton;
import static pages.AdminLoginPage.validAdminLogin;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_042_TC_03 extends BaseClass {

    @Test(groups = {"e2e","smoke","regresion"})
    public void tc_03(){
        test = extent.createTest("US_042_TC_03","3-Admin olarak giriş yaptıktan sonra sol menüde yeralan " +
                "Apply messages menüsü ile iş başvurusu için gönderilen mesajlarların ayrıntısını görüntüleyebildiğimi doğrulyabilmeliyim");

        AdminApplyMessagesPage adminApplyMessagesPage = new AdminApplyMessagesPage(driver);
        test.info("Kullanici Gecerli mail ve sifre ile admin olarak giris yapar");
        validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        clickHamburgerButton();
        test.info("Kullanici acilan menude Apply Messages linkine tiklar");
        clickApplyMessagesButton();
        test.info("Kullanici mesaj satirinda bulunan View butonuna tiklar");
        clickViewButton();
        test.info("KUllanici Mesaj detayinda yer alan 'Viewing Apply Message' yazisini goruntuler ");
        softAssert.assertTrue(verifyDisplayedViewApplyMessageText());


        softAssert.assertAll();
    }

}
