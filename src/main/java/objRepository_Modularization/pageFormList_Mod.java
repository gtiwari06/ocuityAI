package objRepository_Modularization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageFormList_Mod {
	
	By edit = By.xpath("(//table[@id='datatable_formtype']/tbody/tr/td/a)[1]");
	By name = By.xpath("(//*[@id='FormTypeName'])[2]");
	By save = By.xpath("(//button[@type='submit'])[2]");
	By ok = By.xpath("//button[contains(text(),'OK')]");
	
	

	
	WebDriver driver;
	

	public pageFormList_Mod(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
	public WebElement Edit()
	{
		return driver.findElement(edit);
	}
	
	public WebElement Name()
	{
		return driver.findElement(name);
	}
	
	public WebElement Save()
	{
		return driver.findElement(save);
	}
	
	public WebElement OK()
	{
		return driver.findElement(ok);
	}

}
