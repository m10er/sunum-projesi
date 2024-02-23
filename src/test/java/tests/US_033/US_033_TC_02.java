package tests.US_033;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.AdminLoginPage;
import pages.AdminUsersPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_033_TC_02 extends BaseClass {

    @Test(groups = {"e2e", "regresion", "smoke"})
    public void tc_02() {
        test = extent.createTest("Admin olarak giris yapilan sayfada\n" +
                " Users menusu altindaki Users menusunde kayitli kullanicilarin goruntulenebilmesi", "Users menusunden kayitli kullanicilari goruntuleme");
        AdminUsersPage adminUsersPage = new AdminUsersPage(driver);

        AdminUsersPage.getAdminDeryaLogin();
        AdminUsersPage.clickHamburgerButton();
        test.info("Hamburger buton tiklandi");
        AdminUsersPage.clickIdentityChecksButton();
        test.info("Identity Check menusu tiklandi");

        softAssert.assertTrue(AdminUsersPage.verifyIdentityChecksPage(), "Identity Check menusunde kimlik dogrulamasi yapan kullanicilari goruntuleme");
        test.info("Identity Check menusunde kimlik dogrulamasi yapan kullanicilarin goruntulendigi dogrulandi");


        softAssert.assertAll();
    }
}
