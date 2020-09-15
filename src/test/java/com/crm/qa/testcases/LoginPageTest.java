package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.Loginpage;

public class LoginPageTest extends TestBase{
    
	Loginpage loginpage;
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws InterruptedException 
	{
		intialisation();
		 loginpage =new Loginpage();
	}
	
	
	  @Test(priority=1) public void loginpagetitletest() throws InterruptedException {
		 
		  String title=loginpage.validateloginpagetitle(); 
		  Assert.assertEquals(title,"Facebook – log in or sign up");
	  
	  }
	 
	
	@Test(priority=2)
	public void logintest() throws InterruptedException {
		
	
		loginpage.login(prop.getProperty("username"), prop.getProperty("Password"));
		
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
}
