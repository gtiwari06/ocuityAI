package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageGlamourImage {

	By Hamburger = By.xpath("//div[@class='navbar-minimize']/button/em");
	By admin = By.xpath("//*[contains(@title, 'Admin')]");
	By glamourimage = By.xpath("//span[.='Images']");
	//By checkBox1 = By.xpath("//span[@class='check']");
	By checkBox1 = By.xpath("//*[contains(text(),'Enable Background')]");
	//By checkbox2 = By.xpath("/html[1]/body[1]/my-app[1]/app-layout[1]/div[1]/div[2]/app-locationimage[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]");
	By checkbox2 = By.xpath("//*[contains(text(),'Attach Custom')]");
	
	By upload = By.xpath("//*[contains(@title, 'Upload Image')]");
	By addnew = By.xpath("//button[contains(text(),'Add New')]");
	By apply = By.xpath("//*[contains(text(),'APPLY')]");
	By ok = By.xpath("//*[contains(text(),'OK')]");
	By name = By.name("Name");
	By code = By.name("Code");
	By location = By.name("Location");
	By Required = By.id("Required");
	By AIMode   = By.name("AIMode");
	By save     =By.xpath("//button[contains(text(),'Save')]");
	
	WebDriver driver;
	public pageGlamourImage(WebDriver driver) {
		this.driver = driver;		
	}

	public WebElement Hamburger()
	{
		return driver.findElement(Hamburger);
	}
	
	public WebElement admin()
	{
		return driver.findElement(admin);
	}
	
	public WebElement glamourimage()
	{
		return driver.findElement(glamourimage);
	}
	
	public WebElement checkBox1()
	{
		return driver.findElement(checkBox1);
	}
	public WebElement checkbox2()
	{
		return driver.findElement(checkbox2);
	}
	public WebElement upload()
	{
		return driver.findElement(upload);
	}
	public WebElement addnew()
	{
		return driver.findElement(addnew);
	}
	
	public WebElement Apply()
	{
		return driver.findElement(apply);
	}
	
	public WebElement Ok()
	{
		return driver.findElement(ok);
	}
	
	public WebElement name()
	{
		return driver.findElement(name);
	}
	public WebElement code()
	{
		return driver.findElement(code);
	}
	public WebElement location()
	{
		return driver.findElement(location);
	}
	public WebElement Required()
	{
		return driver.findElement(Required);
	}	
	public WebElement AIMode()
	{
		return driver.findElement(AIMode);
	}
	public WebElement save()
	{
		return driver.findElement(save);
	}
	
	
}
	
