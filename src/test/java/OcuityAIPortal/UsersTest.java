package OcuityAIPortal;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectRepository.PageUsers;
import objectRepository.hamburgerMenu;
import resources.base;

public class UsersTest extends HomepageTest {

	public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void edituser() throws InterruptedException, IOException {

//		String filePath = System.getProperty("user.dir");
//		FileReader reader = new FileReader(filePath + "\\src\\main\\java\\resources\\data.properties");
//		Properties prop = new Properties();
//		prop.load(reader);
		hamburgerMenu hm = new hamburgerMenu(driver);
		hm.Menu().click();
		Thread.sleep(3000);
		hm.Admin().click();
		Thread.sleep(3000);
		hm.Users().click();
		WebElement element = driver.findElement(By.xpath("//*[@id='user_datatable']/tbody/tr/td/a"));
	    element.click();
		Thread.sleep(2000);
		PageUsers pg = new PageUsers(driver);
		pg.FirstName().clear();
		pg.FirstName().sendKeys(prop.getProperty("firstname"));
		pg.LastName().clear();
		pg.LastName().sendKeys(prop.getProperty("lastname"));
		pg.Email().clear();
		pg.Email().sendKeys(prop.getProperty("username"));
		pg.Phone().sendKeys(prop.getProperty("phone"));
		Thread.sleep(2000);
		
		Select role = new Select(pg.role());
		role.selectByVisibleText("Admin");
		Select location = new Select(pg.Location());
		location.selectByIndex(1);;
		
		WebElement save = pg.Save();
		save.click();
		Thread.sleep(2000);
		pg.OK().click();
		
		
	}

}
