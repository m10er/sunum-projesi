package tests.US_036;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.AdminMoneyPage;
import pages.AdminUsersPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_036_TC_01 extends BaseClass {

    @Test(groups = {"smoke"})
    public void tc_01() {
        AdminMoneyPage adminMoneyPage = new AdminMoneyPage(driver);
        test=extent.createTest("Admin Login Testi", "Gecerli sifre  ve mail ile admin login olur");

        AdminMoneyPage.getAdminAbdurrahimLogin();

        AdminMoneyPage.clickHamburgerButton();

        test.info("Admin sayfasinda acilir menu butonuna tiklanilir");
        AdminMoneyPage.clickMOneyMenuButton();
        test.info("Acilan menude MONEY acilir menusune tiklanir");
        AdminMoneyPage.clickTransactionMenuLink();
        test.info("Acilan menude Transactions linkine tiklanir");
        String expectedUrl= "https://qa.jobexplorerpro.com/admin/transactions";
        String actualUrl= driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl,"Transactions Urlsi oldugu dogrulanir.");
        test.pass("Acilan sayfa url'nin" + expectedUrl+"oldugu dogrulanir.");
        softAssert.assertAll();

    }


}
