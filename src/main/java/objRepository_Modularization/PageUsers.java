package objRepository_Modularization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUsers {
	

	By edituser = By.xpath("//*[@id='user_datatable']/tbody/tr/td/a");

	By firstname = By.id("FirstName");
	
	By lastname = By.id("LastName");
	
	By email = By.id("Email");
	
	By phone = By.id("Phone");
	
	By role = By.xpath("(//select[@name='RoleID'])[2]");
	
	By location = By.xpath("//select[@name='LocationID']");
	
	By username = By.xpath("//input[@name='UniqueKey']");
	
	By save = By.xpath("//button[@type='submit']");
	
	By ok = By.xpath("//button[contains(text(),'OK')]");
	
	By Cancelpopup = By.xpath("(//button[contains(text(),'Cancel')])[2]");
	
	
	By tablerole = By.xpath("//*[@id='datatables']/tbody/tr/td[4]");
	
	By selectcheckbox = By.xpath("//*[@id='checkbox_0']/following-sibling::span/span");
	

	WebDriver driver;
	
	public PageUsers(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement FirstName() 
	{
	   return driver.findElement(firstname);	
	}
	
	public WebElement LastName() 
	{
	   return driver.findElement(lastname);	
	}
	
	public WebElement Email() 
	{
	   return driver.findElement(email);	
	}
	
	public WebElement Phone() 
	{
	   return driver.findElement(phone);	
	}
	
	public WebElement role() 
	{
	return driver.findElement(role);
 	
	}
	
	public WebElement Location() 
	{
	return driver.findElement(location);
 	
	}

	public WebElement EditUser() 
	{
	return driver.findElement(edituser);
 	
	}
	
	
	public WebElement Username() 
	{
	   return driver.findElement(username);	
	}
	
	public WebElement Save()
	{
		return driver.findElement(save);
	}
	
	public WebElement OK()
	{
		return driver.findElement(ok);
	}

	public WebElement Cancelpopup()
	{
		return driver.findElement(Cancelpopup);
	}
	
	public WebElement Tablerole()
	{
		return driver.findElement(tablerole);
	}
	
	public WebElement SelectCheckbox()
	{
		return driver.findElement(selectcheckbox);
	}
}
