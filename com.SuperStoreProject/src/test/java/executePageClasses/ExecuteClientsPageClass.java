package executePageClasses;

import java.io.IOException;

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
  public void verifyToCreateANewClient()throws IOException {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  cp=new ClientsPageClass(driver);
	  lp.login("carol","1q2w3e4r");
	  dp.clickOnClientsTab();
	  cp.clickOnCreateClientTab();
	  cp.selectValueFromBranch(1);
	  cp.selectValueFromInvoiceOrder(1);
	  cp.selectValueFromDivision(1);
	  cp.typeIntoInvoiceContact(cp.readInvoicContact(1,1));
	  cp.selectValueFromInvoiceDelivery(1);
	  cp.typeIntoInvoiceClientName(cp.readClientName(0,1));
	  cp.typeIntoPhoneNumber(cp.readPhoneNumber(2,1));
	  cp.selectValueMasterDocument(1);
	  cp.typeIntoClientAddress(cp.readClientAddress(3,1));
	  cp.typeIntoSettelmentDays(cp.readSettelmentDays(4, 1));
	  cp.typeIntoPostCode(cp.readPostCode(6,1));
	  cp.typeIntoEmail(cp.readEmail(5,1));
	  cp.typeIntoCompanyReg(cp.readCompanyReg(7,1));
	  cp.selectVatRate(2);
	  cp.clickOnSaveButton();
	  boolean Actual_Result=cp.isCreatedClientNameDispalyed();
	  Assert.assertTrue(Actual_Result);
	  
  }
  
  @Test
  public void verifySearchFunctionality() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  cp=new ClientsPageClass(driver);
	  lp.login("carol","1q2w3e4r");
	  dp.clickOnClientsTab();
	  cp.searchMethod("kkkllk");
	  boolean actual_Result=cp.isSearchClientNameDisplayed();
	  Assert.assertTrue(actual_Result);
	  
  }
}
