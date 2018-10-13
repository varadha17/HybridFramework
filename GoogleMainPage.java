package com.gg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gg.baseclass.BaseClass;

public class GoogleMainPage extends BaseClass {
	
	
	public GoogleMainPage() throws Exception {
		
			PageFactory.initElements(driver, this);
		
	}
	
	//Page-factory or Object-repository
	
	@FindBy(id="hplogo")
	WebElement ImgGoogle;
	
	@FindBy(linkText="Gmail")
	WebElement GmailLink;
	
	@FindBy(xpath="//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")
	WebElement ImgLink;
	
	@FindBy(xpath="//*[@id=\"gbwa\"]/div[1]/a")
	WebElement Googleapps;
	
	@FindBy(xpath="//*[@id=\"gb_70\"]")
	WebElement SigninBtn;
	
	//Actions
	public boolean GoogleImgLogo() {
		
		return ImgGoogle.isDisplayed();
	}
	
	public GmailPage GmailLinkVerify() throws Exception {
		
		GmailLink.click();
		return new GmailPage();
	}
	
	public GoogleImage verifyGoogleImgPage() {
		ImgLink.click();
		return new GoogleImage();
	}
	
	public GoogleAppsPage verifyApp() {
		Googleapps.click();
		return new GoogleAppsPage();
	}
	
	public GmailPage siginBtnVerify() throws Exception {
		
		GmailLink.click();
		return new GmailPage();
	}

	
}
