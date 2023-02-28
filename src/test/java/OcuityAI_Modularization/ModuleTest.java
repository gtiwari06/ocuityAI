package OcuityAI_Modularization;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import OcuityAIPortal.HomepageTest;
import objRepository_Modularization.pageModule;
import objectRepository.hamburgerMenu;
import objectRepository.loginPage;
import objectRepository.pageServiceAdvisor;
import resources.CommonLib;
import resources.base;

public class ModuleTest extends HomepageTest {
	
	public WebDriverWait wait;
	
	
//	//@Test
//	public void Test1_permissionforModuleAdd() throws IOException, InterruptedException
//	{
//		driver = initializeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get(prop.getProperty("URL"));
//		loginPage ln = new loginPage(driver);
//		ln.Email().sendKeys(prop.getProperty("superadminusername"));
//	    ln.Password().sendKeys(prop.getProperty("superadminpassword"));
//	    JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", ln.SignIn());
//		driver.manage().window().maximize();
//		
//		hamburgerMenu hm = new hamburgerMenu(driver);
//		hm.Menu().click();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
//				hm.UsersManagement());
//		hm.UsersManagement().click();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
//				hm.rolepermission());
//		hm.rolepermission().click();
//		
//		hm.selecttenant().sendKeys("test au");
//		hm.selecttenant().click();
//		
//		Thread.sleep(5000);
//		
//		List<WebElement> options = hm.Autosuggestion();
//		
//		for(WebElement option : options)
//		{
//			if(option.getText().equalsIgnoreCase("Test Automation"))
//			{
//				option.click();
//			}
//		}
//		
//		hm.EditAdmin().click();
//		hm.AdminSettings().click();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
//				hm.AddModulePermission());
//		if(!hm.AddModuleCheckbox().isSelected())
//		{
//			hm.AddModulePermission().click();
//		}
//		hm.AdminSettings().click();	
//	}
//	
//	
	@Test(priority = 1)
	public void Test1_AddModule() throws IOException
	{	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		hamburgerMenu hm = new hamburgerMenu(driver);
		hm.Menu().click();
		hm.Admin().click();
		hm.Module().click();
		pageModule pm = new pageModule(driver);
		wait.until(ExpectedConditions.elementToBeClickable(pm.AddNew()));
		pm.AddNew().click();
		pm.ModuleName().sendKeys(prop.getProperty("modulename"));
		pm.ModuleDescription().sendKeys(prop.getProperty("moduledescription"));
		//wait.until(ExpectedConditions.textToBePresentInElement(pm.ModuleDescription(), prop.getProperty("moduledescription")));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
			pm.AppNavHome());
		
//      pm.AppNavHome().click();
//		if(!pm.AppNavHome().equals(true))
//		{
//			pm.AppNavHome().click();
//		}
		pm.Save().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		pm.OK().click();
	}
	
	@Test(priority = 2)
	public void Test2_EditModule() throws InterruptedException
	{
		pageModule pm = new pageModule(driver);
		//WebDriverWait wait = new WebDriverWait(driver, 40);
		List<WebElement> EditLink = pm.AllLinks();
		//wait.until(ExpectedConditions.elementToBeClickable(By.tagName("a")));
		//EditLink.stream().filter(editlink->editlink.getText().equalsIgnoreCase(prop.getProperty("modulename")));
		
		
		for (int i=0;i<EditLink.size();i++)
		{
			String text = EditLink.get(i).getText();
			if(text.equalsIgnoreCase(prop.getProperty("modulename")))
			{
				EditLink.get(i).click();
				break;
			}
		}
		
		Thread.sleep(1500);
		pm.ModuleDescription().clear();
		pm.ModuleDescription().sendKeys(prop.getProperty("descriptionupdate"));
		pm.Save().click();
		pm.OK().click();
		
	}
	
	@Test(priority = 3)
	public void Test3_DeleteModule() throws InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
		pageModule pm = new pageModule(driver);
		List<WebElement> EditLink = pm.AllLinks();
		
		
		for (int i=0;i<EditLink.size();i++)
		{
			String text = EditLink.get(i).getText();
			if(text.equalsIgnoreCase(prop.getProperty("modulename")))
			{
				EditLink.get(i).click();
				break;
			}
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(pm.Delete()));
		pm.Delete().click();
		pm.ConfirmDelete().click();
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading']")));
		pm.OK().click();
		
		// Add
		wait.until(ExpectedConditions.elementToBeClickable(pm.AddNew()));
		pm.AddNew().click();
		pm.ModuleName().sendKeys(prop.getProperty("modulename"));
		pm.ModuleDescription().sendKeys(prop.getProperty("moduledescription"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				pm.AppNavHome());
		
//      pm.AppNavHome().click();
//		if(!pm.AppNavHome().equals(true))
//		{
//			pm.AppNavHome().click();
//		}
		pm.Save().click();
		pm.OK().click();
	
	}

	

}
