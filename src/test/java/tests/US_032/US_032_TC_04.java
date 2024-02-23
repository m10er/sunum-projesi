package tests.US_032;

import org.testng.annotations.Test;
import pages.AdminUsersPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_032_TC_04 extends BaseClass {
    @Test(groups = {"e2e", "regresion", "smoke"})
    public void tc_03() {
        test = extent.createTest("Admin olarak Users menusunde\n" +
                "kullanici bilgilerinin duzenlenmesi", "Eklenen kullanici bilgilerini duzenleme");
        AdminUsersPage adminUsersPage = new AdminUsersPage(driver);

        AdminUsersPage.getAdminDeryaLogin();
        AdminUsersPage.clickHamburgerButton();
        test.info("Hamburger buton tiklandi");
        AdminUsersPage.clickChildUserMenu();
        test.info("Users menusu tiklandi");
        AdminUsersPage.clickAddUsersEditButton();
        test.info("Edit butonuna tiklandi");
        AdminUsersPage.sendAddUserEmailText();
        test.info("Email texti duzenlendi");
        AdminUsersPage.clickAddUserSaveButton();
        test.info("Save butonuna tiklandi");


        softAssert.assertTrue(AdminUsersPage.verifyAddUsersSuccesfullMesage(), "kullanici bilgileri duzenlendi");
        test.info("Kullanici bilgileri duzenlendigi dogrulandi");
        softAssert.assertAll();


    }

}