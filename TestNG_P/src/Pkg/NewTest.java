package Pkg;

import org.testng.annotations.*;

public class NewTest {
  
  @Test
  public void Login() {
	  System.out.println("Login Successfully");
  }  
  @Test
  public void CreateLead()
  {
	  System.out.println("Lead created successfully");
  }
  
  @BeforeMethod
  public void Beforemethod()
  {
	  System.out.println("before method is calling");
  }
  @AfterMethod
  public void AfterMethod()
  {
	  System.out.println("after method is calling");
  }
  
  @BeforeTest
  public void beforetest()
  {
	  System.out.println("Launch Application successfully");
  }
  
  @AfterTest
  public void aftertest()
  {
	  System.out.println("application closed successfully");
  }
  
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("before class calling");
  }
  
  @AfterClass
  public void afterclass()
  {
	  System.out.println("after class calling");
  }
  
  @BeforeSuite
  public void beforesuite()
  {
	  System.out.println("before suite is calling");
  }
  
  @AfterSuite
  public void aftersuite()
  {
	  System.out.println("after suite is calling");
  }
  
  @DataProvider
  public void dataconnection()
  {
	  System.out.println("DB connection established");
  }
  
 
}
