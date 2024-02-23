package tests.US_032;

import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.AdminLoginPage;
import pages.AdminUsersPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_032_TC_02 extends BaseClass {
    @Test(groups = {"e2e", "regresion", "smoke"})
    public void tc_02() {
        test = extent.createTest("Admin olarak giris yapilan sayfada\n" +
                " Users menusu altindaki Users menusunde kayitli kullanicilarin goruntulenebilmesi", "Users menusunden kayitli kullanicilari goruntuleme");
        AdminUsersPage adminUsersPage = new AdminUsersPage(driver);

        AdminUsersPage.getAdminDeryaLogin();
        AdminUsersPage.clickHamburgerButton();
        test.info("Hamburger buton tiklandi");
        AdminUsersPage.clickChildUserMenu();
        test.info("Users menusu tiklandi");

        softAssert.assertTrue(AdminUsersPage.verifyDisplayedUsersPageTitle(), "Users menusunde kayitli kullanicilari goruntuleme");
        test.info("Users menusunde kayitli kullanicilarin goruntulendigi dogrulandi");

        softAssert.assertAll();
    }

}