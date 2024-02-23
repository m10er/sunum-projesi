package tests.US_026;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_026_TC_03 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_03(){
        test = extent.createTest ("\"US_026_TC_03\"",
                "Gecerli sifre  ve mail ile admin login olur");
        AdminJobsPage adminJobsPage= new AdminJobsPage(driver);
        AdminJobsPage.getAdminOrkunLogin();

        test.info("JOBS EXPLORER PRO barinin acildigini gor\n");
        AdminJobsPage.clickHamburgerButton();

        //Jobs menuye tiklar
        test.info("Jobs menuye tiklar");
        AdminJobsPage.clickJobsParentButton();

        //Skills menuye tiklar
        test.info("Skills menuye tiklar");
        AdminJobsPage.clickSkillsButton();


        //Add New butonuna tikla
        test.info("Add New butonuna tikla");
        AdminJobsPage.clickAddNewButton();

        AdminJobsPage.sendAddNewsNameKutusu();

        //Yeni yetenek ekleyebildigini goruntule


        softAssert.assertTrue(AdminJobsPage.verifyDisplayedJsSkillElementi());
        test.pass("Yeni yetenek ekleyebildigini goruntule.");
        softAssert.assertAll();
    }

}
