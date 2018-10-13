package com.gg.GoogleTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gg.baseclass.BaseClass;
import com.gg.pages.GmailPage;
import com.gg.pages.GoogleMainPage;

import junit.framework.Assert;

public class GmailPageTest extends BaseClass{

	GoogleMainPage mainpage;
	GmailPage GPage;
	
	
	public GmailPageTest() throws Exception  {
		
		super();
	}
	
	@BeforeMethod
	public void setUpHome() throws Exception {
		
		Initialize();
		mainpage = new GoogleMainPage();
		
		GPage = mainpage.GmailLinkVerify();
		
		
	}
	
	@Test
	public void VerifyTitle() throws Exception {
		
		String title = GPage.GmailpageTitle();
		Assert.assertEquals(title, "Gmail - Free Storage and Email from Google");
		
		
	}
	
	
	@AfterMethod
	
	public void EndGmailPage() {
		driver.quit();
	}
	
	
}
