package OcuityAIPortal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepository.pageNewVehicle;
import resources.CommonLib;
import resources.base;

public class FeaturesTest extends HomepageTest {

	public WebDriverWait wait;
	public JavascriptExecutor executor;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void feature_1_NewVehicleValidationTest() throws IOException, InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pageNewVehicle newVehicle = new pageNewVehicle(driver);
		CommonLib common = new CommonLib();
		newVehicle.Menu().click();
		Thread.sleep(2000);
		newVehicle.newVehicleMenu().click();
		Thread.sleep(2000);
		newVehicle.newVehicleManagement().click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		newVehicle.vinNumber().sendKeys("12184848RR8837474");
		wait = new WebDriverWait(driver, 10);
		executor = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.applyButton()));
		executor.executeScript("arguments[0].click();", newVehicle.applyButton());
		Thread.sleep(2000);
		if (common.isAlertPresent()) {
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		}
		try {
			driver.findElement(By.xpath("//*[text()='Documents']")).click();
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(2000);
		if (common.isAlertPresent()) {
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			executor.executeScript("arguments[0].click();", newVehicle.applyButton());
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.documentsPageNavigation()));
			executor.executeScript("arguments[0].click();", newVehicle.documentsPageNavigation());
		}
		if (common.deleteDocumentNavigation()) {
			System.out.println("inspection deleted");
		}
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.addNewLink()));
		executor.executeScript("arguments[0].click();", newVehicle.addNewLink());
		newVehicle.browse().click();
		Thread.sleep(3000);
		String path = System.getProperty("user.dir");
		Robot robot = new Robot();
		robot.setAutoDelay(2000);
		StringSelection file = new StringSelection(path + "\\src\\main\\java\\resources\\Screenshot.PNG");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		newVehicle.documentTitle().sendKeys("Title1");
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.saveButton()));
		executor.executeScript("arguments[0].click();", newVehicle.saveButton());
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.Message()));
		Assert.assertTrue(newVehicle.Message().isDisplayed());
		executor.executeScript("arguments[0].click();", newVehicle.Message());
		try {
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.applyButton()));
			newVehicle.applyButton().click();
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.reportsPageNavigation()));
			executor.executeScript("arguments[0].click();", newVehicle.reportsPageNavigation());
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.downloadReports()));
			executor.executeScript("arguments[0].click();", newVehicle.downloadReports());
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}
		String downloadPath = System.getProperty("user.dir");
		File f = new File(downloadPath + "\report.zip");
		if (f.exists()) {
			System.out.println("report downloaded");
		}
		try {
			//WebElement vehicle = driver.findElement(By.xpath("//*[text()='Vehicle Page']"));
			WebElement vehicle1 = driver.findElement(By.xpath("//table[@id='newvehiclemanagement_datatable']/tbody/tr/td[2]/div/a"));
			executor.executeScript("arguments[0].click();", vehicle1);
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}
		String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			if (!childWindowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(childWindowHandle);
				driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
				Assert.assertTrue(newVehicle.glamourImage().isDisplayed());
				newVehicle.interiorGlamourImage().click();
				driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
				Assert.assertTrue(newVehicle.glamourImage().isDisplayed());
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.slideShow());
				executor.executeScript("arguments[0].click();", newVehicle.slideShow());
				Thread.sleep(1000);
				Assert.assertTrue(newVehicle.slideShowImage().isDisplayed());
				executor.executeScript("arguments[0].click();", newVehicle.slideShowClose());
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.vehicleInformation());
				if (newVehicle.vehicleInformationImageLink().isDisplayed()) {
					Thread.sleep(1000);
					System.out.println("Additional Images are present");
				}
				if (newVehicle.vehicleInformationNotesLink().isDisplayed()) {
					Thread.sleep(1000);
					System.out.println("Additional Notes are present");
				}
				if (newVehicle.vehicleInformationAudioLink().isDisplayed()) {
					Thread.sleep(1000);
					System.out.println("Additional Audios are present");
				}
				if (!newVehicle.vehicleInformationAudioLink().isDisplayed()
						&& !newVehicle.vehicleInformationNotesLink().isDisplayed()
						&& !newVehicle.vehicleInformationAudioLink().isDisplayed()) {
					Thread.sleep(1000);
					System.out.println("No artifacts were added during inspection submission");
				}
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.damageLink()));
				newVehicle.damageLink().click();
				Thread.sleep(5000);
				Assert.assertFalse(newVehicle.damageValues().isEmpty());
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsLink()));
				newVehicle.inspectionDetailsLink().click();
				Thread.sleep(5000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.inspectionDetailsVIN());
				Assert.assertTrue(newVehicle.inspectionDetailsVIN().isDisplayed());
				System.out.println("Validated VIN");
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.inspectionDetailsDate());
				Assert.assertTrue(newVehicle.inspectionDetailsDate().isDisplayed());
				System.out.println("Validated Inspection Date");
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.inspectionDetailsTime());
				Assert.assertTrue(newVehicle.inspectionDetailsTime().isDisplayed());
				System.out.println("Validated Inspection Time");
				newVehicle.inspectionDetailsPointer().click();
				newVehicle.inspectionDetailsInterior().click();
				List<WebElement> value1 = newVehicle.inspectionDetailsValues();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				if (value1.get(0).isSelected()) {
					System.out.println("Seat Belt Yes is Selected");
				}
				if (value1.get(1).isSelected()) {
					System.out.println("Seat Belt No is Selected");
				}
				if (value1.get(2).isSelected()) {
					System.out.println("Seat Belt NA is Selected");
				}
				if (value1.get(3).isSelected()) {
					System.out.println("Air bag Yes is Selected");
				}
				if (value1.get(4).isSelected()) {
					System.out.println("Air bag No is Selected");
				}
				if (value1.get(5).isSelected()) {
					System.out.println("Air bag NA is Selected");
				}
				if (value1.get(6).isSelected()) {
					System.out.println("ABS Yes is Selected");
				}
				if (value1.get(7).isSelected()) {
					System.out.println("ABS No is Selected");
				}
				if (value1.get(8).isSelected()) {
					System.out.println("ABS NA is Selected");
				}
				if (value1.get(9).isSelected()) {
					System.out.println("Traction Control Yes is Selected");
				}
				if (value1.get(10).isSelected()) {
					System.out.println("Traction Control No is Selected");
				}
				if (value1.get(11).isSelected()) {
					System.out.println("Traction Control NA is Selected");
				}
				if (value1.get(12).isSelected()) {
					System.out.println("Electronic Stability Control Yes is Selected");
				}
				if (value1.get(13).isSelected()) {
					System.out.println("Electronic Stability Control No is Selected");
				}
				if (value1.get(14).isSelected()) {
					System.out.println("Electronic Stability Control NA is Selected");
				}
				if (value1.get(15).isSelected()) {
					System.out.println("Door Lock Switches Yes is Selected");
				}
				if (value1.get(16).isSelected()) {
					System.out.println("Door Lock Switches No is Selected");
				}
				if (value1.get(17).isSelected()) {
					System.out.println("Door Lock Switches NA is Selected");
				}
				if (value1.get(18).isSelected()) {
					System.out.println("Windows Lock Switches Yes is Selected");
				}
				if (value1.get(19).isSelected()) {
					System.out.println("Windows Lock Switches No is Selected");
				}
				if (value1.get(20).isSelected()) {
					System.out.println("Windows Lock Switches NA is Selected");
				}
				if (value1.get(21).isSelected()) {
					System.out.println("Child Lock Switches Yes is Selected");
				}
				if (value1.get(22).isSelected()) {
					System.out.println("Child Lock Switches No is Selected");
				}
				if (value1.get(23).isSelected()) {
					System.out.println("Child Lock Switches NA is Selected");
				}
				Thread.sleep(2000);
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsPointer()));
				newVehicle.inspectionDetailsPointer().click();
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsAccessories()));
				newVehicle.inspectionDetailsAccessories().click();
				List<WebElement> values = newVehicle.inspectionDetailsValues();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				if (values.get(0).isSelected()) {
					System.out.println("Tires condition Yes is Selected");
				}
				if (values.get(1).isSelected()) {
					System.out.println("Tires condition No is Selected");
				}
				if (values.get(2).isSelected()) {
					System.out.println("Tires condition NA is Selected");
				}
				if (values.get(3).isSelected()) {
					System.out.println("Tire Pressure Yes is Selected");
				}
				if (values.get(4).isSelected()) {
					System.out.println("Tire Pressure No is Selected");
				}
				if (values.get(5).isSelected()) {
					System.out.println("Tire Pressure NA is Selected");
				}
				if (values.get(6).isSelected()) {
					System.out.println("Spare Keys Yes is Selected");
				}
				if (values.get(7).isSelected()) {
					System.out.println("Spare Keys No is Selected");
				}
				if (values.get(8).isSelected()) {
					System.out.println("Spare Keys NA is Selected");
				}
				if (values.get(9).isSelected()) {
					System.out.println("Registration Card Yes is Selected");
				}
				if (values.get(10).isSelected()) {
					System.out.println("Registration Card No is Selected");
				}
				if (values.get(11).isSelected()) {
					System.out.println("Registration Card NA is Selected");
				}
				if (values.get(12).isSelected()) {
					System.out.println("Owner Manual Yes is Selected");
				}
				if (values.get(13).isSelected()) {
					System.out.println("Owner Manual No is Selected");
				}
				if (values.get(14).isSelected()) {
					System.out.println("Owner Manual NA is Selected");
				}
				if (values.get(15).isSelected()) {
					System.out.println("Spare Tire Yes is Selected");
				}
				if (values.get(16).isSelected()) {
					System.out.println("Spare Tire No is Selected");
				}
				if (values.get(17).isSelected()) {
					System.out.println("Spare Tire NA is Selected");
				}
				if (values.get(18).isSelected()) {
					System.out.println("Jack Yes is Selected");
				}
				if (values.get(19).isSelected()) {
					System.out.println("Jack No is Selected");
				}
				if (values.get(20).isSelected()) {
					System.out.println("Jack NA is Selected");
				}
				if (values.get(21).isSelected()) {
					System.out.println("Fire Extinguisher Yes is Selected");
				}
				if (values.get(22).isSelected()) {
					System.out.println("Fire Extinguisher No is Selected");
				}
				if (values.get(23).isSelected()) {
					System.out.println("Fire Extinguisher NA is Selected");
				}
				Thread.sleep(2000);
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsPointer()));
				newVehicle.inspectionDetailsPointer().click();
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsArtifacts()));
				newVehicle.inspectionDetailsArtifacts().click();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.artifactsImages());
				if (newVehicle.artifactsImages().isDisplayed()) {
					System.out.println("Additional Images are displayed");
					newVehicle.artifactsImages().click();
					Thread.sleep(5000);
					Assert.assertTrue(newVehicle.artifactsImageTitle().isDisplayed());
					newVehicle.imagesCloseButton().click();
				}
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.artifactsAudios());
				if (newVehicle.artifactsAudios().isDisplayed()) {
					System.out.println("Additional Audios are displayed");
					newVehicle.artifactsAudios().click();
					Thread.sleep(5000);
					Assert.assertTrue(newVehicle.artifactsAudioRecording().isDisplayed());
					newVehicle.audiosCloseButton().click();
				}
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.artifactsNotes());
				if (newVehicle.artifactsNotes().isDisplayed()) {
					System.out.println("Additional Notes are displayed");
					newVehicle.artifactsNotes().click();
					Thread.sleep(5000);
					Assert.assertTrue(newVehicle.artifactsNotesDescription().isDisplayed());
					newVehicle.notesCloseButton().click();
				} else {
					System.out.println("No artifacts were uploaded during inspection submission");
				}
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsPointer()));
				executor.executeScript("arguments[0].click();", newVehicle.inspectionDetailsPointer());
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsSummary()));
				executor.executeScript("arguments[0].click();", newVehicle.inspectionDetailsSummary());
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.inspectionDetailsSignatureDate());
				Thread.sleep(2000);
				Assert.assertTrue(newVehicle.inspectionDetailsSignatureDate().isDisplayed());
				log.info("New Vehicle Inspection validated");
			}
		}

	}

	@Test
	public void feature_2_AutoInspectionValidationTest() throws IOException, InterruptedException, AWTException {

		pageNewVehicle newVehicle = new pageNewVehicle(driver);
		CommonLib common = new CommonLib();
		newVehicle.Menu().click();
		Thread.sleep(2000);
		newVehicle.autoInspectionMenu().click();
		Thread.sleep(2000);
		newVehicle.usedVehicleManagement().click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		newVehicle.vinNumber().sendKeys("12184848384848488");
		wait = new WebDriverWait(driver, 10);
		executor = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.applyButton()));
		executor.executeScript("arguments[0].click();", newVehicle.applyButton());
		Thread.sleep(5000);
		if (common.isAlertPresent()) {
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		}
		try {
			driver.findElement(By.xpath("//*[text()='Documents']")).click();
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(5000);
		if (common.isAlertPresent()) {
			driver.switchTo().alert().accept();
			executor.executeScript("arguments[0].click();", newVehicle.applyButton());
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.documentsPageNavigation()));
			executor.executeScript("arguments[0].click();", newVehicle.documentsPageNavigation());
		}
		if (common.deleteDocumentNavigation()) {
			System.out.println("inspection deleted");
		}
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.addNewLink()));
		executor.executeScript("arguments[0].click();", newVehicle.addNewLink());
		newVehicle.browse().click();
		Thread.sleep(3000);
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
		newVehicle.documentTitle().sendKeys("Title1");
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.saveButton()));
		executor.executeScript("arguments[0].click();", newVehicle.saveButton());
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Assert.assertTrue(newVehicle.Message().isDisplayed());
		executor.executeScript("arguments[0].click();", newVehicle.Message());
		try {
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.applyButton()));
			newVehicle.applyButton().click();
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.reportsPageNavigation()));
			executor.executeScript("arguments[0].click();", newVehicle.reportsPageNavigation());
			wait.until(ExpectedConditions.elementToBeClickable(newVehicle.downloadReports()));
			executor.executeScript("arguments[0].click();", newVehicle.downloadReports());
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}
		String downloadPath = System.getProperty("user.dir");
		File f = new File(downloadPath + "\report.zip");
		if (f.exists()) {
			System.out.println("report downloaded");
		}
		try {
			//WebElement vehicle = driver.findElement(By.xpath("//*[text()='Vehicle Page']"));
			WebElement vehicle1 = driver.findElement(By.xpath("//table[@id='newvehiclemanagement_datatable']/tbody/tr/td[2]/div/a"));
			executor.executeScript("arguments[0].click();", vehicle1);
			//executor.executeScript("arguments[0].click();", vehicle);
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}
		String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			if (!childWindowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(childWindowHandle);
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				Assert.assertTrue(newVehicle.glamourImage().isDisplayed());
				newVehicle.interiorGlamourImage().click();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				Assert.assertTrue(newVehicle.glamourImage().isDisplayed());
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.slideShow());
				executor.executeScript("arguments[0].click();", newVehicle.slideShow());
				Thread.sleep(1000);
				Assert.assertTrue(newVehicle.slideShowImage().isDisplayed());
				executor.executeScript("arguments[0].click();", newVehicle.slideShowClose());
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.vehicleInformation());
				if (newVehicle.vehicleInformationOutsideEngineNoiseLink().isDisplayed()) {
					System.out.println("Outside Engine Noise is present");
					Thread.sleep(1000);
				}
				if (newVehicle.vehicleInformationInsideEngineNoiseLink().isDisplayed()) {
					System.out.println("Inside Engine Noise is present");
					Thread.sleep(1000);
				}
				if (!newVehicle.vehicleInformationOutsideEngineNoiseLink().isDisplayed()
						&& !newVehicle.vehicleInformationInsideEngineNoiseLink().isDisplayed()) {
					System.out.println("No artifacts were added during inspection submission");
					Thread.sleep(1000);
				}
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.damageLink()));
				newVehicle.damageLink().click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.missingEquipment()));
				newVehicle.missingEquipment().click();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				Assert.assertFalse(newVehicle.missingEquipmentValues().isEmpty());
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsLink()));
				newVehicle.inspectionDetailsLink().click();
				Thread.sleep(5000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.inspectionDetailsVIN());
				Assert.assertTrue(newVehicle.inspectionDetailsVIN().isDisplayed());
				System.out.println("Validated VIN");
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.inspectionDetailsDate());
				Assert.assertTrue(newVehicle.inspectionDetailsDate().isDisplayed());
				System.out.println("Validated Inspection Date");
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.inspectionDetailsTime());
				Assert.assertTrue(newVehicle.inspectionDetailsTime().isDisplayed());
				System.out.println("Validated Inspection Time");
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsPointer()));
				newVehicle.inspectionDetailsPointer().click();
				Thread.sleep(2000);
				newVehicle.autoInspectionArtifacts().click();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.artifactOutsideEngineNoiseLink());
				if (newVehicle.artifactOutsideEngineNoiseLink().isDisplayed()) {
					System.out.println("Outside Engine Noise Audio is displayed");
					newVehicle.artifactOutsideEngineNoiseLink().click();
					Thread.sleep(5000);
					Assert.assertTrue(newVehicle.artifactsAudioRecording().isDisplayed());
					newVehicle.outsideEngineCloseButton().click();
				}
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.artifactInsideEngineNoiseLink());
				if (newVehicle.artifactInsideEngineNoiseLink().isDisplayed()) {
					System.out.println("Inside Engine Noise Audio is displayed");
					newVehicle.artifactInsideEngineNoiseLink().click();
					Thread.sleep(5000);
					Assert.assertTrue(newVehicle.artifactsAudioRecording().isDisplayed());
					newVehicle.insideEngineCloseButton().click();
				} else {
					System.out.println("No artifacts were uploaded during inspection submission");
				}
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.inspectionDetailsPointer()));
				executor.executeScript("arguments[0].click();", newVehicle.inspectionDetailsPointer());
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.autoInspectionSummary()));
				executor.executeScript("arguments[0].click();", newVehicle.autoInspectionSummary());
				Thread.sleep(5000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						newVehicle.autoInspectionSignature());
				Thread.sleep(5000);
				Assert.assertTrue(newVehicle.autoInspectionSignature().isDisplayed());
				log.info("Auto Inspection validated");
			}
		}
	}

	@Test
	public void feature_3_LoanerValidationTest() throws IOException, InterruptedException, AWTException {

		pageNewVehicle newVehicle = new pageNewVehicle(driver);
		CommonLib common = new CommonLib();
		newVehicle.Menu().click();
		Thread.sleep(2000);
		newVehicle.loanerVehicleMenu().click();
		Thread.sleep(2000);
		newVehicle.loanerVehicleManagement().click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		newVehicle.vinNumber().sendKeys("84884949494949494");
		wait = new WebDriverWait(driver, 10);
		executor = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.applyButton()));
		executor.executeScript("arguments[0].click();", newVehicle.applyButton());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.edit()));
		newVehicle.edit().click();
		Thread.sleep(2000);
		newVehicle.licenceplate().sendKeys("dnwn");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select status = new Select(newVehicle.status());
		status.selectByVisibleText("Available");
		newVehicle.save().click();
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.Message()));
		executor.executeScript("arguments[0].click();", newVehicle.Message());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		executor.executeScript("arguments[0].click();", newVehicle.Menu());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				newVehicle.loanerVehicleManagement());
		executor.executeScript("arguments[0].click();", newVehicle.loanerVehicleHistory());
		Thread.sleep(5000);
	    for(int i=0; i<=2;i++){
	    	  try{
	    		  driver.findElement(By.xpath("//*[@id='VinNumber']")).click();
	    		  driver.findElement(By.xpath("//*[@id='VinNumber']")).sendKeys("84858585858595959");
	    	     break;
	    	  }
	    	  catch(Exception e){
	    	     System.out.println(e.getMessage());
	    	  }
	    	}
		  driver.findElement(By.xpath("//*[@id='FromDate']")).clear();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id='ToDate']")).clear();
		  Thread.sleep(5000);
	    executor.executeScript("arguments[0].click();", newVehicle.loanerHistorySave());
	    Thread.sleep(5000);
	    if (common.isAlertPresent()) {
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		}
	    try {
			WebElement vehicle = driver.findElement(By.xpath("//*[text()='Vehicle Page']"));
			executor.executeScript("arguments[0].click();", vehicle);
			Thread.sleep(2000);
			if (common.isAlertPresent()) {
				wait.until(ExpectedConditions.alertIsPresent());
				driver.switchTo().alert().accept();
			}
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}
	    String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			if (!childWindowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(childWindowHandle);
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				Assert.assertTrue(newVehicle.glamourImage().isDisplayed());
				newVehicle.interiorGlamourImage().click();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				Assert.assertTrue(newVehicle.glamourImage().isDisplayed());
	}
		}
	}

	@Test
	public void feature_4_zoomImages() throws InterruptedException {
		pageNewVehicle newVehicle = new pageNewVehicle(driver);
		newVehicle.Menu().click();
		Thread.sleep(2000);
		newVehicle.newVehicleMenu().click();
		Thread.sleep(2000);
		newVehicle.newVehicleManagement().click();
		Thread.sleep(2000);
		newVehicle.vinNumber().sendKeys("12184848RR8837474");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.applyButton()));
		newVehicle.applyButton().click();
		Thread.sleep(2000);
		CommonLib common = new CommonLib();
		if (common.isAlertPresent()) {
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", newVehicle.applyButton());
		}
		try {
			driver.findElement(By.xpath("//*[text()='Vehicle Page']")).click();
			Thread.sleep(2000);
			if (common.isAlertPresent()) {
				driver.switchTo().alert().accept();
			}
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}
		String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			if (!childWindowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(childWindowHandle);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement element = driver.findElement(By.xpath("//*[@id='myimage']"));
				Actions action = new Actions(driver);
				action.moveToElement(element).perform();
				Thread.sleep(2000);
				WebElement zoom = driver.findElement(By.xpath("//*[@class='img-zoom-result']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
						zoom);
				Thread.sleep(2000);
				Assert.assertTrue(zoom.isDisplayed());
			}
		}
	}
	
	@Test
	public void feature_5_additionalImages() throws InterruptedException {
		pageNewVehicle newVehicle = new pageNewVehicle(driver);
		newVehicle.Menu().click();
		newVehicle.newVehicleMenu().click();
		newVehicle.newVehicleManagement().click();
		newVehicle.vinNumber().sendKeys("85858595859595599");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(newVehicle.applyButton()));
		newVehicle.applyButton().click();
		Thread.sleep(3000);
		CommonLib common = new CommonLib();
		if (common.isAlertPresent()) {
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", newVehicle.applyButton());
			Thread.sleep(3000);
		}
		try {
			
			driver.findElement(By.xpath("//*[text()='Vehicle Page']")).click();
			if (common.isAlertPresent()) {
				driver.switchTo().alert().accept();
			}
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}
		String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			if (!childWindowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(childWindowHandle);
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.damageLink()));
				newVehicle.damageLink().click();
				wait.until(ExpectedConditions.elementToBeClickable(newVehicle.locationsLink()));
				newVehicle.locationsLink().click();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				newVehicle.enlargeLink().click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@class='range-wrap']/following-sibling::span/em)[1]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@placeholder='Untitled']")).sendKeys("Title");
				driver.findElement(By.xpath("//*[text()=' SAVE ']")).click();
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@class='swal2-confirm swal2-styled']"))));
				driver.findElement(By.xpath("//*[@class='swal2-confirm swal2-styled']")).click();
			}
		}
}
}