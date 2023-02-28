package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import objectRepository.loginPage;


public class base {
	
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		
		prop = new Properties();
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		 
		 prop.load(fis);
	 String BrowserName = prop.getProperty("browser");
	 
	 
	 if (BrowserName.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver_109\\chromedriver.exe");
		 driver = new ChromeDriver();
	 }
	 else if (BrowserName.equals("firefox"))
	 {
		 System.setProperty("webdriver.firefox.driver", "D:\\Selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	        driver = new FirefoxDriver();
	 }
	 else if (BrowserName.equals("IE"))
	 {
		 
	 }
	 
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 return driver;
	}	
	
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String destinationfile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source, new File(destinationfile));
	return destinationfile;
	}
	
	
	
}
