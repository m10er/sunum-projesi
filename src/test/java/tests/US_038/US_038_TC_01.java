package tests.US_038;


import org.testng.annotations.Test;
import pages.AdminMoneyPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_038_TC_01 extends BaseClass {

    @Test(groups = {"smoke"})
    public void tc_01() {
        AdminMoneyPage adminMoneyPage = new AdminMoneyPage(driver);
        test=extent.createTest("Admin Login Testi", "Gecerli sifre  ve mail ile admin login olur");

        AdminMoneyPage.getAdminAbdurrahimLogin();

        AdminMoneyPage.clickHamburgerButton();

        test.info("Admin sayfasinda acilir menu butonuna tiklanilir");
        AdminMoneyPage.clickMOneyMenuButton();
        test.info("Acilan menude MONEY acilir menusune tiklanir");
        AdminMoneyPage.clickTaxesLink();
        test.info("Acilan menude Taxes linkine tiklanir");
        AdminMoneyPage.clickTaxesChildLink();
        String expectedUrl= TestData.waAdminTaxesUrl;
        String actualUrl= driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl,"Taxes Urlsi oldugu dogrulanir.");
        test.pass("Acilan sayfa url'nin" + expectedUrl+"oldugu dogrulanir.");
        softAssert.assertAll();
    }

}
