package OcuityAIPortal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepository.pageFormList;
import resources.base;

public class FormListTest_old extends HomepageTest {

	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void formList_1_addFormTest() throws IOException {
		pageFormList formList = new pageFormList(driver);
		formList.Hamburger().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		formList.Forms().click();
		log.info("clicked on form");
		formList.FormList().click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", formList.AddNew());
		formList.FormName().sendKeys("Test Form");

		Select Category = new Select(formList.Category());
		Category.selectByVisibleText("Auto Inspection");

		formList.Admin().click();
		formList.Inspector().click();
		formList.OperationsManager().click();
		formList.Description().sendKeys("Test Used Vehicle Form");
		formList.Save().click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl(), "https://autodealerportalqa.azurewebsites.net/formtype");
	}
	
	@Test
	public void formList_2_addTemplateTest() throws IOException, AWTException {
		pageFormList formList = new pageFormList(driver);
		formList.HamburgerMenu().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		formList.Forms().click();
		formList.FormList().click();
		formList.Template().click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(formList.AddNewButton()));
		executor.executeScript("arguments[0].click();", formList.AddNewButton());
		formList.Title().sendKeys("Test_Form_Template");
		formList.Browse().click();
		String path = System.getProperty("user.dir");
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		StringSelection file = new StringSelection(path+"\\src\\main\\java\\resources\\Screenshot.PNG");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
}
