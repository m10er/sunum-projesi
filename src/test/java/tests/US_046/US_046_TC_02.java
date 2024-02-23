package tests.US_046;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_046_TC_02 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_02(){
        test = extent.createTest("US_046_TC_02","2-Admin le giriş yaptıktan sonra admin dashboard'un header bölümündeki logoya tıklayarak" +
                " açılan menüden profil bilgilerimi düzenleme sayfasına giderek başarıyla bilgilerimi düzenlyebilmeiyim");

        AdminDashboardPage adminDashboardPage= new AdminDashboardPage(driver);
        test.info("Kullanici admin olarak login olur");
        AdminDashboardPage.validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        AdminDashboardPage.clickHamburgerButton();
        test.info("kullanici Dashboard linkine tiklar");
        AdminDashboardPage.clickDashboardLink();
        test.info("Kullanici headerdaki profil logoya tiklar");
        AdminDashboardPage.clickLogo();
        test.info("Kullanici profile tiklar");
        AdminDashboardPage.clickProfilDetail();
        test.info("KUllanici Edit My Profile tiklar");
        AdminDashboardPage.clickEditMyProfilButton();
        test.info("kullanici bio girer");
        AdminDashboardPage.sendBio(TestData.fakeBio);
        test.info("Kullanici Location girer");
        AdminDashboardPage.sendlocationText(TestData.fakeLocation);
        test.info("Kullanici Save butonuna tiklar");
        AdminDashboardPage.clickProfileSave();
        test.info("Kullanici profile save isleminin basraili oldugu yazsini gorur");
        softAssert.assertTrue(AdminDashboardPage.verifyDisplayProfileSaveSuccessMessage(), "Profilin basariyla kaydedildigini gorur" );

        softAssert.assertAll();
    }



}
