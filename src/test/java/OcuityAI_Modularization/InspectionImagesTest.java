package OcuityAI_Modularization;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import OcuityAIPortal.HomepageTest;
import objRepository_Modularization.pageInspectionImages;
import objectRepository.hamburgerMenu;

public class InspectionImagesTest extends HomepageTest {
	public WebDriverWait wait;

	@Test(priority = 11)
	public void Test11_AddImageList() throws InterruptedException
	{
		int count = 1;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 40);
		hamburgerMenu hm = new hamburgerMenu(driver);
		hm.Menu().click();
		hm.InspectionManagement().click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				hm.InspectionImages());
		hm.InspectionImages().click();
		pageInspectionImages pimage = new pageInspectionImages(driver);
	
//	    List<WebElement> ele = driver.findElements(By.id("selectedLookupKey"));
//			int count =driver.findElements(By.id("selectedLookupKey")).size();
//			Select sel = new Select(driver.findElement(By.id("selectedLookupKey")));
//			sel.selectByVisibleText("Port Inspection Image list");
//			
//			for (int i =0; i<count; i++)
//			{
//				String value = ele.get(i).getText();
//				if(value.equalsIgnoreCase("Port Inspection Image list"))
//				{
//					ele.get(i).click();	
//					break;
//				}
//			}
			
			//Add New list
		count++;
		String grpname = prop.getProperty("imagelistname")+count;
		
		pimage.AddNewList().click();
		pimage.AddListTitle().sendKeys(grpname);
		pimage.Savelist().click();
	//	int listsize = prop.getProperty("imagelistname").compareToIgnoreCase(grpname);
		while(pimage.ImagelistMsg().isDisplayed())
		{
			count++;
			String grpname2 = prop.getProperty("imagelistname")+count;
			
			pimage.Ok().click();
			//pimage.AddNewList().click();
			Thread.sleep(1000);
			pimage.AddListTitle().clear();
			pimage.AddListTitle().sendKeys(grpname2);
			pimage.Savelist().click();
		}
		//pimage.Savelist().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		pimage.Ok().click();
		pimage.AddInspection().click();
		Thread.sleep(1000);
		pimage.AddNewGrp().click();
		pimage.Grpname().sendKeys(prop.getProperty("imagegrpname1"));
		pimage.GrpAdd().click();
		pimage.Imagetitle().sendKeys(prop.getProperty("imagetitle3"));
		
		//Is Required
		Select sel1 = new Select(driver.findElement(By.xpath("(//*[@id='Required'])[2]")));
		sel1.selectByVisibleText("YES");
		pimage.Captureorder().sendKeys("1");
		pimage.Save().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		pimage.Ok().click();
		
		
		
		
		//2nd image add
		
		pimage.AddInspection().click();
		Thread.sleep(2000);
		pimage.SelectGrp().click();
		Thread.sleep(1000);
		pimage.Imagetitle().sendKeys(prop.getProperty("imagetitle1"));
		
		sel1.selectByVisibleText("YES");
		pimage.Captureorder().sendKeys("2");
		pimage.Save().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		pimage.Ok().click();
		
	
	}
	
	@Test (priority = 12)
	public void Test12_EditNewImage() throws InterruptedException
	{
		pageInspectionImages pimage = new pageInspectionImages(driver);
		pimage.EditImage().click();
		
		//Add group
//		pimage.AddNewGrp().click();
//		pimage.Grpname().sendKeys(prop.getProperty("imagegrpname2"));
//		pimage.GrpAdd().click();
//		
//		Thread.sleep(2000);
		
		pimage.Imagetitle().clear();
		pimage.Imagetitle().sendKeys(prop.getProperty("imagetitle2"));
		
		//Is Required
		    Select sel1 = new Select(driver.findElement(By.xpath("(//*[@id='Required'])[2]")));
			sel1.selectByVisibleText("NO");
			pimage.Save().click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
			pimage.Ok().click();
	
		
	}
	
	@Test(priority = 13)
	public void Test13_DeleteNewImage() throws InterruptedException
	
	{
		pageInspectionImages pimage = new pageInspectionImages(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(pimage.EditImage()));
		pimage.EditImage().click();
		//Thread.sleep(2000);
		//Delete
		wait.until(ExpectedConditions.elementToBeClickable(pimage.Delete()));
		pimage.Delete().click();
		wait.until(ExpectedConditions.elementToBeClickable(pimage.ConfirmDelete()));
		pimage.ConfirmDelete().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		pimage.Ok().click();
	}
}
