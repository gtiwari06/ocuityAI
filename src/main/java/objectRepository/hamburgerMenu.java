package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hamburgerMenu {
	
	By menu = By.xpath("//div[@class='navbar-minimize']/button/em");
	
	//By admin = By.xpath("//a[@title='Admin']/p/em");
	
	By admin = By.xpath("//a[@href ='#1']");
	
	By forms = By.xpath("//a[@href ='#2']");
	
	By locations = By.xpath("//a[@href ='/location']");
	
	By module = By.xpath("//a[@href ='/category']");	
	
	By serviceadvisor = By.xpath("//a[@href ='/serviceadvisor']") ;
	
	By users  = By.xpath("//a[@href ='/userpage']");
	
	By addNew = By.xpath("//div[@class='card-content']/div/button/em");
	
	By name = By.id("Name");
	
	By inspectionmanagement = By.xpath("//*[@title='Inspection Management']");
	
	By inventorytype  = By.xpath("//a[@href ='/inventorytype']");
	
	By inventoryrecord  = By.xpath("//a[@href ='/vehicleinventory']");
	
	By inspectionimages  = By.xpath("//a[@href ='/locationimage']");
	
	By save = By.xpath("//button[@type='submit']");
	
	By usersmanagement = By.xpath("//*[@title='Users Management']/p/em");
	//following-sibling::button
	
	By rolepermission = By.xpath("//a[@href ='/rolepermissions']");
	
	By formlist = By.xpath("//a[@href ='/formtype']");
	
	By formbuilder = By.xpath("//a[@href ='/inspectionforms']");
	
	
	By selecttenant = By.xpath("//*[@name='Name']");
	
	By autosuggestion = By.xpath("//*[@class='ng-tns-c2-1']");
	//li[class='ui-menu-item'] a
	
	By editadmin = By.xpath("//a[text()='Admin']");
	
	By adminsettings = By.xpath("//a[text()=' Admin Settings ']");
	
	By addmodulecheckbox = By.xpath("//*[@id='IsSelectedADDMod11']");
	
	By addmodulepermission = By.xpath("//a[text()='ADD - CATEGORIES ']");
	
	WebDriver driver;
	
	
	
	
	public hamburgerMenu(WebDriver driver) {
		// TODO Auto-generated constructor stub
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
	
	public WebElement Module()
	{
		return driver.findElement(module);
	}
	
	public WebElement ServiceAdvisor()
	{
		return driver.findElement(serviceadvisor);
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
	public WebElement Location()
	{
		return driver.findElement(locations);
	}
	public WebElement Users()
	{
		return driver.findElement(users);
	}
	
	public WebElement UsersManagement()
	{
		return driver.findElement(usersmanagement);
	}
	
	public WebElement rolepermission()
	{
		return driver.findElement(rolepermission);
	}
	
	public WebElement selecttenant()
	{
		return driver.findElement(selecttenant);
	}
	
	public List<WebElement> Autosuggestion()
	{
		return driver.findElements(autosuggestion);
	}
	
	public WebElement EditAdmin()
	{
		return driver.findElement(editadmin);
	}
	
	public WebElement AdminSettings()
	{
		return driver.findElement(adminsettings);
	}
	
	public WebElement AddModuleCheckbox()
	{
		return driver.findElement(addmodulecheckbox);
	}
	
	
	public WebElement AddModulePermission()
	{
		return driver.findElement(addmodulepermission);
	}
	
	public WebElement InspectionManagement()
	{
		return driver.findElement(inspectionmanagement);
	}
	
	public WebElement InventoryType()
	{
		return driver.findElement(inventorytype);
	}
	
	public WebElement Inventoryrecord()
	{
		return driver.findElement(inventoryrecord);
	}
	
	public WebElement InspectionImages()
	{
		return driver.findElement(inspectionimages);
	}
	
	public WebElement Forms()
	{
		return driver.findElement(forms);
	}
	
	public WebElement FormList()
	{
		return driver.findElement(formlist);
	}
	
	public WebElement FormBuilder()
	{
		return driver.findElement(formbuilder);
	}
}

