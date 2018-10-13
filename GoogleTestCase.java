package com.gg.GoogleTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gg.baseclass.BaseClass;
import com.gg.pages.GoogleMainPage;

public class GoogleTestCase extends BaseClass {
	
	GoogleMainPage mainpage;
	
	public GoogleTestCase() throws Exception {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception{
		Initialize();
		
		mainpage = new GoogleMainPage();
	
	}
	
	@Test
	public void ImgTest() {
		
		boolean flag = mainpage.GoogleImgLogo();
		System.out.println(flag);
	}
	
	@Test
	public void GmailTest() throws Exception {
		
		mainpage.GmailLinkVerify();
	}
	
	@Test
	public void GoogleImgLinkTest() throws Exception {
		
		mainpage.verifyGoogleImgPage();
	}
	
	@Test
	public void GoogleappTest() throws Exception {
		
		mainpage.verifyApp();
	}
	
	@Test
	public void GoogeSigin() throws Exception {
		
		mainpage.siginBtnVerify();
	}
	
	@AfterMethod
	public void end() {
		driver.quit();
	}
}
