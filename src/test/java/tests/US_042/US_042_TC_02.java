package tests.US_042;


import org.testng.annotations.Test;
import pages.AdminApplyMessagesPage;
import pages.AdminLoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_042_TC_02 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc_02(){
        test = extent.createTest("US_042_TC_02","2-Admin olarak giriş yaptıktan sonra sol menüde yeralan " +
                "Apply messag  menüsü ile iş başvurusu için  gönderilen mesaj sayısını görüntüleyebildiğimi doğrulyabilmeliyim");

        AdminApplyMessagesPage adminApplyMessagesPage = new AdminApplyMessagesPage(driver);
        AdminLoginPage.validAdminLogin();
        test.info("Kullanici Gecerli mail ve sifre ile admin olarak giris yapar");
        AdminLoginPage.clickHamburgerButton();
        test.info("Kullanici hamburger butonuna tiklar");
        AdminApplyMessagesPage.clickApplyMessagesButton();
        test.info("Kullanici acilan menude Apply Messages linkine tiklar");
        softAssert.assertTrue(AdminApplyMessagesPage.verifyShowingNumberText());
        test.info("Kullanici acilan sayfada tablo altinda yer alan mesaj sayilarini goruntuler");
        softAssert.assertAll();

    }

}
