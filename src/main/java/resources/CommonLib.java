package resources;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import objectRepository.pageNewVehicle;

public class CommonLib extends base {



	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex) {
			return false;
		}
	}
	
	public void waitforElementtoAppear(By find)
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(find));
		
	}

	
	public void waitforElementtobeClickable(WebElement click)
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(click));
		
	}

	public void scrollintoview(WebElement scroll)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				scroll);
	}
	
	public boolean deleteDocumentNavigation() {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			pageNewVehicle newVehicle = new pageNewVehicle(driver);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.deleteDocument()));
			executor.executeScript("arguments[0].click();",newVehicle.deleteDocument());
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.deleteButton()));
			executor.executeScript("arguments[0].click();",newVehicle.deleteButton());
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Assert.assertTrue(newVehicle.Message().isDisplayed());
			while (true) { 
			    try {
			        WebElement ele=driver.findElement(By.xpath("//*[@class='swal2-buttonswrapper']/button"));
			        wait.until(ExpectedConditions.elementToBeClickable(ele));  
			        ele.click();
			        break; 
			    } 
			    catch (org.openqa.selenium.StaleElementReferenceException e1) { 
			        Thread.sleep(3000); 
			        continue; 
			    }
			}
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public void inspectionDetailsPageNavigation() {

		pageNewVehicle newVehicle = new pageNewVehicle(driver);
		newVehicle.Menu().click();
		newVehicle.newVehicleMenu().click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		CommonLib common = new CommonLib();
		executor.executeScript("arguments[0].click();", newVehicle.newVehicleManagement());
		newVehicle.vinNumber().sendKeys("7373737E744487374");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.applyButton()));
		executor.executeScript("arguments[0].click();", newVehicle.applyButton());
		driver.navigate().refresh();
		executor.executeScript("arguments[0].click();", newVehicle.vehiclePageNavigation());
		String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			if (!childWindowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(childWindowHandle);
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsLink()));
				newVehicle.inspectionDetailsLink().click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
