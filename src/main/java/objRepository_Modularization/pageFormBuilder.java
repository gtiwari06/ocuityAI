package objRepository_Modularization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageFormBuilder {
	
	By editform = By.xpath("(//table[@id='inspectionforms_datatable']/tbody/tr/td/a)[1]");
	By addpage = By.xpath("//*[@id='customCollapse0']/div/div/div/div/button");
	By pagename = By.id("Name");
	By textfield = By.xpath("//*[@id='FormElement_3']/div");
	By col1row1 = By.xpath("//*[@id='emptycolumn_0_0_0']");
	By col2row1 = By.xpath("//*[@id='emptycolumn_0_0_1']");
	By col3row1 = By.xpath("//*[@id='emptycolumn_0_0_2']");
	By col4row1 = By.xpath("//*[@id='emptycolumn_0_0_3']");
	By col1row2  = By.xpath("//*[@id='emptycolumn_1_0_0']");
	
	By row2col1 = By.xpath("//*[@id='emptycolumn_0_1_0']");
	By row2col2 = By.xpath("//*[@id='emptycolumn_0_1_1']");
	By date = By.xpath("//*[@id='FormElement_4']/div");
	
	By col1row1label = By.xpath("(//*[@id='Value'])[2]");
	By colsize3 = By.xpath("//*[@id='LayoutElement_3']");
	By colsize1 = By.xpath("//*[@id='LayoutElement_1']");
	By colsize2 = By.xpath("//*[@id='LayoutElement_2']");
	By dragcolhere = By.xpath("//*[@id='DropLayout_1']");
	By dropdown = By.xpath("//*[@id='FormElement_8']/div");
	By imageanalysis = By.xpath("//*[@id='FormElement_29']/div");
	By signature = By.xpath("//*[@id='FormElement_6']/div");
	By dropdownvalue = By.xpath("//select[@id='Value']");
	By deletepanel = By.xpath("//*[text()='DELETE PANEL']");
	By confirmdelete = By.xpath("//*[text()='Yes']");
	By ok = By.xpath("//*[text()='OK']");
	By dragcolherepage2 = By.xpath("//*[@id='DropLayout_0']");
	By addrow = By.xpath("//*[text()=' + ADD ROW ']");
	
	By page1 = By.xpath("//*[text()=' Page 1 ']");
	By deletepage = By.xpath("//*[text()=' DELETE PAGE ']");
	By deleteyes = By.xpath("//*[@class='swal2-confirm btn btn-success']");
	
	By saveform = By.xpath("//button[@title='Save']");
	By publishform = By.xpath("//button[@title='Publish']");
	By publishok = By.xpath("//*[@class='swal2-confirm btn btn-success']");
	
	
	
	WebDriver driver;
	
	
	public pageFormBuilder(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}




	public WebElement EditForm()
	{
		return driver.findElement(editform);
	}

	public WebElement AddPage()
	{
		return driver.findElement(addpage);
	}
	
	public WebElement PublishOK()
	{
		return driver.findElement(publishok);
	}
	
	public WebElement Date()
	{
		return driver.findElement(date);
	}
	
	public WebElement Page1()
	{
		return driver.findElement(page1);
	}
	
	public WebElement DeletePage()
	{
		return driver.findElement(deletepage);
	}
	
	public WebElement DeleteYes()
	{
		return driver.findElement(deleteyes);
	}
	
	public WebElement PageName()
	{
		return driver.findElement(pagename);
	}
	
	public WebElement Textfield()
	{
		return driver.findElement(textfield);
	}
	
	public WebElement Col1row1()
	{
		return driver.findElement(col1row1);
	}
	
	public WebElement Col1row1label()
	{
		return driver.findElement(col1row1label);
	}
	
	public WebElement Col2row1()
	{
		return driver.findElement(col2row1);
	}
	
	public WebElement row2Col1()
	{
		return driver.findElement(row2col1);
	}
	
	public WebElement row2Col2()
	{
		return driver.findElement(row2col2);
	}

	public WebElement Col3row1()
	{
		return driver.findElement(col3row1);
	}
	
	public WebElement Col4row1()
	{
		return driver.findElement(col4row1);
	}
	
	public WebElement ColSize3()
	{
		return driver.findElement(colsize3);
	}
	
	public WebElement Dragcolhere()
	{
		return driver.findElement(dragcolhere);
	}
	
	public WebElement Dropdown()
	{
		return driver.findElement(dropdown);
	}
	
	public WebElement DropdownValue()
	{
		return driver.findElement(dropdownvalue);
	}
	
	public WebElement Col1row2()
	{
		return driver.findElement(col1row2);
	}
	
	public WebElement ImageAnalysis()
	{
		return driver.findElement(imageanalysis);
	}
	
	public WebElement DeletePanel()
	{
		return driver.findElement(deletepanel);
	}
	
	public WebElement ConfirmDelete()
	{
		return driver.findElement(confirmdelete);
	}
	
	public WebElement DragcolherePage2()
	{
		return driver.findElement(dragcolherepage2);
	}
	
	public WebElement ColSize1()
	{
		return driver.findElement(colsize1);
	}
	
	public WebElement ColSize2()
	{
		return driver.findElement(colsize2);
	}
	
	public WebElement Saveform()
	{
		return driver.findElement(saveform);
	}
	
	public WebElement Publishform()
	{
		return driver.findElement(publishform);
	}
	
	public WebElement Addrow()
	{
		return driver.findElement(addrow);
	}
	
	public WebElement Signature()
	{
		return driver.findElement(signature);
	}
	
	public WebElement OK()
	{
		return driver.findElement(ok);
	}
}
