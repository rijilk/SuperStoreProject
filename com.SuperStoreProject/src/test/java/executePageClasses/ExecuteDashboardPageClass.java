package executePageClasses;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPageClass;
import elementRepository.LoginPageClass;

public class ExecuteDashboardPageClass extends BaseClass {
	DashboardPageClass dp;
	LoginPageClass lp;
	
  @Test
  public void verifyWelocmeMsgIsDisplayedorNot() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  lp.login("carol","1q2w3e4r");
	  Boolean Actual_Result=dp.isWelcomeMsgDispalyed();
	  Assert.assertTrue(Actual_Result);
	  
  }
  
  @Test
  public void verifyClientsTabIsDisplayedorNot() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  lp.login("carol","1q2w3e4r");
	  Boolean exp_Result=true;
	  Boolean Actual_Result=dp.isClientsTabDisplayed();
	  Assert.assertEquals(Actual_Result,exp_Result);
	  
  }
  
}
