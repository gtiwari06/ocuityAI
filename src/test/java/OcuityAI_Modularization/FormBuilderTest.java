package OcuityAI_Modularization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import OcuityAIPortal.HomepageTest;
import objRepository_Modularization.pageFormBuilder;
import objectRepository.hamburgerMenu;

public class FormBuilderTest extends HomepageTest {
	
	@Test(priority = 15)
	public void Test15_Createform() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hamburgerMenu hm = new hamburgerMenu(driver);
		hm.Menu().click();
		hm.Forms().click();
		hm.FormBuilder().click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@id='inspectionforms_datatable']/tbody/tr/td/a)[1]")));
		pageFormBuilder fbp = new pageFormBuilder(driver);
		fbp.EditForm().click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='customCollapse0']/div/div/div/div/button/em")));
		Thread.sleep(4000);
		
		//General Info
		fbp.AddPage().click();
		Thread.sleep(2000);
		fbp.PageName().clear();
		fbp.PageName().sendKeys(prop.getProperty("pagename"));
		Thread.sleep(2000);
		
		//Drag and drop text field and dropdown
		Actions a = new Actions(driver);
		a.dragAndDrop(fbp.Textfield(), fbp.Col1row1()).build().perform();
		fbp.Col1row1label().clear();
		fbp.Col1row1label().sendKeys(prop.getProperty("label1"));
		a.dragAndDrop(fbp.Textfield(), fbp.Col2row1()).build().perform();
		fbp.Col1row1label().clear();
		fbp.Col1row1label().sendKeys(prop.getProperty("label2"));
		a.dragAndDrop(fbp.Textfield(), fbp.Col3row1()).build().perform();
		fbp.Col1row1label().clear();
		fbp.Col1row1label().sendKeys(prop.getProperty("label3"));
		a.dragAndDrop(fbp.Textfield(), fbp.Col4row1()).build().perform();
		fbp.Col1row1label().clear();
		fbp.Col1row1label().sendKeys(prop.getProperty("label4"));
		
		
		a.dragAndDrop(fbp.ColSize3(), fbp.Dragcolhere()).build().perform();
		a.dragAndDrop(fbp.Dropdown(), fbp.Col1row2()).build().perform();
		fbp.Col1row1label().clear();
		fbp.Col1row1label().sendKeys(prop.getProperty("label5"));
		Select sel = new Select(fbp.DropdownValue());
		sel.selectByVisibleText("YesNo");
		
		//Add another page and drag drop image analysis control
		Thread.sleep(4000);
		fbp.AddPage().click();
		Thread.sleep(2000);
		fbp.PageName().clear();
		fbp.PageName().sendKeys(prop.getProperty("pagename2"));
		Thread.sleep(2000);
		fbp.DeletePanel().click();
		fbp.ConfirmDelete().click();
		Thread.sleep(1500);
		
		
		a.dragAndDrop(fbp.ColSize1(), fbp.DragcolherePage2()).build().perform();
		a.dragAndDrop(fbp.ImageAnalysis(), fbp.Col1row1()).build().perform();
		Thread.sleep(1500);
		//Select image list
		Select sel1 = new Select(fbp.DropdownValue());
		sel1.selectByVisibleText("Port Inspection Image list");
		Thread.sleep(1500);
		
		//Add sign on page
		fbp.AddPage().click();
		Thread.sleep(2000);
		fbp.PageName().clear();
		fbp.PageName().sendKeys(prop.getProperty("pagename3"));
		Thread.sleep(2000);
		fbp.DeletePanel().click();
		fbp.ConfirmDelete().click();
		Thread.sleep(1500);
		
		//column size 2 
		a.dragAndDrop(fbp.ColSize2(), fbp.DragcolherePage2()).build().perform();
		
		//text field for comments
		a.dragAndDrop(fbp.Textfield(), fbp.Col1row1()).build().perform();
		fbp.Col1row1label().clear();
		fbp.Col1row1label().sendKeys(prop.getProperty("label6"));
		
		fbp.Addrow().click();
		
		Thread.sleep(1000);
		
		a.dragAndDrop(fbp.Signature(), fbp.row2Col1()).build().perform();
		fbp.Col1row1label().clear();
		fbp.Col1row1label().sendKeys(prop.getProperty("label7"));
		//a.dragAndDrop(, target)
		
		a.dragAndDrop(fbp.Date(), fbp.row2Col2()).build().perform();
		fbp.Col1row1label().clear();
		fbp.Col1row1label().sendKeys(prop.getProperty("label8"));
		Thread.sleep(1500);
		
		//Delete page 1
		fbp.Page1().click();
		fbp.DeletePage().click();
		fbp.DeleteYes().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Save']")));
		
		//save and publish
		fbp.Saveform().click();
		fbp.OK().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Publish']")));
		fbp.Publishform().click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='OK']")));
		Thread.sleep(6000);
		fbp.OK().click();
	
		
	}
	

}
