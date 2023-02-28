package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	By emailid = By.xpath("//input[@type='email']");
	
	By password = By.id("password");
	
	By signin = By.id("next");
	
	WebDriver driver;


   public loginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	   this.driver = driver;
	}

public WebElement Email() {
	
	return driver.findElement(emailid);
	 
}

   public WebElement Password() {
	   
	   return driver.findElement(password);
   }
   
   public WebElement SignIn() {
	   
	   return driver.findElement(signin);
   }
}

