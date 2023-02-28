package OcuityAI_Modularization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import OcuityAIPortal.HomepageTest;
import objRepository_Modularization.PageUsers;
import objectRepository.hamburgerMenu;

//Selecting the module for the user on users page
public class UsersTest extends ModuleTest {
	
	@Test(priority = 4)
	public void Test4_UserModuleSelect() throws InterruptedException
	{
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		hamburgerMenu hm = new hamburgerMenu(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		hm.Menu().click();
		//hm.Admin().click();
		hm.Users().click();
		PageUsers pg = new PageUsers(driver);
		pg.EditUser().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='checkbox_0']/following-sibling::span/span")));
		if(!pg.SelectCheckbox().isSelected()) {
		pg.SelectCheckbox().click();
		}
		pg.Save().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		pg.OK().click();
	}

}
