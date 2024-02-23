package tests.US_021;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_021_TC_02 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_02(){
        test = extent.createTest("US_021_TC_02","Admin Olarak Basarili Bir Sekilde " +
                "Login Olunabilmesi Testi, Gecerli sifre  ve mail ile admin login olur");

        AdminDashboardPage adminDashboardPage= new AdminDashboardPage(driver);

        AdminJobsPage.getAdminUgurLogin();


        test.info("Admin Kullanici Gecerli Email ve Password ile Login Olur");

        softAssert.assertTrue(AdminDashboardPage.verifyDisplayedPlatrformStatisticText(),"Platform Istatistikleri Goruntulendigi Dogrulanir");

        test.pass("Acilan sayfada Platform Istatistikleri'nin Goruntulendigi Dogrulanir");

        softAssert.assertAll();
    }

}






