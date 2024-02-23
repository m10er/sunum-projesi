package tests.US_028;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_028_TC_02 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_02(){
        test = extent.createTest     ("US_028_TC_02",
                "Gecerli sifre  ve mail ile admin login olur");


        AdminJobsPage adminJobsPage= new AdminJobsPage(driver);

        AdminJobsPage.getAdminOrkunLogin();
        test.info("Admin Kullanici Gecerli Email ve Password ile Login Olur");

        AdminJobsPage.clickHamburgerButton();

        AdminJobsPage.clickJobsParentButton();

        //Salary Ranges menuye tiklar
        test.info("Salary Ranges menuye tiklar");
        AdminJobsPage.clickSalaryRangers();


        //Salary Ranges menude ki yetenekleri goruntule

        softAssert.assertTrue(AdminJobsPage.verifyDisplayedAddNewButton());
        test.pass("Salary Rangers menude ki maas araliklarini goruntuler");
        softAssert.assertAll();

    }


}