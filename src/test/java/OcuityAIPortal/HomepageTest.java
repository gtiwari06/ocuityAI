package OcuityAIPortal;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.loginPage;
import resources.base;

public class HomepageTest extends base{
	
	//private static final int Priority = 0;

	@BeforeTest(alwaysRun=true)
	public void baseNavigation() throws IOException
	{
	driver = initializeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty("URL"));
	loginPage ln = new loginPage(driver);
	ln.Email().sendKeys(prop.getProperty("username"));
    ln.Password().sendKeys(prop.getProperty("password"));
    JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", ln.SignIn());
	driver.manage().window().maximize();
	}
		
	                    
		@AfterTest(alwaysRun=true)
		public void tearDown() {
			driver.quit();
	}
}




