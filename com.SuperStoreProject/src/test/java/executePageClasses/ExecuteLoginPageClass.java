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
  
  @Test(dataProviderClass = DataProviderLogin.class,dataProvider  ="DataProvider2")
  public void verifySuccessfullLogin(String name,String pass) {
	  
	  lp=new LoginPageClass(driver);
	  lp.login(name,pass);
	  boolean actual_Result=lp.isCarolThomasDisplayed();
	  Assert.assertTrue(actual_Result);

  }
  
  @Test(dataProviderClass = DataProviderLogin.class,dataProvider = "DataProvider1")
  public void verifyUnSuccessfullLogin(String name,String pass) {
	  
	  lp=new LoginPageClass(driver);
	  lp.login(name,pass);
	  String actual_Result=lp.getTextOfIncorrectMessage();
	  String exp_Result="Incorrect username or password.";
	  Assert.assertEquals(actual_Result,exp_Result);

  }
}
