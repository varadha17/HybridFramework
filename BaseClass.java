package com.gg.baseclass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gg.Utility.TestUtility;

public class BaseClass {
	
	public static Properties prop;
	
	public static WebDriver driver;
	
	public BaseClass() throws Exception {

		prop = new Properties();
		
		FileInputStream file = new FileInputStream("C:\\Users\\name\\eclipse-workspace\\GoogleTest\\src\\main\\java\\com\\properties\\config.properties");
		
		prop.load(file);
	}

	
	public void Initialize() {
		
		String name = prop.getProperty("browser");
		
		if(name.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\sel chrome driver\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}else if(name.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			
			driver = new FirefoxDriver();
		}else {
			System.out.println("No browser");
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtility.Page_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtility.ImplicityWait,TimeUnit.SECONDS );
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
	
	}
}
