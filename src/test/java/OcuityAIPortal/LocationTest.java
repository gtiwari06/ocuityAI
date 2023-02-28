package OcuityAIPortal;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import objectRepository.hamburgerMenu;
import objectRepository.pageLocation;
import resources.base;

public class LocationTest extends HomepageTest {
	
	
	public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void Location_1_addLocation() throws InterruptedException, IOException
	{ 
//		String filePath = System.getProperty("user.dir");
//		FileReader reader = new FileReader(filePath + "\\src\\main\\java\\resources\\data.properties");
//		Properties prop = new Properties();
//		prop.load(reader);
		hamburgerMenu hm = new hamburgerMenu(driver);
		hm.Menu().click();
		hm.Admin().click();
		Thread.sleep(2000);
		hm.Location().click();
		pageLocation pl = new pageLocation(driver);
		Thread.sleep(5000);
		pl.AddNew().click();
		pl.Name().sendKeys(prop.getProperty("addlocation"));
		pl.Save().click();
		Thread.sleep(5000);
		pl.OK().click();
		
		
	}

	@Test
	public void Location_2_editLocation() throws InterruptedException, IOException
	{
//		String filePath = System.getProperty("user.dir");
//		FileReader reader = new FileReader(filePath + "\\src\\main\\java\\resources\\data.properties");
//		Properties prop = new Properties();
//		prop.load(reader);
		
		pageLocation pl = new pageLocation(driver);
		WebElement element = pl.Edit();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(3000);
		pl.Name().clear();
		Thread.sleep(2000);
		pl.Name().sendKeys(prop.getProperty("editlocation"));
		pl.Save().click();
		Thread.sleep(3000);
		pl.OK().click();
		
	}
	
	@Test
	public void Location_3_deleteLocation() throws InterruptedException 
	{
		
		pageLocation pl = new pageLocation(driver);
		WebElement element = pl.Edit();	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);	
			Thread.sleep(3000);
			pl.Delete().click();
			 Thread.sleep(2000);
		 pl.ConfirmDelete().click();
		 Thread.sleep(5000);
		  pl.OK().click();
		 
		
	
	}
	
	
}
