package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;
import utility.ExiplicitWait;
import utility.GeneralUtilities;

public class DedudctionPageClass {
	
	WebDriver driver;
	GeneralUtilities gl=new GeneralUtilities();
	ExiplicitWait eWait=new ExiplicitWait();
	public DedudctionPageClass(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()='Deductions']")
	WebElement deductions;
	
	@FindBy(xpath = "//a[@href='/payrollapp/deduction/create']")
	WebElement addDeduction;
	
	@FindBy(xpath = "//select[@id='deduction-worker_id']")
	WebElement worker;
	
	@FindBy(xpath = "//select[@id='deduction-type']")
	WebElement type;
	
	@FindBy(xpath = "//input[@id='deduction-amount']")
	WebElement amount;
	
	@FindBy(xpath = "//input[@id='deduction-effective_from']")
	WebElement date;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement save;
	
	@FindBy(xpath = "//span[text()='-- Please Select --']")
	WebElement pleaseSelect;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement selectTextBox;
	
	@FindBy(xpath = "//h1[text()='Rijil']")
	WebElement workerName;
	
	public boolean isDeductionPageOpening() {
		return gl.isDisplayedMethod(deductions);
	}
	
	public void clickonAddDeductionTab() {
		gl.clickElement(addDeduction);
	}
	
	public void selectValueFromWorker(String str) {
		
		gl.clickElement(pleaseSelect);
		gl.typeIntoElement(selectTextBox,str);
		
	}
	
	public void selectValueFromTextBox() {
		gl.sendKeysClick(driver,selectTextBox);
	}
	
	public void selectValueFromType(int index) {
		gl.selectByIndexMethod(type,index);
	}
	
	public void typeIntoAmount(String str) {
	
		gl.typeIntoElement(amount, str);
	}
	
	public void typeIntoDate(String str) {
		
		gl.clearElement(date);
		gl.typeIntoElement(date, str);
	}
	
	public void clickOnSaveButton() {
		gl.clickElement(save);
	}
	
	public boolean isWorkerNameDisplayed() {
		return gl.isDisplayedMethod(workerName);
	}
}
