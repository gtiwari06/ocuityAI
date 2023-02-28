package OcuityAI_Modularization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import OcuityAIPortal.HomepageTest;
import objRepository_Modularization.pageInventoryrecord;
import objectRepository.hamburgerMenu;

public class InventoryrecordsTest extends InventorytypeTest {
	
	@Test(priority = 8)
	public void Test8_AddInventoryrecord()
	{	
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		hamburgerMenu hm = new hamburgerMenu(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		hm.Menu().click();
		//hm.InspectionManagement().click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				hm.Inventoryrecord());
		hm.Inventoryrecord().click();
		pageInventoryrecord pinvent = new pageInventoryrecord(driver);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='vehicleinventory_datatable_wrapper']")));
		pinvent.AddNew().click();
		pinvent.PortName().sendKeys(prop.getProperty("portname"));
		pinvent.VehicleType().sendKeys(prop.getProperty("vehicletype"));
		pinvent.ShipName().sendKeys(prop.getProperty("Shipname"));
		pinvent.CustName().sendKeys(prop.getProperty("Custname"));
		pinvent.DockNumber().sendKeys(prop.getProperty("Docknumber"));
		pinvent.Save().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		pinvent.OK().click();
		
	}
	
	//@Test(priority = 9)
	public void Test9_EditInventoryrecord() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		pageInventoryrecord pinvent = new pageInventoryrecord(driver);
		wait.until(ExpectedConditions.elementToBeClickable(pinvent.Edit()));
		pinvent.Edit().click();
		Thread.sleep(1000);
		pinvent.VehicleType().clear();
		pinvent.VehicleType().sendKeys(prop.getProperty("vehicletype2"));
		pinvent.EditSave().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		pinvent.OK().click();
		
	}
	
	@Test(priority = 10)
	public void Test10_DeleteInventoryrecord() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		pageInventoryrecord pinvent = new pageInventoryrecord(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		pinvent.Edit().click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-md-12']/div/button")));
		pinvent.Delete().click();
		pinvent.ConfirmDelete().click();
		wait.until(ExpectedConditions.elementToBeClickable(pinvent.OK()));
		pinvent.OK().click();
		
		Thread.sleep(2000);
		//Add New 
		wait.until(ExpectedConditions.elementToBeClickable(pinvent.AddNew()));
		pinvent.AddNew().click();
		wait.until(ExpectedConditions.elementToBeClickable(pinvent.PortName()));
		pinvent.PortName().sendKeys(prop.getProperty("portname"));
		wait.until(ExpectedConditions.elementToBeClickable(pinvent.VehicleType()));
		pinvent.VehicleType().sendKeys(prop.getProperty("vehicletype"));
		pinvent.ShipName().sendKeys(prop.getProperty("Shipname"));
		pinvent.CustName().sendKeys(prop.getProperty("Custname"));
		pinvent.DockNumber().sendKeys(prop.getProperty("Docknumber"));
		pinvent.Save().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		pinvent.OK().click();
		
		
	}
	

}
