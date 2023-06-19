package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GeneralUtilities;

public class DashboardPageClass {

	WebDriver driver;
	GeneralUtilities gl=new GeneralUtilities();
	
	public  DashboardPageClass(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//*[contains(text(),'Welcome')]")
	WebElement welcomeMsg;
	
	@FindBy(xpath = "//a[@href='/payrollapp/client/index']")
	WebElement clients;
	
	@FindBy(xpath = "//a[@href='/payrollapp/worker/index']")
	WebElement workers;
	
	@FindBy(xpath = "//a[@href='/payrollapp/deduction/index']")
	WebElement deduction;
	
	@FindBy(xpath = "//img[@src='/payrollapp/images/logo.png']")
	WebElement logo;
	
	public boolean isWelcomeMsgDispalyed() {
		
		return gl.isDisplayedMethod(welcomeMsg);
	}
	
    public boolean isClientsTabDisplayed() {
		
		return gl.isDisplayedMethod(clients);
	}
    
    public void clickOnClientsTab() {
    	gl.clickElement(clients);
    }
    
    public void clickOnWorkersTab() {
    	
    	gl.clickElement(workers);
    }
    
    public void clickOnDeductionsTab() {
    	
    	gl.clickElement(deduction);
    }
    
    public boolean isLogoDisplayed() {
    	
    	return gl.isDisplayedMethod(logo);
    	
    }
    

}
