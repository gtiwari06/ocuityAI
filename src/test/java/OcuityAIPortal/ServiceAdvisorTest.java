package OcuityAIPortal;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objectRepository.hamburgerMenu;
import objectRepository.pageServiceAdvisor;
import resources.base;

public class ServiceAdvisorTest extends HomepageTest{
	
	public JavascriptExecutor executor;
	public WebDriverWait wait;
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	
	@Test
	public void service_1_addServiceAdvisorTest() throws IOException, InterruptedException
	{
		//String filePath = System.getProperty("user.dir");
		//FileReader reader = new FileReader(filePath + "\\src\\main\\java\\resources\\data.properties");
		//Properties prop = new Properties();
		//prop.load(reader);
		
		hamburgerMenu hm = new hamburgerMenu(driver);		
		pageServiceAdvisor sa = new pageServiceAdvisor(driver);
		hm.Menu().click();
		Thread.sleep(3000);
		hm.Admin().click();
		Thread.sleep(3000);
		hm.ServiceAdvisor().click();
		log.info("Navigated to the Service Advisor page");
		Thread.sleep(3000);
		sa.AddNew().click();
		sa.Name().sendKeys(prop.getProperty("addsa"));
		sa.Save().click();
		Thread.sleep(2000);
		sa.OK().click();
		log.info("Added New service Advisor");
		
	
	}
	
	@Test
	public void service_2_editServiceAdvisorTest() throws InterruptedException, IOException
	{
		hamburgerMenu hm = new hamburgerMenu(driver);		
		pageServiceAdvisor sa = new pageServiceAdvisor(driver);
		log.info("Navigated to the Service Advisor page");
		Thread.sleep(3000);
		sa.Edit().click();
		Thread.sleep(2000);
		sa.Name().clear();
		Thread.sleep(2000);
		sa.Name().sendKeys(prop.getProperty("editsa"));
		sa.Save().click();
		Thread.sleep(3000);
		sa.OK().click();
		log.info("Edited the Service Advisor");
}	
	
	@Test
	public void service_3_deleteServiceAdvisor() throws InterruptedException 
	{
		hamburgerMenu hm = new hamburgerMenu(driver);		
		pageServiceAdvisor sa = new pageServiceAdvisor(driver);
		log.info("Navigated to the Service Advisor page");
		Thread.sleep(3000);
		sa.Edit().click();
		Thread.sleep(3000);
		sa.Delete().click();
		((List<WebElement>) sa.ConfirmDelete()).get(1).click();
		Thread.sleep(3000);
		sa.OK().click();
		log.info("Deleted the service Advisors successfully");
		
	}
	
	

}

