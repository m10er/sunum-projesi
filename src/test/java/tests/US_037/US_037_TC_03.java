package tests.US_037;

import org.testng.annotations.Test;
import pages.AdminMoneyPage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_037_TC_03 extends BaseClass {

    @Test(groups = {"smoke"})
    public void tc_02() {
        AdminMoneyPage adminMoneyPage = new AdminMoneyPage(driver);
        test=extent.createTest("Admin Login Testi", "Gecerli sifre  ve mail ile admin login olur");

        AdminMoneyPage.getAdminAbdurrahimLogin();

        AdminMoneyPage.clickHamburgerButton();

        test.info("Admin sayfasinda acilir menu butonuna tiklanilir");
        AdminMoneyPage.clickMOneyMenuButton();
        test.info("Acilan menude MONEY acilir menusune tiklanir");
        AdminMoneyPage.clickInvoicesLInk();

        test.info("Acilan menude Invoices linkine tiklanir");
        AdminMoneyPage.clickInvoicesViewLink();
        test.info("Acilan menude dorduncu satirdaki View linkine tiklanir");
        ReusableMethods.switchToWindowWithTitle(driver,"Invoice - Job Explorer Pro");
        softAssert.assertTrue(AdminMoneyPage.verifyDisplayedinvoiceFromText());
        test.pass("Acilan sayfadaki dorduncu faturanin ayrintilari View linkine tiklanarak goruntulenir");
        softAssert.assertAll();

    }

}
