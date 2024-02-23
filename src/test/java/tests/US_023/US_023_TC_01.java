package tests.US_023;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_023_TC_01 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_022_TC_01","Admin Olarak Basarili Bir Sekilde Login Olunabilmesi Testi\"," +
                " \"Gecerli sifre  ve mail ile admin login olur");

        AdminJobsPage adminJobsPage= new AdminJobsPage(driver);

        AdminJobsPage.getAdminUgurLogin();
        test.info("Admin Kullanici Gecerli Email ve Password ile Login Olur");

        test.info("Admin Kullanici Gecerli Email ve Password ile Login Olur");

        AdminJobsPage.clickHamburgerButton();

        test.info("Admin Kullanici Hamburger(Acilir Menu Barina) Butonuna Tiklar");

        softAssert.assertTrue(AdminJobsPage.verifyJObsMenuButton(), "Admin Kullanici Acilir Menu'de Jobs'i Goruntuler");

        softAssert.assertAll();
    }

}









