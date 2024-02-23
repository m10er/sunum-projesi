package tests.US_029;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_029_TC_02 extends BaseClass {
    @Test(groups = {"smoke"})
    public void tc_02() {
        test = extent.createTest
                ("US_029_TC_02",
                        "Gecerli sifre  ve mail ile admin login olur");
        AdminJobsPage adminJobsPage = new AdminJobsPage(driver);
       AdminJobsPage.getAdminOrkunLogin();

        //JOBS EXPLORER PRO barinin acildigini gor
        AdminJobsPage.clickHamburgerButton();

        //Jobs menuye tiklar
        AdminJobsPage.clickJobsParentButton();
        AdminJobsPage.clickJobsType();


        softAssert.assertTrue(AdminJobsPage.jobsTypeGorunurluk());
        test.pass("Job Types menude ki is tiplerini goruntuler.");
        softAssert.assertAll();
    }


}
