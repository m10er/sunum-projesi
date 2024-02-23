package tests.US_032;

import org.testng.annotations.Test;
import pages.AdminUsersPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_032_TC_05 extends BaseClass {
    @Test(groups = {"e2e", "regresion", "smoke"})
    public void tc_03() {
        test = extent.createTest("Admin olarak Users menusunde\n" +
                "eklenen kullanici bilgilerinin silinebilmesi", "Eklenen kullanici bilgilerinin silinmesi");
        AdminUsersPage adminUsersPage = new AdminUsersPage(driver);

        AdminUsersPage.getAdminDeryaLogin();
        AdminUsersPage.clickHamburgerButton();
        test.info("Hamburger buton tiklandi");
        AdminUsersPage.clickChildUserMenu();
        test.info("Users menusu tiklandi");
        AdminUsersPage.clickUserDeletButton();


        test.info("Delete butonuna tiklandi");

        softAssert.assertTrue(AdminUsersPage.verifyUDisplayedsersDeleteButton(), "Eklenen kullanici kaydi silindi");
        test.info("kullanici kaydi silindigi dogrulandi");
        softAssert.assertAll();


    }

}