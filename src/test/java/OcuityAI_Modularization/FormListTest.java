package OcuityAI_Modularization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import OcuityAIPortal.HomepageTest;
import objRepository_Modularization.pageFormList_Mod;
import objectRepository.hamburgerMenu;
import objectRepository.pageFormList;

public class FormListTest extends InspectionImagesTest {
	
	@Test(priority = 14)
	public void Test14_EditFormlistname() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		hamburgerMenu hm = new hamburgerMenu(driver);
		hm.Menu().click();
		
		Thread.sleep(1000);
		hm.Forms().click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				hm.FormList());
		Thread.sleep(1000);
		hm.FormList().click();
		
		pageFormList_Mod formlist = new pageFormList_Mod(driver);
		formlist.Edit().click();
		Thread.sleep(10000);
		formlist.Name().clear();
		formlist.Name().sendKeys(prop.getProperty("formlistname"));
		formlist.Save().click();
		formlist.OK().click();
		
		
		
	}

}
