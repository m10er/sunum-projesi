package tests.US_029;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_029_TC_04 extends BaseClass {

    @Test(groups = {"smoke"})
    public void tc_04() {
        test = extent.createTest
                ("US_029_TC_04",
                        "Gecerli sifre  ve mail ile admin login olur");
        AdminJobsPage adminJobsPage = new AdminJobsPage(driver);
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

        softAssert.assertTrue(AdminJobsPage.skillsEditlendiginiGoruntuleTex());
        test.pass("Job Types menuye ekledigi yeni is tipinin duzenleyebilmeli");
        softAssert.assertAll();
    }

}
