package objRepository_Modularization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageInventoryrecord {

	By addNewlist = By.xpath("//button[@data-target='#saveUpdateNewModal']");
	By portname = By.xpath("(//*[@id='Value'])[1]");
	By vehicletype = By.xpath("(//*[@id='Value'])[2]");
	By shipname = By.xpath("(//*[@id='Value'])[3]");
	By custname = By.xpath("(//*[@id='Value'])[4]");
	By docknumber = By.xpath("//*[@id='Value4']");
	By save = By.xpath("(//button[@type='submit'])[2]");
	By editsave = By.xpath("//button[@type='submit']");
	By ok = By.xpath("//button[contains(text(),'OK')]");
	By edit = By.xpath("(//table[@id='vehicleinventory_datatable']/tbody/tr/td/a)[1]");
	By delete = By.xpath("//div[@class='col-md-12']/div/button");
	By confirmDelete = By.xpath("(//*[(text()='Delete')])[2]");
	By addinspection = By.xpath("//*[text()=' + Add Inspection']");
	By selectoption = By.xpath("(//*[text()='Port Inspection'])[2]");
	By portnamefield = By.id("Field2");
	By portareafield = By.id("Field3");
	By shipnamefield = By.id("Field4");
	By shiptypefield = By.id("Field5");
	By generalinfodropdown = By.xpath("//*[@id='Field6PropertyText']");
	By leftmenu = By.xpath("//*[@class='full-row']/div");
	By selectimages = By.xpath("//*[text()='Images']");
	By selectsummary = By.xpath("//*[text()='Summary']");
	By summarycomments = By.xpath("//*[@id='Field8']");
	By signature = By.id("signCanvasWrap");
	By addimage = By.xpath("(//*[@title='Upload Image'])[2]");
	By buttonok = By.xpath("//button[contains(@class, 'btn-success')]");
	By deleteimage = By.xpath("//*[text()='DELETE']");
	By confirmdeleteimage = By.xpath("//*[text()='Yes']");
	By submit = By.xpath("//em[contains(@class, 'iconsuccess')]");
	By okstart =  By.xpath("//button[text()=' Ok ']");
			
	
	WebDriver driver;
	public pageInventoryrecord(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}



	public WebElement AddNew()
	{
		return driver.findElement(addNewlist);
	}
	
	public WebElement PortName()
	{
		return driver.findElement(portname);
	}
	
	public WebElement ShipName()
	{
		return driver.findElement(shipname);
	}
	
	public WebElement CustName()
	{
		return driver.findElement(custname);
	}
	
	public WebElement DockNumber()
	{
		return driver.findElement(docknumber);
	}
	
	public WebElement AddInspection()
	{
		return driver.findElement(addinspection);
	}
	
	public WebElement PortNamefield()
	{
		return driver.findElement(portnamefield);
	}
	
	public WebElement PortAreafield()
	{
		return driver.findElement(portareafield);
	}
	
	public WebElement shipnamefield()
	{
		return driver.findElement(shipnamefield);
	}
	
	public WebElement shiptypefield()
	{
		return driver.findElement(shiptypefield);
	}
	
	public WebElement ButtonOK()
	{
		return driver.findElement(buttonok);
	}
	
	public WebElement generalinfodropdown()
	{
		return driver.findElement(generalinfodropdown);
	}
	
	public WebElement ConfirmDeleteimage()
	{
		return driver.findElement(confirmdeleteimage);
	}
	
	public WebElement OKStart()
	{
		return driver.findElement(okstart);
	}
	
	public WebElement leftmenu()
	{
		return driver.findElement(leftmenu);
	}
	
	public WebElement DeleteImage()
	{
		return driver.findElement(deleteimage);
	}
	
	public WebElement selectimages()
	{
		return driver.findElement(selectimages);
	}
	
	public WebElement selectsummary()
	{
		return driver.findElement(selectsummary);
	}
	
	public WebElement summarycomments()
	{
		return driver.findElement(summarycomments);
	}
	
	public WebElement signature()
	{
		return driver.findElement(signature);
	}
	
	public WebElement addimage()
	{
		return driver.findElement(addimage);
	}
	
	
	public WebElement Selectoption()
	{
		return driver.findElement(selectoption);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
	
	public WebElement VehicleType()
	{
		return driver.findElement(vehicletype);
	}
	
	public WebElement Save()
	{
		return driver.findElement(save);
	}
	
	public WebElement EditSave()
	{
		return driver.findElement(editsave);
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
