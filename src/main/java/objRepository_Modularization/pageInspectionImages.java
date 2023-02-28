package objRepository_Modularization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageInspectionImages {

		By addNew = By.xpath("//button[@data-target='#addNewList']");
		By addlisttitle = By.id("LookUpKeyName");
		By imagelistmsg = By.xpath("//*[text()='The Inspection Image already exist.']");
		By addinspection = By.xpath("//button[@data-target='#addUpdateNewImage']");
		By addnewgrp = By.xpath("//*[text()='ADD NEW GROUP ']/em");
		By grpname = By.xpath("//*[@name='NewGroup']");
		By grpadd = By.xpath("//*[@class='input-group-btn']/button");
		By selectgrp = By.xpath("//*[@name='GroupName']");
		By imagetitle = By.xpath("(//*[@id='Name'])[2]");
		By captureorder = By.id("Order");
		By save = By.xpath("(//*[@type='submit'])[3]");
		By savelist = By.xpath("(//button[@type='submit'])[2]");
		By editsave = By.xpath("//button[@type='submit']");
		By editimage = By.xpath("(//*[@data-target='#addUpdateNewImage'])[2]");
		By ok = By.xpath("//button[contains(text(),'OK')]");
		By edit = By.xpath("(//table[@id='vehicleinventory_datatable']/tbody/tr/td/a)[1]");
		By delete = By.xpath("//div[@class='col-md-12']/div/button");
		By confirmDelete = By.xpath("//*[(text()='Delete')]");
		
		WebDriver driver;
		
		public pageInspectionImages(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}



		public WebElement AddNewList()
		{
			return driver.findElement(addNew);
		}
		
		public WebElement AddListTitle()
		{
			return driver.findElement(addlisttitle);
		}
		
		public WebElement ImagelistMsg()
		{
			return driver.findElement(imagelistmsg);
		}
		
		public WebElement Savelist()
		{
			return driver.findElement(savelist);
		}
		
		public WebElement Ok()
		{
			return driver.findElement(ok);
		}
		
		public WebElement AddInspection()
		{
			return driver.findElement(addinspection);
		}
		
		public WebElement AddNewGrp()
		{
			return driver.findElement(addnewgrp);
		}
		
		public WebElement Grpname()
		{
			return driver.findElement(grpname);
		}
		
		public WebElement GrpAdd()
		{
			return driver.findElement(grpadd);
		}
		
		public WebElement Imagetitle()
		{
			return driver.findElement(imagetitle);
		}
		
		public WebElement Captureorder()
		{
			return driver.findElement(captureorder);
		}
		
		public WebElement Save()
		{
			return driver.findElement(save);
		}
		
		public WebElement EditImage()
		{
			return driver.findElement(editimage);
		}
		
		public WebElement SelectGrp()
		{
			return driver.findElement(selectgrp);
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
