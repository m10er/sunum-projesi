package tests.US_031;


import org.testng.annotations.Test;
import pages.AdminCompaniesPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_031_TC_05 extends BaseClass {

    @Test(groups = {"e2e","regresion", "smoke"})
    public void tc_03(){
        test=extent.createTest("Admin olarak Companies menusunde\n" +
                "eklenen sirket bilgilerinin silinebilmesi", "Eklenen sirket bilgilerinin silinmesi");
        AdminCompaniesPage adminCompaniesPage = new AdminCompaniesPage(driver);
        AdminCompaniesPage.getAdminDeryaLogin();
        AdminCompaniesPage.clickHamburgerButton();

        test.info("Hamburger butonuna tiklandi");
        AdminCompaniesPage.clickCompaniesTitle();

       test.info("Companies butonuna tiklandi");

       AdminCompaniesPage.clickCompaniesDeleteButton();
        test.info("Delete butonuna tiklandi");

        AdminCompaniesPage.clickCompaniesDeletSubmit();
        test.info("silme islemini onaylamak icin submit butonuna tiklandi");


        softAssert.assertTrue(AdminCompaniesPage.verifyCompaniesDeleteSuccesfullMesage(), "Eklenen sirket kaydi silindi");
        test.info("sirket kaydi silindigi dogrulandi");
        softAssert.assertAll();


        softAssert.assertTrue(AdminCompaniesPage.verifyAddCompaniesSuccesfullMesage(), "sirket bilgileri duzenlendi");
        test.info("Sirket bilgileri duzenlendigi dogrulandi");
        softAssert.assertAll();


    }

}
