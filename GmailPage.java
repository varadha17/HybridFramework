package com.gg.pages;

import org.openqa.selenium.support.PageFactory;

import com.gg.baseclass.BaseClass;

public class GmailPage extends BaseClass {
	
	public GmailPage() throws Exception{
		
		PageFactory.initElements(driver, this);
	}
	
	public String GmailpageTitle() {
		
		return driver.getTitle();
	}

}
