package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageServiceModule {

     By menu = By.xpath("//div[@class='navbar-minimize']/button/em");
	
	By serviceVehicles = By.xpath("//*[@title='Service Vehicles']") ;
	
	By repairOrder = By.xpath("(//*[@class='sidebar-normal'])[21]");
	
	By repairOrderText = By.xpath("//*[@id='RepairOrderNo']");
	
	By applyButton=By.xpath("//*[contains(text(),'Apply')]");
	
	By viewLink=By.xpath("//*[contains(text(),'View')]");
	
	By internalNotificationsLink=By.xpath("(//*[@class='dropdown-item'])[1]");
	
	By internalNotificationsContent=By.xpath("//*[@class='full-row']");
	
	By closeButton=By.xpath("(//*[@class='demo-icon iconcancel white-color'])[1]");
	
	By repairOrderValue=By.xpath("//*[@class='ng-star-inserted odd']/td/a");
	
	By costValue=By.xpath("//*[@class='sansbold theme-color-text']");
	
	By imageArtifactsLink = By.xpath("//*[@data-target='#globalImgModal']");
	
	By imageArtifacts = By.xpath("//*[@class='img-wrap pointer']");
	
	By audioArtifactsLink = By.xpath("//*[@data-target='#globalAudioModal']");
	
	By audioArtifacts = By.xpath("//*[@id='audio']");
	
	By audioCloseButton = By.xpath("//*[text()='AUDIO NOTES']/following-sibling::button/em");
	
    By videoArtifactsLink = By.xpath("//*[@data-target='#globalVideoModal']");
	
	By videoArtifacts = By.xpath("//*[@id='video']");
	
	By videoCloseButton = By.xpath("//*[text()='VIDEOS']/following-sibling::button/em");
	
	WebDriver driver;
	

	public pageServiceModule(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Menu()
	{
		return driver.findElement(menu);
	}
	
	public WebElement serviceVehicles()
	{
		return driver.findElement(serviceVehicles);
	}
	
	public WebElement repairOrder()
	{
		return driver.findElement(repairOrder);
	}
	public WebElement repairOrderText()
	{
		return driver.findElement(repairOrderText);
	}
	public WebElement repairOrderValue()
	{
		return driver.findElement(repairOrderValue);
	}
	public WebElement applyButton()
	{
		return driver.findElement(applyButton);
	}
	public WebElement viewLink()
	{
		return driver.findElement(viewLink);
	}
	public WebElement internalNotificationsLink()
	{
		return driver.findElement(internalNotificationsLink);
	}
	public WebElement internalNotificationsContent()
	{
		return driver.findElement(internalNotificationsContent);
	}
	public WebElement closeButton()
	{
		return driver.findElement(closeButton);
	}
	public WebElement costValue()
	{
		return driver.findElement(costValue);
	}
	public WebElement imageArtifactsLink()
	{
		return driver.findElement(imageArtifactsLink);
	}
	public WebElement imageArtifacts()
	{
		return driver.findElement(imageArtifacts);
	}
	public WebElement audioArtifactsLink()
	{
		return driver.findElement(audioArtifactsLink);
	}
	public WebElement audioArtifacts()
	{
		return driver.findElement(audioArtifacts);
	}
	public WebElement audioCloseButton()
	{
		return driver.findElement(audioCloseButton);
	}
	public WebElement videoArtifactsLink()
	{
		return driver.findElement(videoArtifactsLink);
	}
	public WebElement videoArtifacts()
	{
		return driver.findElement(videoArtifacts);
	}
	public WebElement videoCloseButton()
	{
		return driver.findElement(videoCloseButton);
	}
}
