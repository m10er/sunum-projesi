package tests.US_039;

import org.testng.annotations.Test;
import pages.AdminMoneyPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_039_TC_03 extends BaseClass {
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
        AdminMoneyPage.clickCountriesLink();
        test.info("Acilan menude Countries linkine tiklanir");
        AdminMoneyPage.clickUlkeViewLink();
        test.info("Acilan menude Countries linkine tiklanir");
        softAssert.assertTrue(AdminMoneyPage.verifyUlkeReturntoListLink());
        test.pass("Acilan sayfada tablonun altindaki ulke sayilarini gosteren textin gorunur oldugu dogrulanir.");
        softAssert.assertAll();
    }


}
