package utility;

import java.security.PublicKey;

import javax.swing.text.Element;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class GeneralUtilities {
	
	public String getCurrentUrlofPage(WebDriver driver)
	{
		return driver.getCurrentUrl();
	}
	public void clickElement(WebElement element)
	{
		element.click();
	}
	public void clearElement(WebElement element){
		element.clear();
	}
	public void typeIntoElement(WebElement element,String str){
		
		element.sendKeys(str);
		
		
	}
	public String getTextOfAnElement(WebElement element) {
		return element.getText();
	}
	public String getAttributeMethod(WebElement element,String str) {
	return element.getAttribute(str);
	}
		
	public boolean isDisplayedMethod(WebElement element){
		return element.isDisplayed();
	}
	
	public Boolean isEnabledMethod(WebElement element){
		return element.isEnabled();
	}
	
	public Boolean isSelectedMethod(WebElement element){
		return element.isSelected();
	}
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	public void alertSendKeys(WebDriver driver,String str) {
		driver.switchTo().alert().sendKeys(str);
	}
	public void selectByIndexMethod(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
		
	}
	public String getTitleofaPage(WebDriver driver)
	{
		return driver.getTitle();
	}
	public void selectByVisibleTextMethod(WebElement element,String str) {
		Select select=new Select(element);
		select.selectByVisibleText(str);
		
	}
	public void selectByValueMethod(WebElement element,String str) {
		Select select=new Select(element);
		select.selectByValue(str);
	}
	public void dismissAnAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public String getTextofAnAlert(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}
	public void scrollToAnElementMethod(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public void javaScriptClicktMethod(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
}
