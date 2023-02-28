package OcuityAIPortal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objectRepository.hamburgerMenu;
import objectRepository.pageAutoInspection;
import objectRepository.pageNewVehicle;
import resources.CommonLib;

public class AutoInspectionTest extends HomepageTest{
	public JavascriptExecutor executor;


	@Test
	public void autoInspection() throws AWTException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	hamburgerMenu hm = new hamburgerMenu(driver);
	SoftAssert softAssert = new SoftAssert();
	hm.Menu().click();
	pageNewVehicle newVehicle = new pageNewVehicle(driver);
	pageAutoInspection ai = new pageAutoInspection(driver);
	ai.autoInspectionMenu().click();
	ai.autoVehicleList().click();
	ai.VINNumber().sendKeys(prop.getProperty("VINNumber"));
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(ai.ApplyButton()));
	ai.ApplyButton().click();
	Thread.sleep(2000);
	
	try {
		ai.Documents().click();
	} 
	catch (StaleElementReferenceException e) {
		System.out.println(e.getMessage());
	}
	
	wait.until(ExpectedConditions.elementToBeClickable(ai.AddNewLink()));
	ai.AddNewLink().click();
	wait.until(ExpectedConditions.elementToBeClickable(ai.Browse()));
	ai.Browse().click();
	String path = System.getProperty("user.dir");
	Robot robot = new Robot();
	robot.setAutoDelay(2000);
	StringSelection file = new StringSelection(path + "\\src\\main\\java\\resources\\Screenshot.PNG");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
	robot.setAutoDelay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.setAutoDelay(3000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	ai.DocumentTitle().sendKeys("Title1");
	wait.until(ExpectedConditions.elementToBeClickable(ai.SaveButton()));
	ai.SaveButton().click();
	Assert.assertTrue(newVehicle.Message().isDisplayed());
	//executor.executeScript("arguments[0].click();", newVehicle.Message());
	ai.OkButton().click();
	Thread.sleep(2000);
	

//	try {
//		ai.Documents().click();
//		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.deleteDocument()));
//		executor.executeScript("arguments[0].click();",newVehicle.deleteDocument());
//		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.deleteButton()));
//		executor.executeScript("arguments[0].click();",newVehicle.deleteButton());
//	} 
//	catch (StaleElementReferenceException e) {
//		System.out.println(e.getMessage());
//	}
	//47 to 77
	

	

	
//	wait.until(ExpectedConditions.elementToBeSelected(ai.reportlink()));
//	ai.reportlink().click();
//	wait.until(ExpectedConditions.visibilityOfElementLocated((By) ai.Downloadreport()));
//	ai.Downloadreport().click();
//	String downloadPath = System.getProperty("user.dir");
//	File f = new File(downloadPath + "\report.zip");
//	if (f.exists()) {
//		System.out.println("report downloaded");
//	}
	
	
	//try {
		//WebElement vehicle = driver.findElement(By.xpath("//*[text()='Vehicle Page']"));
		WebElement vehicle1 = driver.findElement(By.xpath("//table[@id='usedvehiclemanagement_datatable']/tbody/tr/td[2]/div/a"));
		vehicle1.click();
		//executor.executeScript("arguments[0].click();", vehicle1);
		//executor.executeScript("arguments[0].click();", vehicle);
	//} catch (StaleElementReferenceException e) {
	//	System.out.println(e.getMessage());
	//
	//	}
		
		// View Vehicle Page
	String mainWindowHandle = driver.getWindowHandle();
	for (String childWindowHandle : driver.getWindowHandles()) {
		if (!childWindowHandle.equals(mainWindowHandle)) {
			driver.switchTo().window(childWindowHandle);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			softAssert.assertTrue(newVehicle.glamourImage().isDisplayed());
			newVehicle.interiorGlamourImage().click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			softAssert.assertTrue(newVehicle.glamourImage().isDisplayed());
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					newVehicle.slideShow());
			newVehicle.slideShow().click();
			//executor.executeScript("arguments[0].click();", newVehicle.slideShow());
			Thread.sleep(1000);
			//Assert.assertTrue(newVehicle.slideShowImage().isDisplayed());
			newVehicle.slideShowClose().click();
			//executor.executeScript("arguments[0].click();", newVehicle.slideShowClose());
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					newVehicle.vehicleInformation());
					//softAssert.assertTrue(ai.Cleanlinessgrade().isDisplayed());
					
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
							newVehicle.vehicleInformationImageLink());	
			
			if (newVehicle.vehicleInformationImageLink().isDisplayed()) {
				//System.out.println("Additional Images is present");
				softAssert.assertTrue(newVehicle.vehicleInformationImageLink().isDisplayed());
				Thread.sleep(1000);
			}
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					newVehicle.vehicleInformationInsideEngineNoiseLink());
			
			if (newVehicle.vehicleInformationNotesLink().isDisplayed()) {
				//System.out.println("Notes is present");
				softAssert.assertTrue(newVehicle.vehicleInformationImageLink().isDisplayed());
				Thread.sleep(1000);
			}
			
			if (newVehicle.vehicleInformationOutsideEngineNoiseLink().isDisplayed()) {
				//System.out.println("Outside Engine Noise is present");
				softAssert.assertTrue(newVehicle.vehicleInformationOutsideEngineNoiseLink().isDisplayed());
				Thread.sleep(1000);
			}
			if (newVehicle.vehicleInformationInsideEngineNoiseLink().isDisplayed()) {
				//System.out.println("Inside Engine Noise is present");
				softAssert.assertTrue(newVehicle.vehicleInformationInsideEngineNoiseLink().isDisplayed());
				Thread.sleep(1000);
			}
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					newVehicle.vehicleInformationVideoLink());
			
			if (newVehicle.vehicleInformationVideoLink().isDisplayed()) {
				//System.out.println("Video is present");
				softAssert.assertTrue(newVehicle.vehicleInformationVideoLink().isDisplayed());
				Thread.sleep(1000);
			}
			else {
				System.out.println("No artifacts were added during inspection submission");
				Thread.sleep(1000);
			}
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.damageLink()));
			newVehicle.damageLink().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.locationsLink()));
			newVehicle.locationsLink().click();
			Thread.sleep(1000);
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					ai.Damagehead());
			//WebElement select1 = driver.findElement(By.xpath("//ul[@id='thumbnail-wrap-ul'][1]"));
			//List<WebElement> imagesel = select1.findElements(By.xpath("//*[@class='card-img']"));
			
			
			
		// Select artifacts one by one	
	List<WebElement> a = driver.findElements(By.tagName("a"));
	for (int j=0;j<a.size();j++)
	{
				 String text = a.get(j).getText();
				
		if(text.equalsIgnoreCase("ADDITIONAL IMAGES"))
		{
			
			a.get(j).click();
//			List<WebElement> options =ai.OptionsSelect();
//			
//			for(int i =0;i<options.size();i++)
//			{
//				//imagesel.get(i).click();
//				
//			}
			Thread.sleep(1000);
			ai.DamageImageclose().click();
		}
		
		if(text.equalsIgnoreCase("TEXT NOTES"))
		{
			a.get(j).click();
//			List<WebElement> options =ai.OptionsSelect();
//			
//			for(int i =0;i<options.size();i++)
//			{
//				options.get(i).click();
//			}
			Thread.sleep(1000);
			ai.DamageNotesclose().click();
		}
		
		
		if(text.equalsIgnoreCase("AUDIO NOTES"))
		{
			a.get(j).click();
//			List<WebElement> options =ai.OptionsSelect();
//			
//			for(int i =0;i<options.size();i++)
//			{
//				options.get(i).click();
//			}
			Thread.sleep(2000);
			ai.DamageAudioclose().click();
		}
		
		if(text.equalsIgnoreCase("VIDEOS"))
		{
			a.get(j).click();
//			List<WebElement> options =ai.OptionsSelect();
//			
//			for(int i =0;i<options.size();i++)
//			{
//				options.get(i).click();
//			}
			Thread.sleep(1500);
			ai.DamageVideoclose().click();
			break;
		}
	
	}
			
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.missingEquipment()));
			newVehicle.missingEquipment().click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			softAssert.assertFalse(newVehicle.missingEquipmentValues().isEmpty());
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsLink()));
			newVehicle.inspectionDetailsLink().click();
			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					newVehicle.inspectionDetailsVIN());
			softAssert.assertTrue(newVehicle.inspectionDetailsVIN().isDisplayed());
			System.out.println("Validated VIN");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					newVehicle.inspectionDetailsDate());
			softAssert.assertTrue(newVehicle.inspectionDetailsDate().isDisplayed());
			System.out.println("Validated Inspection Date");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					newVehicle.inspectionDetailsTime());
			softAssert.assertTrue(newVehicle.inspectionDetailsTime().isDisplayed());
			System.out.println("Validated Inspection Time");
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsPointer()));
			newVehicle.inspectionDetailsPointer().click();
			Thread.sleep(2000);
			// Click on customer link 
			ai.CustomerLink().click();
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					ai.frontPhotoCustomer());
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsPointer()));
			newVehicle.inspectionDetailsPointer().click();
			Thread.sleep(2000);
			ai.VehicleAnalysislink().click();
			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					ai.VehicleDamagelink());
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsPointer()));
			newVehicle.inspectionDetailsPointer().click();
			Thread.sleep(2000);
			ai.Artifactslink().click();
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					ai.Photooption());
			if (ai.Photooption().isDisplayed()) {
				//System.out.println("Outside Engine Noise Audio is displayed");
				ai.Photooption().click();
				Thread.sleep(2000);
				Assert.assertTrue(newVehicle.artifactsImageTitle().isDisplayed());
				newVehicle.imagesCloseButton().click();
			}
			
			if (ai.NotesArtifacts().isDisplayed()) {
				//System.out.println("Outside Engine Noise Audio is displayed");
				ai.NotesArtifacts().click();
				Thread.sleep(2000);
				Assert.assertTrue(ai.NotesTitleArtifacts().isDisplayed());
				ai.CloseNotesArtifacts().click();
			}
		
			
			//newVehicle.autoInspectionArtifacts().click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					newVehicle.artifactOutsideEngineNoiseLink());
			if (newVehicle.artifactOutsideEngineNoiseLink().isDisplayed()) {
				System.out.println("Outside Engine Noise Audio is displayed");
				newVehicle.artifactOutsideEngineNoiseLink().click();
				Thread.sleep(2000);
				Assert.assertTrue(newVehicle.artifactsAudioRecording().isDisplayed());
				newVehicle.outsideEngineCloseButton().click();
			}
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					newVehicle.artifactInsideEngineNoiseLink());
			if (newVehicle.artifactInsideEngineNoiseLink().isDisplayed()) {
				System.out.println("Inside Engine Noise Audio is displayed");
				newVehicle.artifactInsideEngineNoiseLink().click();
				Thread.sleep(2000);
				Assert.assertTrue(newVehicle.artifactsAudioRecording().isDisplayed());
				newVehicle.insideEngineCloseButton().click();
				
			} 
//			else 
//			{
//				System.out.println("No artifacts were uploaded during inspection submission");
//			}
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsPointer()));
			newVehicle.inspectionDetailsPointer().click();
			//executor.executeScript("arguments[0].click();", newVehicle.inspectionDetailsPointer());
			wait.until(ExpectedConditions.elementToBeClickable(ai.SummaryLink()));
			ai.SummaryLink().click();
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					newVehicle.autoInspectionSignature());
			Thread.sleep(3000);
			softAssert.assertTrue(ai.CustomerSignature().isDisplayed());
			softAssert.assertTrue(newVehicle.autoInspectionSignature().isDisplayed());
			//log.info("Auto Inspection validated");
			softAssert.assertAll();
		}
}
}
}
