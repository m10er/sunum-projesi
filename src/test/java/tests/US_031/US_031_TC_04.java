package tests.US_031;


import org.testng.annotations.Test;
import pages.AdminCompaniesPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_031_TC_04 extends BaseClass {

    @Test(groups = {"e2e","regresion", "smoke"})
    public void tc_03(){
        test=extent.createTest("Admin olarak Companies menusunde\n" +
                "eklenen sirket bilgilerinin duzenlenmesi", "Eklenen sirket bilgilerini duzenleme");
        AdminCompaniesPage adminCompaniesPage = new AdminCompaniesPage(driver);
        AdminCompaniesPage.getAdminDeryaLogin();
        AdminCompaniesPage.clickHamburgerButton();

        test.info("Hamburger butonuna tiklandi");
        AdminCompaniesPage.clickCompaniesTitle();

       test.info("Companies butonuna tiklandi");

       AdminCompaniesPage.clickCompaniesEditButton();
        test.info("Edit butonuna tiklandi");

        AdminCompaniesPage.sendCompaniesEmail();
        test.info("Email texti duzenlendi");

        AdminCompaniesPage.clickAddCompaniesSaveButton();
        test.info("Save butonuna tiklandi");


        softAssert.assertTrue(AdminCompaniesPage.verifyAddCompaniesSuccesfullMesage(), "sirket bilgileri duzenlendi");
        test.info("Sirket bilgileri duzenlendigi dogrulandi");
        softAssert.assertAll();



    }

}
