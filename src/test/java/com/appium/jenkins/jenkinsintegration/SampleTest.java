package com.appium.jenkins.jenkinsintegration;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {
	
	@Test
	public void testLaunch() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, System.getProperty("PlatformName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,System.getProperty("PlatformVersion"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone Simulator");
		capabilities.setCapability("app","/Users/grupali143/Desktop/InTouchHealth.app");
		
		capabilities.setCapability("automationName", "Appium");
	        capabilities.setCapability("udid","e28900f5c9e836c1cb81c403f45569d0fe22f496");

		IOSDriver wd=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		
		//DesiredCapabilities capabilities = new DesiredCapabilities();
	    //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
	   // capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
	    //capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
	   // capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
	    //capabilities.setCapability("app","/Users/grupali143/Desktop/UiCatalog.app");
	    
	    //capabilities.setCapability("automationName", "Appium");
	   

	    //wd = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    
	   // wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElements(By.className("UIAButton")).get(0).click();
		//driver.scrollTo("Date Picker").click();
		//WebElement slider = (WebElement) driver.findElements(By.className("UIAPickerWheel")).get(0);
	        //slider.sendKeys("Mon Sep 21");
		//driver.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Jan 11");
		//driver.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("11");
		//driver.findElements(By.className("UIAPickerWheel")).get(2).sendKeys("30");
		//driver.findElements(By.className("UIAPickerWheel")).get(3).sendKeys("PM");
		//Thread.sleep(5000);
		
		/* driver.scrollTo("Date Picker").click();
	    WebElement slider = (WebElement) driver.findElements(By.className("UIAPickerWheel")).get(0);
	    slider.sendKeys("Wed Sep 16");
	    System.out.println(slider.getAttribute("values"));
	    slider = (WebElement) driver.findElements(By.className("UIAPickerWheel")).get(1);
	    slider.sendKeys("11");
	    System.out.println(slider.getAttribute("values"));
	    slider = (WebElement) driver.findElements(By.className("UIAPickerWheel")).get(2);
	    slider.sendKeys("25");
	    System.out.println(slider.getAttribute("values"));
	    slider = (WebElement) driver.findElements(By.className("UIAPickerWheel")).get(3);
	    slider.sendKeys("PM");
	    System.out.println(slider.getAttribute("values"));*/
		   
	
	 wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("rganjewar");
	    //wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[0]")).sendKeys("rganjewar");
	    wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).sendKeys("Siptest143!");
		wd.findElement(By.name("Login")).click();
		
		wd.findElement(By.name("info w")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[7]")).click();
		//wd.close();
		capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");
		
		
		driver.quit();
	}

}
