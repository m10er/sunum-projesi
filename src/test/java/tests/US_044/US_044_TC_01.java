package tests.US_044;


import org.testng.annotations.Test;
import pages.AdminFeaturedCategories;
import pages.AdminFeaturedClients;
import testBase.BaseClass;

import static pages.AdminFeaturedCategories.clickFeaturedCategoriesLink;
import static pages.AdminLoginPage.clickHamburgerButton;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_044_TC_01 extends BaseClass {


    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_043_TC_01","1-Admin olarak giriş yapınca sol menüde yer alan featured Categories " +
                "menüsü ile önce çıkan kategorilerin bulunduğu sayfayı görüntüleyebildiğimi doğrulyabilmeliyim");

        AdminFeaturedCategories adminFeaturedCategories = new AdminFeaturedCategories(driver);
        test.info("Kullanici admin olarak login olur");
        AdminFeaturedCategories.validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        clickHamburgerButton();
        test.info("Kullanici Featured Categories linkine tiklar");
        clickFeaturedCategoriesLink();;
        String expectedUrl="https://qa.jobexplorerpro.com/admin/featured-categories";
        String actualUrl = driver.getCurrentUrl();
        test.info("Kullanici "+expectedUrl+ "linkine ulasir");
        softAssert.assertEquals(actualUrl, expectedUrl,"Featurede Kategorisine ulastigini url ile dogrular");

        softAssert.assertAll();
    }




}
