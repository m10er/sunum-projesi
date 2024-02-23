package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchAJobPage extends LoginPage{
    public SearchAJobPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[.='Explore Exciting Career Opportunities']")
    public static WebElement exploreExcitingCareerOpportunitiesText;

    public static boolean verifyDisplayecploreCareerOpportunitiesText(){
        return exploreExcitingCareerOpportunitiesText.isDisplayed();
    }


}
