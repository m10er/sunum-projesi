package tests.US_029;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_029_TC_05 extends BaseClass {
    @Test(groups = {"e2e"})
    public void tc_05() {
        test = extent.createTest
                ("\"US_029_TC_05",
                        "Gecerli sifre  ve mail ile admin login olur");
        AdminJobsPage adminJobsPage =new AdminJobsPage(driver);
        AdminJobsPage.getAdminOrkunLogin();

        //JOBS EXPLORER PRO barinin acildigini gor
        AdminJobsPage.clickHamburgerButton();

        //Jobs menuye tiklar
        AdminJobsPage.clickJobsParentButton();
        AdminJobsPage.clickJobsType();


        //Add New butonuna tikla
        AdminJobsPage.clickAddNewButton();
        AdminJobsPage.sendAddNewsNameKutusu();

        AdminJobsPage.clickAdnewSaveButton();

        AdminJobsPage.clickEditButton();

        AdminJobsPage.sendEditNameBox();

        AdminJobsPage.clickAdnewSaveButton();

        AdminJobsPage.clickSkillDeleteButton();

        AdminJobsPage.clickYesDeleteButton();



        softAssert.assertTrue(AdminJobsPage.silinenYetenegiDogrulamaElementi());
        test.pass("Job Types menuye ekledigi yeni is tipinin sildigini gorur");
        softAssert.assertAll();
    }

}
