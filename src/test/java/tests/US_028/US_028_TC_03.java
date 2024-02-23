package tests.US_028;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_028_TC_03 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_04(){
        test = extent.createTest  ("\"US_026_TC_03",
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

        //Yeni yetenek ekleyebildigini goruntule

        softAssert.assertTrue(AdminJobsPage.verifyJSkillElementi());
        test.pass("Salary Rangers menuye ekledigi maas araliklarini goruntuler");
        softAssert.assertAll();

    }


}