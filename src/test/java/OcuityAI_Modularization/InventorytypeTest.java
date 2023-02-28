package OcuityAI_Modularization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import OcuityAIPortal.HomepageTest;
import objRepository_Modularization.pageInventoryType;
import objectRepository.hamburgerMenu;

public class InventorytypeTest extends UsersTest {
	
	@Test(priority = 5)
	public void Test5_AddInventoryType() throws InterruptedException
	{
		//Adding a new inventory type
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hamburgerMenu hm = new hamburgerMenu(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		hm.Menu().click();
		hm.InspectionManagement().click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href ='/inventorytype']")));
		Thread.sleep(1000);
		hm.InventoryType().click();
		pageInventoryType invtype = new pageInventoryType(driver);
		
		//Clicking on Add New button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='card-content']/div/button/em")));
		invtype.AddNew().click();
		
		//selecting the module name option
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ModuleId']")));
		Select sel = new Select(driver.findElement(By.xpath("//*[@id='ModuleId']")));
		sel.selectByVisibleText("Port Inspection");
		
		//Adding inventory type name and description
		wait.until(ExpectedConditions.elementToBeClickable(invtype.InvTypefield()));
		invtype.InvTypefield().sendKeys(prop.getProperty("invtypename"));
		invtype.InvTypeDesc().sendKeys(prop.getProperty("invtypedesc"));
		
		//Adding new attributes - attribute 1
		wait.until(ExpectedConditions.elementToBeClickable(invtype.AddNewAttribute()));
		invtype.AddNewAttribute().click();
		invtype.AttributeName().sendKeys(prop.getProperty("attributename"));
		Select type = new Select(driver.findElement(By.id("attributeDataType0")));
		type.selectByVisibleText("Text");
		Select required = new Select(driver.findElement(By.id("IsRequired0")));
		required.selectByVisibleText("Yes");
		Select visible = new Select(driver.findElement(By.id("ShowOnGrid0")));
		visible.selectByVisibleText("Yes");
		
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				invtype.AddNewAttribute());
		
		//Attribute 2
		invtype.AddNewAttribute().click();
		//wait.until(ExpectedConditions.elementToBeClickable(invtype.AttributeName2()));
		invtype.AttributeName2().sendKeys(prop.getProperty("attributename2"));
		Select type2 = new Select(driver.findElement(By.id("attributeDataType1")));
		type2.selectByVisibleText("Text");
		Select required2 = new Select(driver.findElement(By.id("IsRequired1")));
		required2.selectByVisibleText("No");
		Select visible2 = new Select(driver.findElement(By.id("ShowOnGrid1")));
		visible2.selectByVisibleText("Yes");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				invtype.AddNewAttribute());
		
		//Attribute 3
		invtype.AddNewAttribute().click();
		//wait.until(ExpectedConditions.elementToBeClickable(invtype.AttributeName3()));
		invtype.AttributeName3().sendKeys(prop.getProperty("attributename3"));
		Select type3 = new Select(driver.findElement(By.id("attributeDataType2")));
		type3.selectByVisibleText("Text");
		Select required3 = new Select(driver.findElement(By.id("IsRequired2")));
		required3.selectByVisibleText("Yes");
		Select visible3 = new Select(driver.findElement(By.id("ShowOnGrid2")));
		visible3.selectByVisibleText("Yes");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				invtype.AddNewAttribute());
		
		//Attribute 4
		invtype.AddNewAttribute().click();
		//wait.until(ExpectedConditions.elementToBeClickable(invtype.AttributeName3()));
		invtype.AttributeName4().sendKeys(prop.getProperty("attributename4"));
		Select type4 = new Select(driver.findElement(By.id("attributeDataType3")));
		type4.selectByVisibleText("Text");
		Select required4 = new Select(driver.findElement(By.id("IsRequired3")));
		required4.selectByVisibleText("No");
		Select visible4 = new Select(driver.findElement(By.id("ShowOnGrid3")));
		visible4.selectByVisibleText("Yes");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				invtype.AddNewAttribute());
		
		//Attribute 5
				invtype.AddNewAttribute().click();
				//wait.until(ExpectedConditions.elementToBeClickable(invtype.AttributeName3()));
				invtype.AttributeName5().sendKeys(prop.getProperty("attributename5"));
				Select type5 = new Select(driver.findElement(By.id("attributeDataType4")));
				type5.selectByVisibleText("Number");
				Select required5 = new Select(driver.findElement(By.id("IsRequired4")));
				required5.selectByVisibleText("No");
				Select visible5 = new Select(driver.findElement(By.id("ShowOnGrid4")));
				visible5.selectByVisibleText("Yes");
		
		
		invtype.Save().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		invtype.OK().click();
		
	}

	
	@Test(priority = 6)
	public void Test6_EditInventoryType() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		pageInventoryType invtype = new pageInventoryType(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		invtype.Edit().click();
		//wait.until(ExpectedConditions.elementToBeClickable(invtype.InvTypeDesc()));
		Thread.sleep(1500);
		invtype.InvTypeDesc().clear();
		invtype.InvTypeDesc().sendKeys(prop.getProperty("invtypedesc2"));
		
		Select required2 = new Select(driver.findElement(By.id("IsRequired1")));
		required2.selectByVisibleText("No");
		
		invtype.Save().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		invtype.OK().click();
	}
	
	@Test(priority = 7)
	public void Test7_DeleteInventoryType() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		pageInventoryType invtype = new pageInventoryType(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		invtype.Edit().click();
		wait.until(ExpectedConditions.elementToBeClickable(invtype.Delete()));
		invtype.Delete().click();
		invtype.ConfirmDelete().click();
		wait.until(ExpectedConditions.elementToBeClickable(invtype.OK()));
		invtype.OK().click();
		//Thread.sleep(1000);
		//wait.until(ExpectedConditions.elementToBeClickable(invtype.AddNew()));
		
		
		// Add New type
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='card-content']/div/button/em")));
		invtype.AddNew().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ModuleId']")));
		Select sel = new Select(driver.findElement(By.id("ModuleId")));
		sel.selectByVisibleText("Port Inspection");
		invtype.InvTypefield().sendKeys(prop.getProperty("invtypename"));
		invtype.InvTypeDesc().sendKeys(prop.getProperty("invtypedesc"));
		invtype.AddNewAttribute().click();
		invtype.AttributeName().sendKeys(prop.getProperty("attributename"));
		Select type = new Select(driver.findElement(By.id("attributeDataType0")));
		type.selectByVisibleText("Text");
		Select required = new Select(driver.findElement(By.id("IsRequired0")));
		required.selectByVisibleText("Yes");
		Select visible = new Select(driver.findElement(By.id("ShowOnGrid0")));
		visible.selectByVisibleText("Yes");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				invtype.AddNewAttribute());
		
		invtype.AddNewAttribute().click();
		invtype.AttributeName2().sendKeys(prop.getProperty("attributename2"));
		Select type2 = new Select(driver.findElement(By.id("attributeDataType1")));
		type2.selectByVisibleText("Text");
		Select required2 = new Select(driver.findElement(By.id("IsRequired1")));
		required2.selectByVisibleText("Yes");
		Select visible2 = new Select(driver.findElement(By.id("ShowOnGrid1")));
		visible2.selectByVisibleText("Yes");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				invtype.AddNewAttribute());
		
		//Attribute 3
		invtype.AddNewAttribute().click();
		//wait.until(ExpectedConditions.elementToBeClickable(invtype.AttributeName3()));
		invtype.AttributeName3().sendKeys(prop.getProperty("attributename3"));
		Select type3 = new Select(driver.findElement(By.id("attributeDataType2")));
		type3.selectByVisibleText("Text");
		Select required3 = new Select(driver.findElement(By.id("IsRequired2")));
		required3.selectByVisibleText("Yes");
		Select visible3 = new Select(driver.findElement(By.id("ShowOnGrid2")));
		visible3.selectByVisibleText("Yes");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				invtype.AddNewAttribute());
		
		//Attribute 4
		invtype.AddNewAttribute().click();
		//wait.until(ExpectedConditions.elementToBeClickable(invtype.AttributeName3()));
		invtype.AttributeName4().sendKeys(prop.getProperty("attributename4"));
		Select type4 = new Select(driver.findElement(By.id("attributeDataType3")));
		type4.selectByVisibleText("Text");
		Select required4 = new Select(driver.findElement(By.id("IsRequired3")));
		required4.selectByVisibleText("No");
		Select visible4 = new Select(driver.findElement(By.id("ShowOnGrid3")));
		visible4.selectByVisibleText("Yes");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				invtype.AddNewAttribute());
		
		//Attribute 5
				invtype.AddNewAttribute().click();
			//	wait.until(ExpectedConditions.elementToBeClickable(invtype.AttributeName3()));
				invtype.AttributeName5().sendKeys(prop.getProperty("attributename5"));
				Select type5 = new Select(driver.findElement(By.id("attributeDataType4")));
				type5.selectByVisibleText("Number");
				Select required5 = new Select(driver.findElement(By.id("IsRequired4")));
				required5.selectByVisibleText("No");
				Select visible5 = new Select(driver.findElement(By.id("ShowOnGrid4")));
				visible5.selectByVisibleText("Yes");
		
		invtype.Save().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		invtype.OK().click();
		
	}
}
