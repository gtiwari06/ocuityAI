package OcuityAIPortal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectRepository.pageGlamourImage;

public class GlamourImageTest extends HomepageTest {

	@Test
	public void glamour_1_addBackgroundImageTest() throws IOException, AWTException {
		pageGlamourImage glamourImage = new pageGlamourImage(driver);
		glamourImage.Hamburger().click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", glamourImage.admin());
		glamourImage.glamourimage().click();

		glamourImage.checkBox1();
		if (!glamourImage.checkBox1().isSelected()) {
			glamourImage.checkBox1().click();
		}
		glamourImage.checkbox2().click();
		glamourImage.upload().click();
		
		String	path = System.getProperty("user.dir");
		
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		StringSelection file = new StringSelection(path + "\\src\\main\\java\\resources\\Screenshot.PNG");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		glamourImage.Apply().click();
		glamourImage.Ok().click();
		
	}
	
	@Test
	public void glamour_2_addNewImageTest() throws IOException {
		pageGlamourImage glamourImage = new pageGlamourImage(driver);
		glamourImage.Hamburger().click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", glamourImage.admin());
		glamourImage.glamourimage().click();
		glamourImage.addnew().click();
		glamourImage.name().sendKeys("Front 2");
		glamourImage.code().sendKeys("Front 2");

		Select location = new Select(glamourImage.location());
		location.selectByVisibleText("Interior");

		Select Required = new Select(glamourImage.Required());
		Required.selectByVisibleText("NO");

		Select AIMode = new Select(glamourImage.AIMode());
		AIMode.selectByVisibleText("Still Image");
		glamourImage.save().click();
		glamourImage.Ok().click();

	}

}
