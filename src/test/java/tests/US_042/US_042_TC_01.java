package tests.US_042;

import org.testng.annotations.Test;
import pages.AdminApplyMessagesPage;
import pages.AdminLoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_042_TC_01 extends BaseClass {

    @Test(groups = {"e2e","regrsion"})
    public void tc_01(){
        test = extent.createTest("US_042_TC_01","1-Admin olarak giriş yaptıktan sonra sol menüde yeralan " +
                "Apply message menüsü ile iş başvurusu için  gönderilen mesajlar sayfasını" +
                " görüntüleyebildiğimi doğrulyabilmeliyim");

        AdminApplyMessagesPage adminApplyMessagesPage = new AdminApplyMessagesPage(driver);
        AdminLoginPage.validAdminLogin();
        test.info("Kullanici Gecerli mail ve sifre ile admin olarak giris yapar");
        AdminLoginPage.clickHamburgerButton();
        test.info("Kullanici hamburger butonuna tiklar");
        AdminApplyMessagesPage.clickApplyMessagesButton();
        test.info("Kullanici acilan menude Apply Messages linkine tiklar");
        String expectedUrl = "https://qa.jobexplorerpro.com/admin/apply-messages";
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl,"Kullanici"+expectedUrl+"url ine erisir.");
        test.info("Kullanici"+expectedUrl+"url ine erisir.");
        softAssert.assertAll();

    }

}
