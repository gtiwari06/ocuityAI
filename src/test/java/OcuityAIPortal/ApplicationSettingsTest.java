package OcuityAIPortal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import objectRepository.hamburgerMenu;
import objectRepository.pageApplicationSettings;

public class ApplicationSettingsTest extends HomepageTest {

	@Test
	public void validateSettings() throws IOException, AWTException {
		hamburgerMenu hm = new hamburgerMenu(driver);
		pageApplicationSettings settings = new pageApplicationSettings(driver);
		hm.Menu().click();
		hm.Admin().click();
		settings.AppSet().click();	 
		settings.Key().sendKeys("12345");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", settings.Logo());
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
