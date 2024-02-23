package tests.US_034;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.AdminUsersPage;
import pages.UserHomePage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_034_TC_02 extends BaseClass {
    @Test(groups = {"smoke"})
    public void tc_02() {
        AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
        test = extent.createTest
                ("admin olarak sayfaya giris yapabilmeliyim", "Gecerli sifre  ve mail ile admin login olur");

        AdminUsersPage.getAdminDeryaLogin();
        AdminUsersPage.clickHamburgerButton();
        test.info("Hamburger buton tiklandi");

        AdminUsersPage.clickUsersReportButton();

        test.info("User Reports menusu tiklandi");

        softAssert.assertTrue(AdminUsersPage.userReportsPageTitle(), "User Reports menusunde bildirim raporlarini goruntuleme");
        test.pass("User Reports menusunde bildirim raporlari goruntulendigi dogrulandi");


        softAssert.assertAll();

        softAssert.assertAll();
    }




}
