package tests.US_034;


import org.testng.annotations.Test;
import pages.AdminUsersPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_034_TC_04 extends BaseClass {
    @Test(groups = {"smoke"})
    public void tc_04() {
        AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
        test = extent.createTest
                ("admin olarak sayfaya giris yapabilmeliyim", "Gecerli sifre  ve mail ile admin login olur");

        AdminUsersPage.getAdminDeryaLogin();
        AdminUsersPage.clickHamburgerButton();
        test.info("Hamburger buton tiklandi");

        AdminUsersPage.clickUsersReportButton();
        test.info("User Reports menusu tiklandi");

        AdminUsersPage.clickUserReportEditButton();
        test.info("Edit butonuna tiklandi");
        AdminUsersPage.sendUserReportStatusText();

        test.info("Statu degeri degistirildi");
        AdminUsersPage.clickUserReportSaveButton();


        softAssert.assertTrue(AdminUsersPage.userReportsSuccesfullMesage.isDisplayed(), "gonderilen raporun statusu degistirildigi dogrulanir");
        test.pass("Basarili oldu mesaji goruntulenir");
        softAssert.assertAll();
    }




}
