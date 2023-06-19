package elementRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.node.BooleanNode;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;
import utility.ExcellRead;
import utility.ExiplicitWait;
import utility.GeneralUtilities;

public class WorkersPageClass {
	
	WebDriver driver;
	GeneralUtilities gl=new GeneralUtilities();
	ExiplicitWait eWait=new ExiplicitWait();
	public WorkersPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/payrollapp/worker/create']")
	WebElement createWorker;
	
	@FindBy(xpath = "//select[@id='worker-title']")
	WebElement title;
	
	@FindBy(xpath = "//select[@id='worker-gender']")
	WebElement gender;
	
	@FindBy(xpath = "//select[@id='worker-branch_id']")
	WebElement branch;
	
	@FindBy(xpath = "//input[@id='worker-first_name']")
	WebElement firstName;
	
	@FindBy(xpath = "//select[@id='worker-division_id']")
	WebElement division;
	
	@FindBy(xpath = "//input[@id='worker-last_name']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='worker-dob']")
	WebElement dob;
	
	@FindBy(xpath = "//select[@id='worker-employment_type']")
	WebElement employmentType;
	
	@FindBy(xpath = "//input[@id='worker-address1']")
	WebElement address;
	
	@FindBy(xpath = "//select[@id='worker-payslip_method']")
	WebElement payslipMethod;
	
	@FindBy(xpath ="//input[@id='worker-phone']")
	WebElement phone;
	
	@FindBy(xpath ="//input[@id='worker-postcode']")
	WebElement postCode;
	
	@FindBy(xpath ="//input[@id='worker-ni_number']")
	WebElement niNumber;
	
	@FindBy(xpath ="//input[@id='worker-email']")
	WebElement email;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement next;
	
	@FindBy(xpath = "//button[text()='Search']")
	WebElement searchButton;
	
	@FindBy(xpath = "(//*[contains(text(),'Rijil')])[2]")
	WebElement createdWorker;
	
	@FindBy(xpath = "//input[@id='workersearch-first_name']")
	WebElement searchFirstName;
	
	@FindBy(xpath = "//table//tbody//tr[1]//td[2]")
	WebElement searchWorkerName;
	
	@FindBy(xpath = "//a[contains(@href,'/payrollapp/worker/delete')]")
	WebElement deletElement;
	
	@FindBy(xpath = "//input[@id='worker-ac_name']")
	WebElement accountName;
	
	@FindBy(xpath = "//input[@id='worker-ac_no']")
	WebElement accountNumber;
	
	@FindBy(xpath = "//input[@id='worker-sort_code']")
	WebElement sortCode;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;
	
	public void clickOnCreateWorkerTab() {
		
		gl.clickElement(createWorker);
	}
	
	public void selectValueFromGender(int index) {
		gl.selectByIndexMethod(gender,index);
	}
	
	public void selectValueFromBranch(int index) {
		gl.selectByIndexMethod(branch,index);
	}
	
	public void typeIntoFirstName(String str) {
		gl.typeIntoElement(firstName,str);
	}
	
	public void selectValueFromDivision(int index) {
		gl.selectByIndexMethod(division,index);
	}
	
	public void typeIntoLastName(String str) {
		gl.typeIntoElement(lastName,str);
	}
	
	public void typeIntoDOB(String str) {
		gl.typeIntoElement(dob,str);
		//gl.sendKeysClick(driver);
	}
	
	public void selectValueFromEmployementType(int index) {
		gl.selectByIndexMethod(employmentType,index);
	}
	
	public void typeIntoAddress(String str) {
		gl.typeIntoElement(address,str);
	}
	
	public void selectValueFromPayslipMethodn(int index) {
		gl.selectByIndexMethod(payslipMethod,index);
	}
	
	public void typeIntoPhone(String str) {
		gl.typeIntoElement(phone,str);
	}
	
	public void typeIntoEmail(String str) {
		gl.typeIntoElement(email,str);
	}
	
	public void typeIntoPostCode(String str) {
		gl.typeIntoElement(postCode,str);
	}
	
	public void typeIntoNiNumber(String str) {
		gl.typeIntoElement(niNumber,str);
	}
	
	public void typeIntoAccountName(String str) {
		gl.typeIntoElement(accountName,str);
	}
	
	public void typeIntoAccountNumber(String str) {
		gl.typeIntoElement(accountNumber,str);
	}
	
	public void typeIntoSortCode(String str) {
		gl.typeIntoElement(sortCode,str);
	}
	
	public String readFirstName(int r,int c)throws IOException{
		
		return ExcellRead.readStringData(r,c);
	}
	
	public String readLastName(int r,int c)throws IOException{
		
		return ExcellRead.readStringData(r,c);
	}
	public String readDOB(int r,int c)throws IOException{
		
		return ExcellRead.readStringData(r,c);
	}
	public String readAddress(int r,int c)throws IOException{
		
		return ExcellRead.readStringData(r,c);
	}
	public String readPhone(int r,int c)throws IOException{
		
		return ExcellRead.readIntegerData(r,c);
	}
	
	public String readNiNumber(int r,int c)throws IOException{
		
		return ExcellRead.readIntegerData(r,c);
	}

	public String readEmail(int r,int c)throws IOException{
		
		return ExcellRead.readStringData(r,c);
	}
	public String readPostCode(int r,int c)throws IOException{
	
	return ExcellRead.readIntegerData(r,c);
	}
	
	public String readAccountName(int r,int c)throws IOException{
		
		return ExcellRead.readStringData(r,c);
	}

	public String readAccountNumber(int r,int c)throws IOException{
	
	return ExcellRead.readIntegerData(r,c);
	}

	public String readSortCode(int r,int c)throws IOException{
	
	return ExcellRead.readStringData(r,c);
	}
	
	public void clickOnNextButton() {
		gl.clickElement(next);
	}
	
	public void clickOnSaveButton() {
		gl.clickElement(save);
	}
	
	public boolean isCreatedWorkerNameDisplayed() {
		
		return gl.isDisplayedMethod(createdWorker);
	}
	
	public void searchMethod(String str) {
		
		eWait.elementToBeClickableWait(driver,searchButton);
		gl.typeIntoElement(searchFirstName,str);
		gl.clickElement(searchButton);
		
	}
	
	public boolean isSearchNameDisplayed() {
		
		return gl.isDisplayedMethod(searchWorkerName);
	}
	
	public void deleteAnItem() {
		gl.clickElement(deletElement);
		gl.acceptAlert(driver);
	}
	
}
