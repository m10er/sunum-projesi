package tests.US_030;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_030_TC_04 extends BaseClass {


    @DataProvider
    public static Object[][] jobSkills() {
        String[][] jobSkills = {  {"5","6"},
                {"1" ,"2"},
                {"3","4"}};
        return jobSkills;
    }

    @Test(dataProvider = "jobSkills",groups = {"e2e"})
    public void tc_02(String jobId, String skillId) {
        AdminJobsPage adminJobsPage = new AdminJobsPage(driver);
        test = extent.createTest
                ("US_030_TC_04",
                        "Gecerli sifre  ve mail ile admin login olur");
        AdminJobsPage.getAdminOrkunLogin();

        //JOBS EXPLORER PRO barinin acildigini gor
        AdminJobsPage.clickHamburgerButton();

        //Jobs menuye tiklar
        AdminJobsPage.clickJobsParentButton();

        //Jobs Skills menuye tiklar
        AdminJobsPage.clickJobskill();
        AdminJobsPage.clickAddNewButton();
        AdminJobsPage.sendJobId(jobId);

        AdminJobsPage.sendSkillIdBox(skillId);
        AdminJobsPage.clickAdnewSaveButton();
        AdminJobsPage.clickEditButton();

       AdminJobsPage.clickAdnewSaveButton();

        softAssert.assertTrue(AdminJobsPage.skillsEditlendiginiGoruntuleText());
        test.pass("Jobs Skills menusune ekledigi yeni is yeteneklerini goruntuleyebilmeli");
        softAssert.assertAll();
    }
}
