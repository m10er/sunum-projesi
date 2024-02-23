package tests.US_034;


import org.testng.annotations.Test;
import pages.AdminUsersPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_034_TC_03 extends BaseClass {
    @Test(groups = {"smoke"})
    public void tc_03() {
        AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
        test = extent.createTest
                ("admin olarak sayfaya giris yapabilmeliyim", "Gecerli sifre  ve mail ile admin login olur");

        AdminUsersPage.getAdminDeryaLogin();
        AdminUsersPage.clickHamburgerButton();
        test.info("Hamburger buton tiklandi");

        AdminUsersPage.clickUsersReportButton();
        test.info("User Reports menusu tiklandi");

        AdminUsersPage.clickUsersAddNewButton();
        test.info("Add New Butonuna tiklandi");

        AdminUsersPage.sendUsersReportJObIdText();
        AdminUsersPage.sendUserReportsDetailText();
        AdminUsersPage.clickAddUserSaveButton();
        test.info("Save butonuna tiklandi");

        softAssert.assertTrue(AdminUsersPage.verifyidentityChecksSuccesfullMesage(), "kullanici basvurularinin onaylandigi dogrulandi");
        softAssert.assertAll();
    }




}
