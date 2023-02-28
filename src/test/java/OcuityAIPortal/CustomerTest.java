package OcuityAIPortal;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepository.hamburgerMenu;
import objectRepository.pageApplicationSettings;
import objectRepository.pageCustomer;
import resources.base;

public class CustomerTest extends HomepageTest{
	
	public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void viewDetails() throws InterruptedException, IOException
	{   
		hamburgerMenu hm = new hamburgerMenu(driver);
		pageCustomer Customer = new pageCustomer(driver);
		hm.Menu().click();
		hm.Admin().click();
		Customer.Customer().click();
		Customer.Searchtext().sendKeys(prop.getProperty("Customer"));
		Thread.sleep(2000);
		Customer.Searchbutton().click();
		String name = Customer.Tablename().getText();
		String email = Customer.Tableemail().getText();
		String phone = Customer.Tablephone().getText();
		Thread.sleep(2000);
		Customer.ViewDetails().click();
		Thread.sleep(2000);
		String namea = Customer.Name().getText();
		String emaila = Customer.Email().getText();
		String phonea = Customer.Phone().getText();
		Assert.assertEquals(namea, name);
		Assert.assertEquals(emaila, email);
		Assert.assertEquals(phonea, phone);
		
		
	}

}
