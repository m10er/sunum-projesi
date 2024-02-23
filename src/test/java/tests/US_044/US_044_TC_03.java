package tests.US_044;


import org.testng.annotations.Test;
import pages.AdminFeaturedCategories;
import testBase.BaseClass;

import static pages.AdminFeaturedCategories.*;
import static pages.AdminLoginPage.clickHamburgerButton;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_044_TC_03 extends BaseClass {


    @Test(groups = {"e2e","regression"})
    public void tc_03(){
        test = extent.createTest("US_043_TC_03","3-Featured Categories  sayfasına ulaştığımda add new butonu ile" +
                " ulaştığım sayfadaki formu doldurup bir kategoriyi öne çıkarabildiğimi dğrulayabilmeliyim");

        AdminFeaturedCategories adminFeaturedCategories = new AdminFeaturedCategories(driver);
        test.info("Kullanici admin olarak login olur");
        AdminFeaturedCategories.validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        clickHamburgerButton();
        test.info("Kullanici Featured Categories linkine tiklar");
        clickFeaturedCategoriesLink();
        test.info("Kullanici Add New butonuna tiklar");
        clickAddNewButton();
        test.info("Kullanici kategori turu olarak ilk secenegi secer");
        clickCategoryDropdown();
        clickFirstCategory();
        test.info("Kullanici order a 2 degereini girer");
        sendOrder("2");
        test.info("Kullanici save butonuna tiklar");
        clickSaveButton();
        test.info("KUllanici succes yazisni gorur");
        softAssert.assertTrue(verifyDisplaySuccessText(),"Basariyla yeni kategori olusturuldugu goruntulenir.");

        softAssert.assertAll();
    }




}
