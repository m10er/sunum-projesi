package tests.US_044;


import org.testng.annotations.Test;
import pages.AdminFeaturedCategories;
import pages.AdminFeaturedClients;
import pages.HomePage;
import testBase.BaseClass;
import utilities.TestData;

import static pages.AdminFeaturedCategories.*;
import static pages.AdminFeaturedClients.*;
import static pages.AdminFeaturedClients.clickYesDeletItButton;
import static pages.AdminLoginPage.clickHamburgerButton;
import static pages.AdminLoginPage.validAdminLogin;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_044_TC_06 extends BaseClass {


    @Test(groups = {"e2e","regression"})
    public void tc_06(){
        test = extent.createTest("US_043_TC_06","6-Öne çıkardığım kategorinin öne çıkarılma bilgilierini " +
                "düzenleyip ve kategoriyi  başarıyla silebildiğimi doğrulyabilmeliyim");

        AdminFeaturedCategories adminFeaturedCategories = new AdminFeaturedCategories(driver);
        test.info("Kullanici admin olarak login olur");
        AdminFeaturedCategories.validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        clickHamburgerButton();
        test.info("Kullanici Featured Categories linkine tiklar");
        clickFeaturedCategoriesLink();
        test.info("Kullanici Edit butonuna tiklar");
        clickFirstEditButton();
        test.info("Kullanici order kutusuna yeni bir deger yazar");
        senfOrderEdit("3");
        test.info("Kullanici save butonuna tiklar");
        clickEditSaveButton();
        test.info("Kullanici Succseful yazsini gorur");
        softAssert.assertTrue(AdminFeaturedCategories.verifySuccessfulUpdateCategoryText(),"Kayit guncelleme islemi basaryila sonuclanir");
        test.info("Kullanici Delete butonuna tiklar");
        clickDeleteCategoryButton();
        test.info("Kulllanici acilan alertte 'YES Delete it' secer");
        test.info("Sucssesful yazisini gorur.");
        AdminFeaturedCategories.clickYesDeletItButton();
        softAssert.assertTrue(AdminFeaturedCategories.verifysuccessDeleteText(),"Silme islemi basariyla sonuclanmsitr.");

        softAssert.assertAll();

    }




}
