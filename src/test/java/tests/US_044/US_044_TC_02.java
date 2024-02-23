package tests.US_044;


import org.testng.annotations.Test;
import pages.AdminFeaturedCategories;
import testBase.BaseClass;

import static pages.AdminFeaturedCategories.clickFeaturedCategoriesLink;
import static pages.AdminFeaturedCategories.tableNumberText;
import static pages.AdminLoginPage.clickHamburgerButton;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_044_TC_02 extends BaseClass {


    @Test(groups = {"e2e","regression"})
    public void tc_02(){
        test = extent.createTest("US_043_TC_02","2-Admin olarak giriş yapıp öne çıkan müşteriler sayfasına " +
                "ulaştığımda öne çıkan kategorileri ve öne çıkan kategori sayısını görüntüleyebildiğimi doğrulyabilmeliyim");

        AdminFeaturedCategories adminFeaturedCategories = new AdminFeaturedCategories(driver);
        test.info("Kullanici admin olarak login olur");
        AdminFeaturedCategories.validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        clickHamburgerButton();
        test.info("Kullanici Featured Categories linkine tiklar");
        clickFeaturedCategoriesLink();;
        softAssert.assertTrue(tableNumberText.isDisplayed(),"Featured Category tablo sayisi goruntulenir.");

        softAssert.assertAll();
    }




}
