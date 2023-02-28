package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageNewVehicle {

    WebDriver driver;
	public pageNewVehicle(WebDriver driver) {
		this.driver = driver;
	}
	
	By menu = By.xpath("(//div[@class='navbar-minimize']/button/em)");
	By newVehicleMenu = By.xpath("//a[@title='New Vehicle']");
	By autoInspectionMenu = By.xpath("//a[@title='Auto Inspection Vehicles']");
	By loanerVehicleMenu = By.xpath("//*[contains(@title, 'Loaner Vehicles')]");
	By newVehicleManagement = By.xpath("//*[@href='/newvehiclemanagement']");
	By usedVehicleManagement = By.xpath("//*[@href='/usedvehiclemanagement']");
	By loanerVehicleManagement = By.xpath("//*[@href='/vehiclemanagement']");
	By loanerVehicleHistory = By.xpath("//*[text()='Loaner Vehicle History']");
	By vinNumber = By.xpath("//*[@id='VinNumber']");
	By loanerVinNumber = By.xpath("//*[@name='VinNumber']");
	By applyButton = By.xpath("//*[text()=' Apply ']");
	By resetFilter = By.xpath("//*[@class='sanssemibold uppercase']");
	By searchValues = By.xpath("//*[@class='full-row']");
	By vehiclePageNavigation = By.xpath("//*[text()='Vehicle Page']");
	By vehicleInformation = By.xpath("//*[text()='VEHICLE INFORMATION']");
	By documentsPageNavigation = By.xpath("//*[text()='Documents']");
	By reportsPageNavigation = By.xpath("(//*[@class='btn-group']/a)[1]");
	By downloadReports = By.xpath("//*[@class='dropdown-item']");
	By addNewLink = By.xpath("//*[@class='card-content']/div/div/a");
	By damageLink = By.xpath("//*[text()='DAMAGES']");
	By locationsLink = By.xpath("(//*[text()='LOCATIONS'])[2]");
	By enlargeLink = By.xpath("//*[contains(text(), 'Enlarge')]");
	By inspectionDetailsLink = By.xpath("//*[text()='INSPECTION DETAILS']");
	By damageValues = By.xpath("//table/tbody/tr/td");
	By missingEquipmentValues = By.xpath("//table/tbody/tr/td");
	By missingEquipment = By.xpath("(//*[text()='MISSING EQUIPMENT'])[2]");
	By glamourImage = By.xpath("//*[@id='myimage']"); 
	By interiorGlamourImage = By.xpath("//*[text()='Interior']");
	By slideShow = By.xpath("//*[contains(text(),'360')]");
	By playButton = By.xpath("//*[@class='demo-icon iconplay2']");
	By slideShowImage = By.xpath("(//*[@id='circlr']/img)[1]");
	By slideShowClose = By.xpath("//*[@class='demo-icon iconcancel']");
	By browse = By.xpath("//*[@id='PdfFileForm0']/following-sibling::button");
	By saveButton = By.xpath("(//*[@class='btn btn-wd'])[3]/following-sibling::button");
	By cancelButton = By.xpath("//*[text()='Cancel']");
	By documentTitle = By.xpath("//*[@class='form-group is-empty']/input");
	By deleteDocument = By.xpath("//*[@class='attachIcon']/a/em");
	By noRecords = By.xpath("//*[@class='no-records']/td");
	By Message = By.xpath("//*[@class='swal2-confirm btn btn-success']");
	By deleteInspection = By.xpath("//*[@title='Delete Inspection']");
	By deleteInspectionPopup = By.xpath("//*[@id='swal2-title']");
	By deleteButton = By.xpath("//*[@class='swal2-confirm btn btn-success']");
	By inspectionDetailsVIN=By.xpath("(//*[@class='full-row'])[3]");
	By inspectionDetailsDate=By.xpath("(//*[@class='full-row'])[4]");
	By inspectionDetailsTime=By.xpath("(//*[@class='full-row'])[5]");
	By inspectionDetailsPointer=By.xpath("//*[@class='circle-menu pointer']");
	By inspectionDetailsInterior=By.xpath("//*[@class='active']/following-sibling::li[1]/a");
	By inspectionDetailsAccessories=By.xpath("(//*[@class='full-row'])[2]/li[3]/a");
	By inspectionDetailsSummary=By.xpath("(//*[@class='full-row'])[2]/li[5]/a");
	By inspectionDetailsSignatureDate=By.xpath("//app-form-date/div/div/div/input");
	By autoInspectionSignature=By.xpath("//*[text()='Inspector Signature']/following-sibling::div");
	By inspectionDetailsValues=By.xpath("//*[@class='custom-radio-box']/input");
	By inspectionDetailsArtifacts=By.xpath("(//*[@class='full-row'])[2]/li[4]/a");
	By autoInspectionArtifacts=By.xpath("//*[@class='active']/following-sibling::li[2]");
	By autoInspectionSummary=By.xpath("//*[@class='active']/following-sibling::li/a");
	By artifactsImages=By.xpath("//app-form-capture_photos/div/div/div/div/div");
	By artifactsImageTitle=By.xpath("(//*[@class='relative full-row'])[1]");
	By imagesCloseButton=By.xpath("//*[text()='IMAGES']/following-sibling::button");
	By outsideEngineCloseButton=By.xpath("//*[text()='ENGINE NOISE - OUTSIDE VEHICLE']/following-sibling::button");
	By insideEngineCloseButton=By.xpath("//*[text()='ENGINE NOISE - INSIDE VEHICLE']/following-sibling::button");
	By artifactsAudios=By.xpath("//app-form-capture_audios/div/div/div/div");
	By artifactsAudioRecording=By.xpath("//audio");
	By artifactOutsideEngineNoiseLink=By.xpath("(//*[@class='demo-icon iconaudio'])[1]");
	By artifactInsideEngineNoiseLink=By.xpath("(//*[@class='demo-icon iconaudio'])[2]");
	By audiosCloseButton=By.xpath("(//*[text()='ADDITIONAL AUDIOS'])[2]/following-sibling::button");
	By artifactsNotes=By.xpath("//app-form-capture_notes/div/div/div/div");
	By artifactsNotesDescription=By.xpath("//form/div/div");
	By notesCloseButton=By.xpath("(//*[text()='ADDITIONAL  NOTES'])[2]/following-sibling::button");
	By vehicleInformationImageLink=By.xpath("(//*[text()='ADDITIONAL IMAGES'])[1]/following-sibling::a"); 
	By vehicleInformationNotesLink=By.xpath("(//*[text()=' ADDITIONAL  NOTES '])[1]/following-sibling::a"); 
	By vehicleInformationOutsideEngineNoiseLink=By.xpath("//*[text()=' ENGINE NOISE - OUTSIDE VEHICLE ']/following-sibling::a");
	By vehicleInformationInsideEngineNoiseLink=By.xpath("//*[text()=' ENGINE NOISE - INSIDE VEHICLE ']/following-sibling::a");
	By vehicleInformationAudioLink=By.xpath("(//*[text()=' ADDITIONAL AUDIOS '])[1]/following-sibling::a"); 
	By vehicleInformationVideoLink=By.xpath("(//*[text()=' ADDITIONAL VIDEOS '])[1]/following-sibling::a");
	By edit= By.xpath("//a[text()='Edit']");
	By licenceplate = By.id("Field18");
	By status = By.id("Field19");
	By save =By.xpath("//button[contains(text(),'Save')]");
	By loanerHistorySave =By.xpath("//*[contains(text(),'Apply')]");
    

	public WebElement Menu()
	{
		return driver.findElement(menu);
	}
	
	public WebElement newVehicleMenu()
	{
		return driver.findElement(newVehicleMenu);
	}
	public WebElement autoInspectionMenu()
	{
		return driver.findElement(autoInspectionMenu);
	}
	public WebElement loanerVehicleMenu()
	{
		return driver.findElement(loanerVehicleMenu);
	}
	public WebElement loanerVehicleHistory()
	{
		return driver.findElement(loanerVehicleHistory);
	}
	public WebElement newVehicleManagement()
	{
		return driver.findElement(newVehicleManagement);
	}
	public WebElement usedVehicleManagement()
	{
		return driver.findElement(usedVehicleManagement);
	}
	public WebElement vinNumber()
	{
		return driver.findElement(vinNumber);
	}
	public WebElement loanerVinNumber()
	{
		return driver.findElement(loanerVinNumber);
	}
	public WebElement loanerVehicleManagement()
	{
		return driver.findElement(loanerVehicleManagement);
	}
	public WebElement applyButton()
	{
		return driver.findElement(applyButton);
	}
	public WebElement loanerHistorySave()
	{
		return driver.findElement(loanerHistorySave);
	}
	public WebElement resetFilter()
	{
		return driver.findElement(resetFilter);
	}
	public List<WebElement> searchValues()
	{
		return driver.findElements(searchValues);
	}
	public WebElement vehiclePageNavigation()
	{
		return driver.findElement(vehiclePageNavigation);
	}
	public WebElement documentsPageNavigation()
	{
		return driver.findElement(documentsPageNavigation);
	}
	public WebElement reportsPageNavigation()
	{
		return driver.findElement(reportsPageNavigation);
	}
	public WebElement damageLink()
	{
		return driver.findElement(damageLink);
	}
	public WebElement locationsLink()
	{
		return driver.findElement(locationsLink);
	}
	public WebElement enlargeLink()
	{
		return driver.findElement(enlargeLink);
	}
	public WebElement deleteDocument()
	{
		return driver.findElement(deleteDocument);
	}
	public WebElement inspectionDetailsLink()
	{
		return driver.findElement(inspectionDetailsLink);
	}
	public WebElement addNewLink()
	{
		return driver.findElement(addNewLink);
	}
	public WebElement glamourImage()
	{
		return driver.findElement(glamourImage);
	}
	public WebElement interiorGlamourImage()
	{
		return driver.findElement(interiorGlamourImage);
	}
	public WebElement slideShow()
	{
		return driver.findElement(slideShow);
	}
	public WebElement slideShowClose()
	{
		return driver.findElement(slideShowClose);
	}
	public WebElement playButton()
	{
		return driver.findElement(playButton);
	}
	public WebElement cancelButton()
	{
		return driver.findElement(cancelButton);
	}
	public WebElement imagesCloseButton()
	{
		return driver.findElement(imagesCloseButton);
	}
	public WebElement audiosCloseButton()
	{
		return driver.findElement(audiosCloseButton);
	}
	public WebElement notesCloseButton()
	{
		return driver.findElement(notesCloseButton);
	}
	public WebElement outsideEngineCloseButton()
	{
		return driver.findElement(outsideEngineCloseButton);
	}
	public WebElement insideEngineCloseButton()
	{
		return driver.findElement(insideEngineCloseButton);
	}
	public WebElement slideShowImage()
	{
		return driver.findElement(slideShowImage);
	}
	public WebElement browse()
	{
		return driver.findElement(browse);
	}
	public WebElement saveButton()
	{
		return driver.findElement(saveButton);
	}
	public WebElement documentTitle()
	{
		return driver.findElement(documentTitle);
	}
	public WebElement downloadReports()
	{
		return driver.findElement(downloadReports);
	}
	public WebElement vehicleInformation()
	{
		return driver.findElement(vehicleInformation);
	}
	public WebElement Message()
	{
		return driver.findElement(Message);
	}
	public WebElement deleteInspectionPopup()
	{
		return driver.findElement(deleteInspectionPopup);
	}
	public WebElement deleteButton()
	{
		return driver.findElement(deleteButton);
	}
	public WebElement noRecords()
	{
		return driver.findElement(noRecords);
	}
	public WebElement deleteInspection()
	{
		return driver.findElement(deleteInspection);
	}
	public WebElement inspectionDetailsVIN()
	{
		return driver.findElement(inspectionDetailsVIN);
	}
	public WebElement inspectionDetailsDate()
	{
		return driver.findElement(inspectionDetailsDate);
	}
	public WebElement inspectionDetailsTime()
	{
		return driver.findElement(inspectionDetailsTime);
	}
	public WebElement inspectionDetailsPointer()
	{
		return driver.findElement(inspectionDetailsPointer);
	}
	public WebElement inspectionDetailsInterior()
	{
		return driver.findElement(inspectionDetailsInterior);
	}
	public WebElement inspectionDetailsAccessories()
	{
		return driver.findElement(inspectionDetailsAccessories);
	}
	public WebElement inspectionDetailsArtifacts()
	{
		return driver.findElement(inspectionDetailsArtifacts);
	}
	public WebElement autoInspectionArtifacts()
	{
		return driver.findElement(autoInspectionArtifacts);
	}
	public WebElement autoInspectionSummary()
	{
		return driver.findElement(autoInspectionSummary);
	}
	public WebElement inspectionDetailsSummary()
	{
		return driver.findElement(inspectionDetailsSummary);
	}
	public WebElement inspectionDetailsSignatureDate()
	{
		return driver.findElement(inspectionDetailsSignatureDate);
	}
	public WebElement autoInspectionSignature()
	{
		return driver.findElement(autoInspectionSignature);
	}
	public WebElement artifactsImages()
	{
		return driver.findElement(artifactsImages);
	}
	public WebElement artifactsImageTitle()
	{
		return driver.findElement(artifactsImageTitle);
	}
	public WebElement artifactsAudios()
	{
		return driver.findElement(artifactsAudios);
	}
	public WebElement artifactsAudioRecording()
	{
		return driver.findElement(artifactsAudioRecording);
	}
	public WebElement artifactsNotes()
	{
		return driver.findElement(artifactsNotes);
	}
	public WebElement artifactsNotesDescription()
	{
		return driver.findElement(artifactsNotesDescription);
	}
	public WebElement vehicleInformationImageLink()
	{
		return driver.findElement(vehicleInformationImageLink);
	}
	public WebElement vehicleInformationAudioLink()
	{
		return driver.findElement(vehicleInformationAudioLink);
	}
	public WebElement vehicleInformationNotesLink()
	{
		return driver.findElement(vehicleInformationNotesLink);
	}
	public WebElement vehicleInformationOutsideEngineNoiseLink()
	{
		return driver.findElement(vehicleInformationOutsideEngineNoiseLink);
	}
	public WebElement artifactOutsideEngineNoiseLink()
	{
		return driver.findElement(artifactOutsideEngineNoiseLink);
	}
	public WebElement artifactInsideEngineNoiseLink()
	{
		return driver.findElement(artifactInsideEngineNoiseLink);
	}
	public WebElement vehicleInformationInsideEngineNoiseLink()
	{
		return driver.findElement(vehicleInformationInsideEngineNoiseLink);
	}
	
	public WebElement vehicleInformationVideoLink()
	{
		return driver.findElement(vehicleInformationVideoLink);
	}
	
	
	public WebElement missingEquipment()
	{
		return driver.findElement(missingEquipment);
	}
	public List<WebElement> damageValues()
	{
		return driver.findElements(damageValues);
	}
	public List<WebElement> missingEquipmentValues()
	{
		return driver.findElements(missingEquipmentValues);
	}
	public List<WebElement> inspectionDetailsValues()
	{
		return driver.findElements(inspectionDetailsValues);
	}
	public WebElement edit()
	{
		return driver.findElement(edit);
	}
	public WebElement licenceplate()
	{
		return driver.findElement(licenceplate);
	}
	public WebElement status()
	{
		return driver.findElement(status);
	}
	public WebElement save()
	{
		return driver.findElement(save);
	}
}
