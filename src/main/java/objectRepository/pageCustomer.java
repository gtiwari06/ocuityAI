package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageCustomer {
	
	By menu = By.xpath("//div[@class='navbar-minimize']/button/em");
	
	By admin = By.xpath("//a[@title='Admin']/p/em");
	By customer = By.xpath("//a[@href='/customer']");
	By searchtext = By.xpath("//input[@type='search']");
	By searchbutton = By.xpath("//div[@id='datatables_filter']/label/div/button");
	By viewDetails = By.xpath("//*[text()='View Details ']");
	By tablename = By.xpath("//table[@id='customer_datatable']/tbody/tr/td");
	By tableemail = By.xpath("//table[@id='customer_datatable']/tbody/tr/td[2]");
	By tablephone = By.xpath("//table[@id='customer_datatable']/tbody/tr/td[3]");
	By name = By.xpath("//input[@name='custName']");
	By email = By.xpath("//input[@name='Email']");
	By phone = By.xpath("//input[@name='Phone']");
	By address1 = By.xpath("//input[@name='address1']");
	By address2 = By.xpath("//input[@name='address2']");
	By country = By.xpath("//input[@name='Country']");
	By state = By.xpath("//input[@name='CustomerState']");
	By city = By.xpath("//input[@name='City']");
	By zip = By.xpath("//input[@name='Zip']");
	By save = By.xpath("//button[@type='submit']");
	By ok = By.xpath("//button[contains(text(),'OK')]");
	By cancel = By.xpath("//div[@class='col-md-12']/div[4]/div/button");
	By delete = By.xpath("//div[@class='col-md-12']/div/button");
	By confirmDelete = By.xpath("//*[(text()='Delete')]");
	
	WebDriver driver;
	
	public pageCustomer(WebDriver driver) {
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
	
	public WebElement Customer()
	{
		return driver.findElement(customer);
	}
	
	public WebElement Searchtext()
	{
		return driver.findElement(searchtext);
	}
	
	public WebElement Searchbutton()
	{
		return driver.findElement(searchbutton);
	}
	
	public WebElement ViewDetails()
	{
		return driver.findElement(viewDetails);
	}
	
	public WebElement Tablename()
	{
		return driver.findElement(tablename);
	}
	
	public WebElement Tableemail()
	{
		return driver.findElement(tableemail);
	}
	
	public WebElement Tablephone()
	{
		return driver.findElement(tablephone);
	}
	
	public WebElement Name()
	{
		return driver.findElement(name);
	}
	
	public WebElement Phone()
	{
		return driver.findElement(phone);
	}
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	
	public WebElement Address1()
	{
		return driver.findElement(address1);
	}
	
	public WebElement Address2()
	{
		return driver.findElement(address2);
	}
	
	public WebElement Country()
	{
		return driver.findElement(country);
	}
	
	public WebElement State()
	{
		return driver.findElement(state);
	}
	
	public WebElement City()
	{
		return driver.findElement(city);
	}
	
	public WebElement Zip()
	{
		return driver.findElement(zip);
	}
	
	public WebElement Save()
	{
		return driver.findElement(save);
	}
	
	public WebElement OK()
	{
		return driver.findElement(ok);
	}
	
	public WebElement Cancel()
	{
		return driver.findElement(cancel);
	}
	
	public WebElement Delete()
	{
		return driver.findElement(delete);
	}
	
	public List<WebElement> ConfirmDelete()
	{
		return driver.findElements(confirmDelete);
	}
	
}

