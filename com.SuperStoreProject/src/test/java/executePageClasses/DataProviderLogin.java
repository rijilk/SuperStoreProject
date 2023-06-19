package executePageClasses;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderLogin {

  @DataProvider(name = "DataProvider1")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "carol", "1q23ew" },
      new Object[] { "carol11", "1q2w3e4r" },
      new Object[] { "cc", "wrong"}
    };
    
  }
  
  @DataProvider(name = "DataProvider2")
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { "carol", "1q2w3e4r" }
    };
  }
}
