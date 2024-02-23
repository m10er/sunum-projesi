package tests.US_030;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_030_TC_02 extends BaseClass {

    @Test(groups = {"smoke"})
    public void tc_02() {
        AdminJobsPage adminJobsPage = new AdminJobsPage(driver);
        test = extent.createTest
                ("US_030_TC_02",
                        "Gecerli sifre  ve mail ile admin login olur");
        AdminJobsPage.getAdminOrkunLogin();

        //JOBS EXPLORER PRO barinin acildigini gor
        AdminJobsPage.clickHamburgerButton();


        //Jobs menuye tiklar
        AdminJobsPage.clickJobsParentButton();

        //Jobs Skills menuye tiklar
        AdminJobsPage.clickJobsType();


        //Jobs Skills menude ki yetenekleri goruntule

        softAssert.assertTrue(AdminJobsPage.verifyDisplayedAddNewButton());
        test.pass("Jobs Skills menude ki yetenekler goruntuler.");
        softAssert.assertAll();
    }
}
