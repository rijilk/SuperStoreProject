package executePageClasses;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPageClass;
import elementRepository.LoginPageClass;
import retryAnalyzer.RetryAnalyzer;

public class ExecuteDashboardPageClass extends BaseClass {
	DashboardPageClass dp;
	LoginPageClass lp;
	
  @Test(groups= {"group1"},retryAnalyzer = RetryAnalyzer.class)
  public void verifyWelocmeMsgIsDisplayedorNot() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  lp.login("carol","1q2w3e4r");
	  Boolean Actual_Result=dp.isWelcomeMsgDispalyed();
	  Assert.assertTrue(Actual_Result);
	  
  }
  
  @Test(groups= {"group1"},retryAnalyzer = RetryAnalyzer.class)
  public void verifyClientsTabIsDisplayedorNot() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  lp.login("carol","1q2w3e4r");
	  Boolean exp_Result=true;
	  Boolean Actual_Result=dp.isClientsTabDisplayed();
	  Assert.assertEquals(Actual_Result,exp_Result);
	  
  }
  @Test(groups= {"group2"},retryAnalyzer = RetryAnalyzer.class)
  public void verifyLogoisDisplayed() {
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  lp.login("carol","1q2w3e4r");
	  Boolean Actual_result=dp.isLogoDisplayed();
	  Assert.assertTrue(Actual_result);
  }
  
}
