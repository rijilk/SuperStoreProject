package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.ClientsPageClass;
import elementRepository.DashboardPageClass;
import elementRepository.LoginPageClass;

public class ExecuteClientsPageClass extends BaseClass {
	
	LoginPageClass lp;
	ClientsPageClass cp;
	DashboardPageClass dp;
	
  @Test
  public void verifyToCreateANewClient() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  cp=new ClientsPageClass(driver);
	  lp.login("carol","1q2w3e4r");
	  dp.clickOnClientsTab();
	  cp.clickOnCreateClientTab();
	  cp.selectValueFromBranch(1);
	  cp.selectValueFromInvoiceOrder(1);
	  cp.selectValueFromDivision(1);
	  cp.typeIntoInvoiceContact("123");
	  cp.selectValueFromInvoiceDelivery(1);
	  cp.typeIntoInvoiceClientName("Rijil");
	  cp.typeIntoPhoneNumber("7898965458");
	  cp.selectValueMasterDocument(1);
	  cp.typeIntoClientAddress("Kannur Kerala");
	  cp.typeIntoSettelmentDays("5");
	  cp.typeIntoPostCode("1234321");
	  cp.typeIntoEmail("abc@gmail.com");
	  cp.typeIntoCompanyReg("xyz infra");
	  cp.selectVatRate(2);
	  cp.clickOnSaveButton();
	  boolean Actual_Result=cp.isCreatedClientNameDispalyed();
	  Assert.assertTrue(Actual_Result);
	  
  }
}
