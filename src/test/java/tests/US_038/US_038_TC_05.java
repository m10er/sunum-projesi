package tests.US_038;


import org.testng.annotations.Test;
import pages.AdminMoneyPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_038_TC_05 extends BaseClass {

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
        AdminMoneyPage.clickTaxEditLink();
        test.info("Acilan menude  New Tax Edit linkine tiklanir");
        AdminMoneyPage.clickTaxEditInclusive();
        test.info("Acilan sayfada Exclusive,  Inclusive olarak degistirilir");
        AdminMoneyPage.clickTaxEdiSaveButton();
        test.info("Acilan sayfada hidden kismi ON olarak degistirildikten sonra save butonuna tiklanir");
        softAssert.assertTrue(AdminMoneyPage.verifyDisplayTAxAddNewButton());
        test.pass("Acilan sayfada Return to List butonu goruntulenir");
        softAssert.assertAll();
    }

}
