package com.reporting.pages;
package com.reporting.base;


import org.openqa.selenium.support.PageFactory;

public class Dashboard extends TestBase{
	
	
	
	public Dashboard() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public String verifyHomePageTitle123() {
		return driver.getTitle();
	}

}
