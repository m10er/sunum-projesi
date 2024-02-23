package tests.US_023;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_023_TC_02 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_022_TC_02","\"Admin Olarak Basarili Bir Sekilde  Login Olunabilmesi Testi," +
                " \"Gecerli sifre  ve mail ile admin login olur\"");

        AdminJobsPage adminJobsPage= new AdminJobsPage(driver);

        AdminJobsPage.getAdminUgurLogin();

        test.info("Admin Kullanici Hamburger(Acilir Menu Barina) Butonuna Tiklar");

       AdminJobsPage.clickJObsMenuButton();

        test.info("Admin Kullanici Jobs Butonuna Tiklar");

        AdminJobsPage.clickJObsChildButton();

        String expectedUrl= "https://qa.jobexplorerpro.com/admin/jobs";
        String actualUrl = driver.getCurrentUrl();


        softAssert.assertEquals(actualUrl, expectedUrl, "Admin Kullanici Jobs Pagesi Goruntuler");


        softAssert.assertAll();
    }

}












