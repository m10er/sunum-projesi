package tests.US_026;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_026_TC_05 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_05(){

        test = extent.createTest
                ("\"US_026_TC_05",
                       "Gecerli sifre  ve mail ile admin login olur");

        AdminJobsPage adminJobsPage = new AdminJobsPage(driver);

        //JOBS EXPLORER PRO barinin acildigini gor
        AdminJobsPage.getAdminOrkunLogin();

        test.info("JOBS EXPLORER PRO barinin acildigini gor");
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

        test.info("Isim ekler");
        AdminJobsPage.sendAddNewsNameKutusu();

        test.info("Save butonuna tiklar");
        AdminJobsPage.clickAdnewSaveButton();

        AdminJobsPage.clickEditButton();
        AdminJobsPage.sendEditNameBox();
        AdminJobsPage.clickAddNewSaveButton();
        AdminJobsPage.clickSkillDeleteButton();

        softAssert.assertTrue(AdminJobsPage.skillsEditlendiginiGoruntuleText());
        test.pass("Eklenen yetenekleri duzenleyebildigini goruntuler");

        softAssert.assertAll();
    }

}

