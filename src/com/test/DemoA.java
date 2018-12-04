package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void run() {
		WebDriver driver = new FirefoxDriver();
		Reporter.log("Open browser");
		driver.get("https://google.com");
		Reporter.log("Google");
	}
}