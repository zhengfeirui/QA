package com.ecalix.common;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class Common {
	private WebDriver driver;
	
	public Common(WebDriver driver){ //capital Common
		this.driver = driver;
	}
	
	public WebDriver openBrowser(String sBrowserType){
		if (sBrowserType.equalsIgnoreCase("Chrome")){
			File chromedriver = new File("/Users/ZhengfeiRui/Desktop/QADownloads/chromedriver");
			System.setProperty("webdriver.chrome.driver", chromedriver.getAbsolutePath());
			DesiredCapabilities Capabilities = new DesiredCapabilities();
			Capabilities = DesiredCapabilities.chrome();
			Capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
			driver = new ChromeDriver(Capabilities);
			System.out.println("Chrome Browser is opened");
		  }
		else if (sBrowserType.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
			// driver.manage().deleteAllCookies();
			System.out.println("FireFox Browser is opened");
		   }
		else if(sBrowserType.equalsIgnoreCase("Remote")) {
					driver= new RemoteWebDriver(DesiredCapabilities.firefox());			
		   }
		else {
			   System.out.println("Only Firefox and Chrome supported at this time. Please select the right browser");  
		   }
	
		driver.manage().window().maximize();
		System.out.println(" Browser is mazimized");
		driver.manage().deleteAllCookies();
		System.out.println("deleted all cookies");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public void gotoURL(String sURL){
		driver.get(sURL);
		System.out.println("Navigating to "+sURL);
	}
	
	public void CloseBrowser(){
	    driver.quit();
	    System.out.println("Browser is closed");
	}
	
	 public void verifyText(String expected){
		 try{
			 driver.findElement(By.xpath("//*[contains(text(),'"+ expected.trim() +"')]"));
			 System.out.println("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" verified");
			// return true;
		 }
		 catch(NoSuchElementException e){
			 System.out.println("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" not found");
			 Assert.fail("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" not found");
		 }
		 		 
	 }
	 
		public void setValueByName(String elementName, String sValue){
			try{
				driver.findElement(By.name(elementName)).clear();
				driver.findElement(By.name(elementName)).sendKeys(sValue);
				System.out.println(sValue+" entered");
			}catch(Exception e){
				System.out.println(elementName+" not found");
			}
			
		}
		
		public void clickElementByXPATH(String element){
			//driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
			try{
				driver.findElement(By.xpath(element)).click();
				System.out.println(element+" clicked");
			}catch(NoSuchElementException e){
				System.out.println(element+" not found");
			}
		 }

     public void clickLink(String LinkName){
    		try{
				driver.findElement(By.partialLinkText(LinkName)).click();
				System.out.println(LinkName+" clicked");
			}catch(NoSuchElementException e){
				System.out.println(LinkName+" not found");
			}
     }
}
