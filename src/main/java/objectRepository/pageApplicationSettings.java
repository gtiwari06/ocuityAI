package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageApplicationSettings {

    By menu = By.xpath(("//div[@class='navbar-minimize']/button/em"));
	By admin = By.xpath("//a[@title='Admin']/p/em");
	By appset = By.xpath("//a[@href='/tenantinfo']");
	By logo = By.xpath("//button[.='Update Image']");
	By key = By.id("PasswordKey");
	
	
	WebDriver driver;
	public pageApplicationSettings(WebDriver driver)
	{
		this.driver= driver;
			
	}
	
	public WebElement Menu()
	{
		return driver.findElement(menu);
	}
	
	public WebElement Admin()
	{
		return driver.findElement(admin);
	}
	
	public WebElement AppSet()
	{
		return driver.findElement(appset);
	}
	
	public WebElement Logo()
	{
		return driver.findElement(logo);
	}

	public WebElement Key() 
	{
		return driver.findElement(key);
	}

}
