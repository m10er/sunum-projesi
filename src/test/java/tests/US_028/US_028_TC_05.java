package tests.US_028;


import com.beust.ah.A;
import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_028_TC_05 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_04(){
        test = extent.createTest  ("US_028_TC_05",
                "Gecerli sifre  ve mail ile admin login olur");


        AdminJobsPage adminJobsPage= new AdminJobsPage(driver);

        AdminJobsPage.getAdminOrkunLogin();
        test.info("Admin Kullanici Gecerli Email ve Password ile Login Olur");

        AdminJobsPage.clickHamburgerButton();

        AdminJobsPage.clickJobsParentButton();

        //Salary Ranges menuye tiklar
        test.info("Salary Ranges menuye tiklar");
        AdminJobsPage.clickSalaryRangers();

        AdminJobsPage.clickAddNewButton();

        AdminJobsPage.sendRangeBox();

        AdminJobsPage.clickAdnewSaveButton();

        AdminJobsPage.clickEditButton();
        AdminJobsPage.sendEditNameBox();

        AdminJobsPage.clickAddNewSaveButton();

        AdminJobsPage.clickSkillDeleteButton();

        AdminJobsPage.clickYesDeleteButton();



        softAssert.assertTrue(AdminJobsPage.silinenYetenegiDogrulamaElementi());
        test.pass("Salary Rangers menuye ekledigi maas araliklarini sildigini gorur");
        softAssert.assertAll();

    }


}