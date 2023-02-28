package OcuityAI.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.loginPage;
import resources.base;

public class NewModuleImpl extends base {
	
	public WebDriver driver;
	@Given("I landed on the login page")
	public void I_landed_on_the_login_page() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("URL"));
		
	}
	
	@When("^I entered the Username (.+) and Password (.+)$")
	public void enter_the_Username_and_Password(String username, String password)
	{
		loginPage ln = new loginPage(driver);
		ln.Email().sendKeys("username");
	    ln.Password().sendKeys("password");
	}
	
	@Then("I am navigated to the {String} page on Admin Portal")
	public void navigated_to_Dashboard_page()
	{
		
	}

}
