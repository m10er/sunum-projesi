package tests.US_027;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_027_TC_05 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest   ("\"US_027_TC_05\"");

        AdminJobsPage adminJobsPage= new AdminJobsPage(driver);

        AdminJobsPage.getAdminOrkunLogin();
        test.info("Admin Kullanici Gecerli Email ve Password ile Login Olur");

        //JOBS EXPLORER PRO barinin acildigini gor
        test.info("JOBS EXPLORER PRO barinin acildigini gor");
        AdminJobsPage.clickHamburgerButton();

        //Jobs menuye tiklar
        test.info("Jobs menuye tiklar");
        AdminJobsPage.clickJobsParentButton();

        //Aplication Rangers menuye tiklar
        test.info("Aplication Rangers menuye tiklar");
        AdminJobsPage.applicantsRangerMenu();

        //Add New butonuna tikla
        test.info(" Add New butonuna tikla");
        AdminJobsPage.clickAddNewButton();


        softAssert.assertTrue(AdminJobsPage.verifyADisplayedApplicantsMenuElementi());
        test.pass("Aplication Rangers menude ki basvuru araliklarini goruntuler.");
        softAssert.assertAll();

        AdminJobsPage.sendAddNewsNameKutusu();

        AdminJobsPage.sendApllicantsMinRangeBox();

        AdminJobsPage.sendApplicantssMaxRangeBox();

        AdminJobsPage.clickAddNewSaveButton();

        AdminJobsPage.clickSkillDeleteButton();
        AdminJobsPage.clickYesDeleteButton();

        softAssert.assertTrue(AdminJobsPage.silinenYetenegiDogrulamaElementi());
        test.pass("Aplication Rangers menuye ekledigi araligi silebildigini gorur");
        softAssert.assertAll();

    }



}