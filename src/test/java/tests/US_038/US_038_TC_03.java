package tests.US_038;


import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AdminMoneyPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_038_TC_03 extends BaseClass {

    @Test(groups = {"smoke"})
    public void tc_03() {
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
        AdminMoneyPage.clickTaxAddNewButton();
        test.info("Acilan menude Add New butonuna tiklanir");
        AdminMoneyPage.sendTaxNameKutusu();
        test.info("Acilan sayfada name kismina \"New Tax\" yazilir");
        AdminMoneyPage.sendTaxPercentageKutusu();
        test.info("Acilan sayfada Percentage kismina \"20\" yazilir");
        AdminMoneyPage.clickTaxExclusiveSecimi();
        test.info("Acilan sayfada Type kismindan Exclusive secilir");
        test.info("Acilan sayfada Countries kismindan All secilir");
        AdminMoneyPage.clickTaxSaveButton();
        softAssert.assertTrue(AdminMoneyPage.verifyDisplayTAxAddNewButton());
        test.pass("Acilan sayfada Add New butonu goruntulenir");
        softAssert.assertAll();

    }

}
