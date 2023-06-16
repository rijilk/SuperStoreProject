package elementRepository;
import org.checkerframework.checker.units.qual.g;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Global;
import utility.GeneralUtilities;

public class LoginPageClass {
	
	WebDriver driver;
	
	GeneralUtilities gl	=new GeneralUtilities();
	
	public LoginPageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@id='loginform-username']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='loginform-password']")
	WebElement passwd;
	
	@FindBy(xpath ="//button[@name='login-button']" )
	WebElement login;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	WebElement carolThomas;
	
	@FindBy(xpath = "//*[contains(text(),'Incorrect username or password.')]")
	WebElement incorrectMsg;
	
	public String getURL() {
		
		return gl.getCurrentUrlofPage(driver);
		
	}
	
	public void login(String uName,String pword) {
		
		gl.typeIntoElement(userName,uName);
		gl.typeIntoElement(passwd,pword);
		gl.clickElement(login);
		
	}
	
	public boolean isCarolThomasDisplayed() {
		
		return gl.isDisplayedMethod(carolThomas);
	}
	
	public String getTextOfIncorrectMessage() {
	
		return gl.getTextOfAnElement(incorrectMsg);
	}
	
	
}
