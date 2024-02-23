package tests.US_027;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_027_TC_03 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest    ("\"US_027_TC_03\"");

        AdminJobsPage adminJobsPage= new AdminJobsPage(driver);

        AdminJobsPage.getAdminOrkunLogin();
        test.info("Admin Kullanici Gecerli Email ve Password ile Login Olur");

        AdminJobsPage.clickHamburgerButton();

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

        //Yeni yetenek ekleyebildigini goruntule
        test.info("Yeni yetenek ekleyebildigini goruntule");

        softAssert.assertTrue(AdminJobsPage.verifyDisplayedapplicantsGoruntulemeElementi());
        test.pass("Aplication Rangers menudeki yeni aralik ekleyebildigi gorur");
        softAssert.assertAll();

    }



}