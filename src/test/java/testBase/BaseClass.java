package testBase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import utilities.GlobalVars;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BaseClass {
    public static  WebDriver driver;
    public Properties p;
    public SoftAssert softAssert;

    @BeforeMethod
   @Parameters({"os", "browser"})
   public void setup(String os, String br) throws IOException
//    public void setup() throws IOException
    {

//        String os = "windows";
//        String br="chrome";

        //loading properties file
        FileReader file=new FileReader("config.properties");
        p=new Properties();
        p.load(file);

        //launching browser based on condition
        switch(br.toLowerCase())
        {
            case "chrome": driver=new ChromeDriver(); break;
            case "edge": driver=new EdgeDriver(); break;
            default: System.out.println("No matching browser..");
                return;
        }

    //    driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        driver.manage().window().maximize();
        softAssert = new SoftAssert();
    }


    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

    public String takeScreen(String tname) throws IOException {

        String timeStamp = new SimpleDateFormat("yy.MM.dd.hh.mm.ss").format(new Date());

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        String targetFilePath=System.getProperty("user.dir")+"\\reports\\" + tname + "_" + timeStamp + ".png";
        File targetFile=new File(targetFilePath);
        FileUtils.copyFile(sourceFile, targetFile);

        return targetFilePath;
    }


}