package OcuityAIPortal;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepository.hamburgerMenu;
import objectRepository.loginPage;
import objectRepository.pageServiceModule;
import resources.base;

public class ServiceModuleTest extends HomepageTest {

	public static Logger log = LogManager.getLogger(base.class.getName());
	public JavascriptExecutor executor;
	public WebDriverWait wait;

	//@Test
	public void serviceModule() throws InterruptedException, IOException {
		hamburgerMenu hm = new hamburgerMenu(driver);
		pageServiceModule serviceModule = new pageServiceModule(driver);
		hm.Menu().click();
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", serviceModule.serviceVehicles());
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", serviceModule.repairOrder());
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", serviceModule.repairOrderText());
		String text = "41843";
		serviceModule.repairOrderText().sendKeys(text);
		executor.executeScript("arguments[0].click();", serviceModule.applyButton());
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", serviceModule.viewLink());
		if (serviceModule.internalNotificationsLink().isDisplayed()) {
			serviceModule.internalNotificationsLink().click();
			Thread.sleep(2000);
			Assert.assertTrue(serviceModule.internalNotificationsContent().isDisplayed());
			serviceModule.closeButton().click();
			Thread.sleep(2000);
			serviceModule.repairOrderValue().click();
			String mainWindowHandle = driver.getWindowHandle();
			for (String childWindowHandle : driver.getWindowHandles()) {
				if (!childWindowHandle.equals(mainWindowHandle)) {
					driver.switchTo().window(childWindowHandle);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					Assert.assertTrue(serviceModule.costValue().isDisplayed());
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
							serviceModule.imageArtifactsLink());
					if (serviceModule.imageArtifactsLink().isEnabled()) {
						System.out.println("Image Artifact is displayed");
						serviceModule.imageArtifactsLink().click();
						Thread.sleep(5000);
						Assert.assertTrue(serviceModule.imageArtifacts().isDisplayed());
						serviceModule.closeButton().click();
					}
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
							serviceModule.audioArtifactsLink());
					if (serviceModule.audioArtifactsLink().isEnabled()) {
						System.out.println("Audio Artifact is displayed");
						serviceModule.audioArtifactsLink().click();
						Thread.sleep(5000);
						Assert.assertTrue(serviceModule.audioArtifacts().isDisplayed());
						serviceModule.audioCloseButton().click();
					}
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
							serviceModule.videoArtifactsLink());
					if (serviceModule.videoArtifactsLink().isEnabled()) {
						System.out.println("Video Artifact is displayed");
						serviceModule.videoArtifactsLink().click();
						Thread.sleep(5000);
						Assert.assertTrue(serviceModule.videoArtifacts().isDisplayed());
						serviceModule.videoCloseButton().click();
					}
				}
			}
		}
	}
}
