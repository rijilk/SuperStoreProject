package elementRepository;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.FileUpload;
import utility.GeneralUtilities;

public class TimesheetPageClass {

	WebDriver driver;
	GeneralUtilities gl=new GeneralUtilities();
	FileUpload f=new FileUpload();
	public  TimesheetPageClass(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//a[@href='/payrollapp/timesheet/create']")
	WebElement createTimeSheet;
	
	@FindBy(xpath = "//input[@class='file-caption-name']")
	WebElement selectAnImage;
	
	@FindBy(xpath = "//*[text()='Browse …']//following::input")
	WebElement browse;
	
	public void clickOnCreateTimeSheet() {
		
		gl.clickElement(createTimeSheet);
	}
	public void clickOnBrowse() {

		gl.javaScriptClicktMethod(driver, selectAnImage);
		gl.keyPressTab(driver);
		gl.javaScriptClicktMethod(driver, browse);
	}
	
	public void uploadAnImage(String str)throws AWTException {
		f.fileUpload();
		
		//gl.sendKeysUploadImage(selectAnImage,str);
	}
}
