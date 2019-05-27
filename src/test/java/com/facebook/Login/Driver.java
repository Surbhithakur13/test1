package com.facebook.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class Driver {
	
		String path;
	    WebDriver div;

		@Test
		public void Launch() {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "D:\\btes\\selenium\\chromedriver\\chromedriver.exe");
			div = new ChromeDriver(options);
//			String path=System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
//			System.setProperty("webdriver.chrome.driver", path);
//			div= new ChromeDriver();
			div.get("https://www.facebook.com/");

	
	
		}

}
