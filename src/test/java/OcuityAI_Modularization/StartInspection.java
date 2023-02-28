package OcuityAI_Modularization;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.ode.events.EventHandler.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import OcuityAIPortal.HomepageTest;
import objRepository_Modularization.pageInventoryrecord;
import objectRepository.hamburgerMenu;

public class StartInspection extends HomepageTest {

	@Test(priority = 16)
	public void Test16_StartInspection() throws InterruptedException, AWTException
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		hamburgerMenu hm = new hamburgerMenu(driver);
		hm.Menu().click();
		hm.InspectionManagement().click();
		hm.Inventoryrecord().click();
		pageInventoryrecord pinvent = new pageInventoryrecord(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		pinvent.AddInspection().click();
		pinvent.Selectoption().click();
		pinvent.OKStart().click();
		Thread.sleep(1500);
		
		//Inspection page
		String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			if (!childWindowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(childWindowHandle);
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				pinvent.PortNamefield().sendKeys("Texas Port");
				pinvent.PortAreafield().sendKeys("South US");
				pinvent.shipnamefield().sendKeys("Mersilles");
				pinvent.shiptypefield().sendKeys("Cruise");
		
				Select s = new Select(pinvent.generalinfodropdown());
				s.selectByVisibleText("Yes");
		
		//Images page
				pinvent.leftmenu().click();
				pinvent.selectimages().click();
				Thread.sleep(1000);
				pinvent.addimage().click();
				
		//document attach
				String path = System.getProperty("user.dir");
				Robot robot = new Robot();
				robot.setAutoDelay(2000);
				StringSelection file = new StringSelection(path + "\\src\\main\\java\\resources\\Screenshot.PNG");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
				robot.setAutoDelay(3000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
				robot.setAutoDelay(3000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				WebDriverWait wait = new WebDriverWait(driver, 40);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class, 'btn-success')]")));
				pinvent.ButtonOK().click();
				pinvent.DeleteImage().click();
				pinvent.ConfirmDeleteimage().click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class, 'btn-success')]")));
				pinvent.ButtonOK().click();
				Thread.sleep(2000);
				pinvent.addimage().click();
				robot.setAutoDelay(2000);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
				robot.setAutoDelay(3000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
				robot.setAutoDelay(3000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class, 'btn-success')]")));
				pinvent.ButtonOK().click();
				Thread.sleep(2000);
				
		//summary
				pinvent.leftmenu().click();
				pinvent.selectsummary().click();
				pinvent.summarycomments().sendKeys("Comments");
				
		//signature
				
				Actions builder = new Actions(driver);
				WebElement canvaselement = pinvent.signature();
				//Enter signature
				builder.contextClick(canvaselement).clickAndHold().moveToElement(canvaselement,20, -50).moveByOffset(50, 50).moveByOffset(50, -50)
				.moveByOffset(100, 50).release(canvaselement).build().perform();
				
		//submit button
				Thread.sleep(1000);
				pinvent.Submit().click();
				pinvent.ConfirmDeleteimage().click();
				pinvent.OK().click();
				
	}
		}
	}
}
