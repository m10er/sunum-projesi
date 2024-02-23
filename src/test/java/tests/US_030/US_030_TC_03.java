package tests.US_030;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_030_TC_03 extends BaseClass {

    @Test(groups = {"smoke"})
    public void tc_02() {
        AdminJobsPage adminJobsPage = new AdminJobsPage(driver);
        test = extent.createTest
                ("US_030_TC_03",
                        "Gecerli sifre  ve mail ile admin login olur");
        AdminJobsPage.getAdminOrkunLogin();

        //JOBS EXPLORER PRO barinin acildigini gor
        AdminJobsPage.clickHamburgerButton();

        //Jobs menuye tiklar
        AdminJobsPage.clickJobsParentButton();

        //Jobs Skills menuye tiklar
        AdminJobsPage.clickJobskill();
        AdminJobsPage.clickAddNewButton();
        AdminJobsPage.sendAddNewsNameKutusu();

        softAssert.assertTrue(AdminJobsPage.verifyJSkillElementi());
        test.pass("Sayfada gorunur oldugu dogrulanir.");
        softAssert.assertAll();
    }
}
