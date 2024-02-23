package tests.US_027;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_027_TC_02 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest  ("\"US_027_TC_02\"");

        AdminJobsPage adminJobsPage= new AdminJobsPage(driver);

        AdminJobsPage.getAdminOrkunLogin();
        test.info("Admin Kullanici Gecerli Email ve Password ile Login Olur");

        AdminJobsPage.clickHamburgerButton();

        AdminJobsPage.clickJobsParentButton();

        AdminJobsPage.applicantsRangerMenu();


        softAssert.assertTrue(AdminJobsPage.verifyADisplayedApplicantsMenuElementi());
        test.pass("Aplication Rangers menude ki basvuru araliklarini goruntuler.");
        softAssert.assertAll();




    }



}