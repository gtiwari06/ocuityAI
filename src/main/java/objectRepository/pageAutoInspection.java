package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageAutoInspection {

	  WebDriver driver;
		public pageAutoInspection(WebDriver driver) 
		{
			this.driver = driver;
		}
		
		By autoInspectionmenu = By.xpath("//a[@title='Auto Inspection']");
		By autovehiclelist = By.xpath("//*[@href='/usedvehiclemanagement']");
		By vinNumber = By.id("VinNumber");
		By applyButton = By.xpath("//*[text()=' Apply ']");
		By documents = By.xpath("//*[text()='Documents']");
		By addNewLink = By.xpath("//*[@class='card-content']/div/div/a");
		By browse = By.xpath("//*[@id='PdfFileForm0']/following-sibling::button");
		By documentTitle = By.xpath("//*[@class='form-group is-empty']/input");
		By saveButton = By.xpath("(//*[@class='btn btn-wd'])[3]/following-sibling::button");
		By message = By.xpath("//*[@class='swal2-confirm btn btn-success']");
		By reportlink = By.xpath("//span[@class='caret']");
		By downloadreport = By.xpath("//a[@class='dropdown-item']");
		By okbutton = By.xpath("//*[text()='OK']");
		By deletedocument = By.xpath("//a[@title='Delete Document']/em");
		By deleteButton = By.xpath("//*[@class='swal2-confirm btn btn-success']");
		By cleangrade = By.xpath("//*[@id='gradingHr']");
		By damageimages = By.xpath("//*[@text()='ADDITIONAL IMAGES']");
		By damagenotes = By.xpath("//*[@text()='TEXT NOTES']");
		By damageaudio = By.xpath("AUDIO NOTES");
		By damagevideo = By.xpath("VIDEOS");
		By listoptions = By.xpath("//*[@class='infobox']");
		By damageimageclose = By.xpath("(//*[@ng-reflect-title='ADDITIONAL IMAGES']/div/div/button)[25]");
		By damagenotesclose = By.xpath("//div[@id='glamorimgModal']/div/button");
		By damageaudioclose = By.xpath("(//div[@id='glamorimgModal']/div/button)[2]");
		By damagevideoclose = By.xpath("(//div[@id='glamorimgModal']/div/button)[3]");
		By customerlink = By.xpath("//a[text()='CUSTOMER INFO']");
		By frontphotocustomer = By.id("cust_ins_photo_front");
		By vehicleanalysislink = By.xpath("//a[text()='VEHICLE ANALYSIS']");
		By damagevehiclelink = By.xpath("//*[text()='DAMAGES']");
		By artifactslink = By.xpath("//a[text()='ARTIFACTS']");
		By photooption = By.xpath("//*[@class='demo-icon iconphotos']");
		By artifactsnotes=By.xpath("//*[@class='demo-icon iconnotes']");
		By artifactsnotestitle=By.xpath("(//*[@class='relative full-row'])[2]");
		By notesclosebutton=By.xpath("//*[text()='NOTES']/following-sibling::button");
		By summarylink = By.xpath("(//a[text()='SUMMARY'])[2]");
		By customersignature=By.xpath("//*[text()='Customer Signature']/following-sibling::div");
		By damagehead = By.xpath("//*[@class='text-underline']");
		
		By select = By.xpath("//*[@id='thumbnail-wrap-ul']");
		By imagesel = By.xpath("//*[@class='card-img']");
		
		
		public WebElement autoInspectionMenu()
		{
			return driver.findElement(autoInspectionmenu);
		}
		
		public WebElement autoVehicleList()
		{
			return driver.findElement(autovehiclelist);
		}
		
		public WebElement VINNumber()
		{
			return driver.findElement(vinNumber);
		}
		
		public WebElement ApplyButton()
		{
			return driver.findElement(applyButton);
		}
		
		public WebElement Documents()
		{
			return driver.findElement(documents);
		}
		
		public WebElement AddNewLink()
		{
			return driver.findElement(addNewLink);
		}
		
		public WebElement Browse()
		{
			return driver.findElement(browse);
		}
		
		public WebElement DocumentTitle()
		{
			return driver.findElement(documentTitle);
		}
		
		public WebElement SaveButton()
		{
			return driver.findElement(saveButton);
		}
		
		public WebElement Message()
		{
			return driver.findElement(message);
		}
		
		public WebElement reportlink()
		{
			return driver.findElement(reportlink);
		}
		
		public WebElement Downloadreport()
		{
			return driver.findElement(downloadreport);
		}
		
		public WebElement OkButton()
		{
			return driver.findElement(okbutton);
		}
		
		public WebElement DeleteDocument()
		{
			return driver.findElement(deletedocument);
		}
		
		public WebElement Deletebutton()
		{
			return driver.findElement(deleteButton);
		}
		
		public WebElement Cleanlinessgrade()
		{
			return driver.findElement(cleangrade);
		}
		
		public WebElement DamageImage()
		{
			return driver.findElement(damageimages);
		}
		
		public WebElement DamageNotes()
		{
			return driver.findElement(damagenotes);
		}
		
		public WebElement DamageAudio()
		{
			return driver.findElement(damageaudio);
		}
		
		public WebElement DamageVideo()
		{
			return driver.findElement(damagevideo);
		}
		
		public List<WebElement> OptionsSelect()
		{
			return driver.findElements(listoptions);
		}
		
		public WebElement DamageImageclose()
		{
			return driver.findElement(damageimageclose);
		}
		
		public WebElement DamageNotesclose()
		{
			return driver.findElement(damagenotesclose);
		}
		
		public WebElement DamageAudioclose()
		{
			return driver.findElement(damageaudioclose);
		}
		
		public WebElement DamageVideoclose()
		{
			return driver.findElement(damagevideoclose);
		}
		
		public WebElement Select()
		{
			return driver.findElement(select);
		}
		
		public WebElement CustomerLink()
		{
			return driver.findElement(customerlink);
		}
		
		public WebElement frontPhotoCustomer()
		{
			return driver.findElement(frontphotocustomer);
		}
		
		public WebElement VehicleAnalysislink()
		{
			return driver.findElement(vehicleanalysislink);
		}
		
		public WebElement VehicleDamagelink()
		{
			return driver.findElement(damagevehiclelink);
		}
		
		public WebElement Artifactslink()
		{
			return driver.findElement(artifactslink);
		}
		
		public WebElement Photooption()
		{
			return driver.findElement(photooption);
		}
		
		public WebElement NotesArtifacts()
		{
			return driver.findElement(artifactsnotes);
		}
		
		public WebElement NotesTitleArtifacts()
		{
			return driver.findElement(artifactsnotestitle);
		}
		
		public WebElement CloseNotesArtifacts()
		{
			return driver.findElement(notesclosebutton);
		}
		
		public WebElement SummaryLink()
		{
			return driver.findElement(summarylink);
		}
		
		public WebElement CustomerSignature()
		{
			return driver.findElement(customersignature);
		}
		
		public WebElement Damagehead()
		{
			return driver.findElement(damagehead);
		}
//		public List<WebElement> imageSel()
//		{
//			return select.findElements((SearchContext) imagesel);
//		}
		
}


