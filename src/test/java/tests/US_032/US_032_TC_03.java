package tests.US_032;

import org.testng.annotations.Test;
import pages.AdminUsersPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_032_TC_03 extends BaseClass {
    @Test(groups = {"e2e", "regresion", "smoke"})
    public void tc_03() {
        test = extent.createTest("Admin olarak Users menusunde\n" +
                "yeni kullanici eklenmesi", "Gecerli sifre  ve mail ile admin login olur");
        AdminUsersPage adminUsersPage = new AdminUsersPage(driver);

        AdminUsersPage.getAdminDeryaLogin();
        AdminUsersPage.clickHamburgerButton();
        test.info("Hamburger buton tiklandi");
        AdminUsersPage.clickChildUserMenu();
        test.info("Users menusu tiklandi");
        AdminUsersPage.clickUsersAddNewButton();
        AdminUsersPage.sendAddUserNameTExt();
        AdminUsersPage.sendUserEmailText();
        AdminUsersPage.sendUserPasswordTExt();
        AdminUsersPage.clickAddUserSaveButton();
        test.info("Save butonuna tiklandi");


        softAssert.assertTrue(AdminUsersPage.verifyAddUsersSuccesfullMesage(), "Yeni kullanici eklendigi dogrulandi");
        softAssert.assertAll();


    }

}