package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageFormList {
	
	WebDriver driver;
	public pageFormList(WebDriver driver) {
		this.driver = driver;
	}

	By Hamburger = By.xpath("//div[@class='navbar-minimize']/button/em");

	By Forms = By.cssSelector("a[title='Forms'] p");

	By FormList = By.xpath("//span[normalize-space()='Forms List']");

	By AddNew = By.xpath("//*[@class='card-content']/div/button");

	By FormName = By.xpath(
			"/html[1]/body[1]/my-app[1]/app-layout[1]/div[1]/div[2]/formtype-table-cmp[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");

	By Category = By.xpath("//div[@class='row']//div//div[@class='col-sm-6']//select[@id='CategoryID']");

	// CheckBox Select
	By Admin = By.xpath(
			"//label[normalize-space()='Admin']//span[contains(@class,'checkbox-material')]//span[contains(@class,'check')]");

	By Inspector = By.xpath(
			"//label[normalize-space()='Inspector']//span[contains(@class,'checkbox-material')]//span[contains(@class,'check')]");

	By OperationsManager = By.xpath(
			"//label[normalize-space()='Operations Manager']//span[contains(@class,'checkbox-material')]//span[contains(@class,'check')]");

	By Description = By.xpath("//textarea[@id='Description']");

	By Save = By.xpath("//*[@id='addNewForm']/div[1]/div/div/form/div/div/div[2]/div/button[2]");

	// Back Page Navigation
	By Menu = By.xpath(
			"/html/body/my-app/app-layout/div/div[2]/formbuilder/div[1]/div[1]/div/div/div/div/form/div[2]/div[1]/div[1]/div[1]/div/button");

	By HamburgerMenu = By.xpath("//em[@class='demo-icon iconhamburgermenu']");

	By FormListMenu = (By.xpath("//span[normalize-space()='Forms List']"));

	By Template = By.xpath("//*[@class='odd']/td[3]/a");

	By AddNewButton = (By.xpath("//div[@class='card-content']/div/div/a"));

	By Title = By.xpath("//*[@id='inspTemplateTable']/div/table/tbody/tr/td[2]/div/input");

	By Browse = By.xpath("//*[@id='inspTemplateTable']/div/table/tbody/tr/td[3]/div/button");

	By Savetemplate = By.xpath("//button[contains(text(),'Save')]");

	public WebElement Hamburger() {
		return driver.findElement(Hamburger);
	}

	public WebElement Forms() {
		return driver.findElement(Forms);
	}

	public WebElement FormList() {
		return driver.findElement(FormList);
	}

	public WebElement AddNew() {
		return driver.findElement(AddNew);
	}

	public WebElement FormName() {
		return driver.findElement(FormName);
	}

	public WebElement Category() {
		return driver.findElement(Category);
	}

	public WebElement Admin() {
		return driver.findElement(Admin);
	}

	public WebElement Inspector() {
		return driver.findElement(Inspector);
	}

	public WebElement OperationsManager() {
		return driver.findElement(OperationsManager);
	}

	public WebElement Description() {
		return driver.findElement(Description);
	}

	public WebElement Save() {
		return driver.findElement(Save);
	}

	public WebElement Menu() {
		return driver.findElement(Menu);
	}

	public WebElement HamburgerMenu() {
		return driver.findElement(HamburgerMenu);
	}

	public WebElement FormListMenu() {
		return driver.findElement(FormListMenu);
	}

	public WebElement AddNewButton() {
		return driver.findElement(AddNewButton);
	}

	public WebElement Template() {
		return driver.findElement(Template);
	}

	public WebElement Title() {
		return driver.findElement(Title);
	}

	public WebElement Browse() {
		return driver.findElement(Browse);
	}
	

//Save Button Click upload the Document  
//	public WebElement Savetemplate()
//	{
//	return driver.findElement(Savetemplate);
//	}

}
