package objRepository_Modularization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageModule {
	
	By addnew = By.xpath("//div[@class='card-content']/div/button/em");
	By modulename = By.id("CategoryKey");
	By moduledescription = By.id("Details");
	By appNavHome = By.id("HOME");
	By save = By.xpath("//button[@type='submit']");
	By ok = By.xpath("//button[contains(text(),'OK')]");
	By editlinks = By.tagName("a");
	By delete = By.xpath("//div[@class='col-md-12']/div/button");
	By confirmDelete = By.xpath("(//*[text()='Delete'])[2]");
	
	WebDriver driver;
	
	public pageModule(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement AddNew()
	{
		return driver.findElement(addnew);
	}
	
	public WebElement ModuleName()
	{
		return driver.findElement(modulename);
	}
	
	public WebElement ModuleDescription()
	{
		return driver.findElement(moduledescription);
	}
	
	public WebElement AppNavHome()
	{
		return driver.findElement(appNavHome);
	}
	
	public WebElement Save()
	{
		return driver.findElement(save);
	}
	
	public WebElement OK()
	{
		return driver.findElement(ok);
	}
	
	public List<WebElement> AllLinks()
	{
		return driver.findElements(editlinks);
	}

	public WebElement Delete()
	{
		return driver.findElement(delete);
	}
	
	public WebElement ConfirmDelete()
	{
		return driver.findElement(confirmDelete);
	}

	
}
