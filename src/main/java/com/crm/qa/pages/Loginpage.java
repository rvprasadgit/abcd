package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase

{    //page factory - OR (Object Repository)
     @FindBy(xpath="//div[@class='_6lux']  //input[@id='email']")
     WebElement username;
     
     @FindBy(xpath="//div[@class='_6lux']  //input[@id='pass']")
     WebElement password;
     
     @FindBy(xpath="//button[@type='submit']")
	 WebElement loginbtn;
     
		
     @FindBy(xpath="//a[text()='Forgotten account?']")
     WebElement fgtbtn;
		  
     @FindBy(css=".fb_logo._8ilh.img")
	 WebElement fblogo;
		 
     
    
     
     //Initializing the page objects:
     
     public Loginpage(){
    	 PageFactory.initElements(driver,this);
    	 
     }
	// Actions:
     public String validateloginpagetitle() throws InterruptedException  {
    	Thread.sleep(1000);
    	 return driver.getTitle();
    	 
     }
    public void login(String un , String pwd)  {
    
    	username.sendKeys(un);
    	password.sendKeys(pwd);
    	loginbtn.click();
    	
    }
	
	
}
