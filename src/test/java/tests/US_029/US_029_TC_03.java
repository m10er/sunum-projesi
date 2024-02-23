package tests.US_029;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_029_TC_03 extends BaseClass {
    @Test(groups = {"smoke","regression"})
    public void tc_03() {
        test = extent.createTest
                ("\"US_029_TC_03",
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


        //Yeni yetenek ekleyebildigini goruntule



        softAssert.assertTrue(AdminJobsPage.verifyJSkillElementi());
        test.pass("Job Types  menuye yeni is tipi ekleyebilmeli.");
        softAssert.assertAll();
    }

}
