package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	  @FindBy(xpath="//td[contains(text(),'User: Demo User')]")
	     WebElement usernamelabel;
	     
	
	
	
}
