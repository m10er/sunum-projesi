package tests.US_033;


import org.testng.annotations.Test;
import pages.AdminUsersPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_033_TC_04 extends BaseClass {

    @Test(groups = {"e2e", "regresion", "smoke"})
    public void tc_04() {
        test = extent.createTest("Admin olarak giris yapilan sayfada\n" +
                " Users menusu altindaki Users menusunde kayitli kullanicilarin goruntulenebilmesi", "Users menusunden kayitli kullanicilari goruntuleme");
        AdminUsersPage adminUsersPage = new AdminUsersPage(driver);

        AdminUsersPage.getAdminDeryaLogin();
        AdminUsersPage.clickHamburgerButton();
        test.info("Hamburger buton tiklandi");
        AdminUsersPage.clickIdentityChecksButton();
        test.info("Identity Check menusu tiklandi");
        AdminUsersPage.clickIdentityCheckEditButton();
        test.info("Add New Butonuna tiklandi");
        AdminUsersPage.sendIdnetityChecksUserIdText();
        AdminUsersPage.clickIdentityCheckEditSaveButton();
        test.info("Save butonuna tiklandi");

        softAssert.assertTrue(AdminUsersPage.verifyidentityChecksSuccesfullMesage(), "kullanici basvurularinin onaylandigi dogrulandi");
        softAssert.assertAll();
    }
}
