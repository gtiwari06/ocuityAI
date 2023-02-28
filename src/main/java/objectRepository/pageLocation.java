package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageLocation {
	

	By menu = By.xpath("//div[@class='navbar-minimize']/button/em");
	
	By admin = By.xpath("//a[@title='Admin']/p/em");
	
	By locations = By.xpath("//a[@href ='/location']") ;
	
	By addNew = By.xpath("//div[@class='card-content']/div/button/em");
	
	By name = By.id("LocationName");
	
	By save = By.xpath("//button[@type='submit']");
	
	By ok = By.xpath("//div[@class='swal2-buttonswrapper']/button");
	
	By edit = By.xpath("//*[@class='odd']/td/a");
	
	By cancel = By.xpath("//div[@class='col-md-12']/div[4]/div/button");
	
	By confirmDelete = By.xpath("(//*[(text()='Delete')])[2]");
	
	By delete = By.xpath("//*[(text()='Delete')]");
	
	WebDriver driver;	

	public pageLocation(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Menu()
	{
		return driver.findElement(menu);
	}
	
	public WebElement Admin()
	{
		return driver.findElement(admin);
	}
	
	public WebElement Locations()
	{
		return driver.findElement(locations);
	}

	public WebElement AddNew()
	{
		return driver.findElement(addNew);
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

	public WebElement Edit()
	{
		return driver.findElement(edit);
	}
	
	public WebElement Cancel()
	{
		return driver.findElement(cancel);
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

