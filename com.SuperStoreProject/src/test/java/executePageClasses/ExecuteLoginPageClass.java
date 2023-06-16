package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPageClass;

public class ExecuteLoginPageClass extends BaseClass {
	
  LoginPageClass lp;
  @Test
  public void verifyCorrectPageIsOpenWhileHittingTheUrl(){
	  
	  lp=new LoginPageClass(driver);
	  String actual_Result=lp.getURL();
	  String exp_Result="https://qabible.in/payrollapp/site/login";
	  Assert.assertEquals(actual_Result, exp_Result);
	 
  }
  
  @Test
  public void verifySuccessfullLogin() {
	  
	  lp=new LoginPageClass(driver);
	  lp.login("carol","1q2w3e4r");
	  boolean actual_Result=lp.isCarolThomasDisplayed();
	  Assert.assertTrue(actual_Result);

  }
  
  @Test
  public void verifyUnSuccessfullLogin() {
	  
	  lp=new LoginPageClass(driver);
	  lp.login("carol","12");
	  String actual_Result=lp.getTextOfIncorrectMessage();
	  String exp_Result="Incorrect username or password.";
	  Assert.assertEquals(actual_Result,exp_Result);

  }
}
