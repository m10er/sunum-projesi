package tests.US_022;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.AdminLoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_022_TC_02 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_02(){
        test = extent.createTest("US_022_TC_02","Admin Olarak Basarili Bir Sekilde Login Olunabilmesi Testi," +
                "Gecerli sifre  ve mail ile admin login olur");

        AdminJobsPage adminJobsPage= new AdminJobsPage(driver);

        AdminJobsPage.getAdminUgurLogin();
        test.info("Admin Kullanici Gecerli Email ve Password ile Login Olur");


        AdminLoginPage.clickHamburgerButton();

        test.info("Admin Kullanici Hamburger(Acilir Menu Barina) Butonuna Tiklar");



        softAssert.assertTrue(AdminJobsPage.verifyDisplayedMediaButton(), "Admin Kullanici Acilir Menu'de Media'yi Goruntuler");


        softAssert.assertAll();
    }

}











