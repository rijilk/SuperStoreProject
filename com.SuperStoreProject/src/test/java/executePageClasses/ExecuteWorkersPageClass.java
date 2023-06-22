package executePageClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import elementRepository.DashboardPageClass;
import elementRepository.LoginPageClass;
import elementRepository.WorkersPageClass;
import retryAnalyzer.RetryAnalyzer;

public class ExecuteWorkersPageClass extends BaseClass {
	
	LoginPageClass lp;
	DashboardPageClass dp;
	WorkersPageClass wp;
	
  @Test(priority = 0,retryAnalyzer = RetryAnalyzer.class)
  public void verifyToCreateANewWorker()throws IOException  {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  wp=new WorkersPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  dp.clickOnWorkersTab();
	  wp.clickOnCreateWorkerTab();
	  wp.selectValueFromGender(1);
	  wp.selectValueFromBranch(1);
	  wp.typeIntoFirstName(wp.readFirstName(10, 1));
	  wp.selectValueFromDivision(1);
	  wp.typeIntoLastName(wp.readLastName(11, 1));
	  wp.typeIntoDOB(wp.readDOB(12, 1));
	  wp.selectValueFromEmployementType(1);
	  wp.typeIntoAddress(wp.readAddress(13, 1));
	  wp.selectValueFromPayslipMethodn(1);
	  wp.typeIntoPhone(wp.readPhone(14, 1));
	  wp.typeIntoNiNumber(wp.readNiNumber(15, 1));
	  wp.typeIntoEmail(wp.readEmail(16,1));
	  wp.typeIntoPostCode(wp.readPostCode(17, 1));
	  wp.clickOnNextButton();
	  wp.typeIntoAccountName(wp.readAccountName(18,1));
	  wp.typeIntoAccountNumber(wp.readAccountNumber(19,1));
	  wp.typeIntoSortCode(wp.readSortCode(20, 1));
	  wp.clickOnSaveButton();
	  boolean actual_Result=wp.isCreatedWorkerNameDisplayed();
	  Assert.assertTrue(actual_Result);
  }
  
  @Test(priority = 1,retryAnalyzer = RetryAnalyzer.class)
  public void verifySearchFunctionality() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  wp=new WorkersPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  dp.clickOnWorkersTab();
	  //wp.searchMethod("qwertyqwerty");
	  wp.typeIntoWorkersFirstName("qwertyqwerty");
	  wp.typeIntoWorkersLastName("K");
	  wp.clickonSearchButton();
	  boolean actual_Result=wp.isSearchNameDisplayed();
	  
	  Assert.assertFalse(actual_Result);
  }
  @Test(priority = 2,retryAnalyzer = RetryAnalyzer.class)
  public void verifyDeleteFunctionality() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  wp=new WorkersPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  dp.clickOnWorkersTab();
	  wp.typeIntoWorkersFirstName("qwertyqwerty");
	  wp.typeIntoWorkersLastName("K");
	  wp.clickonSearchButton();
	  wp.clickDeleteButton();
	  wp.acceptAnAlert();
	  
	 // boolean actual_Result=wp.isSearchNameDisplayed();
	  //Assert.assertTrue(actual_Result);
  }
}
