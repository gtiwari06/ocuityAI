package objRepository_Modularization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageInventoryType {

	
	
	
	By addnew = By.xpath("//div[@class='card-content']/div/button/em");
	////div[@class='card-content']/div/button/em -- //button[@data-target='#addInventoryType']
	By selectmodule = By.id("ModuleId");
	By invtypefield = By.id("Type");
	By invtypedesc = By.id("Details");
	By addnewattribute = By.xpath("//*[text()='Add New attribute ']");
	By attributename = By.xpath("//*[@ng-reflect-name='DisplayName0']");
	By attributename2 = By.xpath("//*[@ng-reflect-name='DisplayName1']");
	By attributename3 = By.xpath("//*[@ng-reflect-name='DisplayName2']");
	By attributename4 = By.xpath("//*[@ng-reflect-name='DisplayName3']");
	By attributename5 = By.xpath("//*[@ng-reflect-name='DisplayName4']");
	By save = By.xpath("//button[@type='submit']");
	By ok = By.xpath("//button[contains(text(),'OK')]");
	By edit = By.xpath("(//table[@id='inventory_type_datatable']/tbody/tr/td/a)[1]");
	By delete = By.xpath("//div[@class='col-md-12']/div/button");
	By confirmDelete = By.xpath("//*[(text()='Delete')]");
	
	WebDriver driver;
	public pageInventoryType(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}



	public WebElement AddNew()
	{
		return driver.findElement(addnew);
	}
	
	public WebElement SelectModule()
	{
		return driver.findElement(selectmodule);
	}
	
	public WebElement InvTypefield()
	{
		return driver.findElement(invtypefield);
	}
	
	public WebElement InvTypeDesc()
	{
		return driver.findElement(invtypedesc);
	}
	
	public WebElement AddNewAttribute()
	{
		return driver.findElement(addnewattribute);
	}
	
	public WebElement AttributeName()
	{
		return driver.findElement(attributename);
	}
	
	public WebElement AttributeName2()
	{
		return driver.findElement(attributename2);
	}
	
	public WebElement AttributeName3()
	{
		return driver.findElement(attributename3);
	}
	
	public WebElement AttributeName4()
	{
		return driver.findElement(attributename4);
	}
	
	public WebElement AttributeName5()
	{
		return driver.findElement(attributename5);
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
	
	public WebElement Delete()
	{
		return driver.findElement(delete);
	}
	
	public WebElement ConfirmDelete()
	{
		return driver.findElement(confirmDelete);
	}
	
	
}
