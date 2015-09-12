package com.iBusiness.common;
 
import java.io.File;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
 
public class CommonMethods {
    private WebDriver driver;
 
    public CommonMethods(WebDriver driver){
        this.driver = driver;
    }
     
    public void setDriver(WebDriver driver){
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
        else if(sBrowserType.equalsIgnoreCase("IE")){
//        	File IEdriver = new File("C:\\Selenium\\drivers\\IEDriverServer.exe");
//            System.setProperty("webdriver.ie.driver", IEdriver.getAbsolutePath());
//            driver = new InternetExplorerDriver();
        	File IEfile = new File("C:\\Selenium\\drivers\\IEDriverServer.exe");
        	System.setProperty("webdriver.ie.driver", IEfile.getAbsolutePath());
        	DesiredCapabilities Capabilities = new DesiredCapabilities();
        	Capabilities = DesiredCapabilities.internetExplorer();
        	Capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        	Capabilities.setCapability("nativeEvents", false);
        	driver = new InternetExplorerDriver(Capabilities);
        	System.out.println("IE is opened");
          }
        else if(sBrowserType.equalsIgnoreCase("Remote")) {
        	driver= new RemoteWebDriver(DesiredCapabilities.firefox());         
           }
        else {
               System.out.println("Only Firefox, Chrome, and IE are supported at this time. Please select the right browser");  
           }
        
     
        driver.manage().window().maximize();
        System.out.println("Browser is maximized");
//        driver.manage().deleteAllCookies();
        System.out.println("deleted all cookies");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
      }
     
    public void GotoUrl(String sURL){
        driver.get(sURL);
        System.out.println("Navigating to "+sURL);
    }
    
 
    public void CloseBrowser(){
        driver.quit();
        System.out.println("Browser is closed");
    }
     
    public void VerifyTitle(String sTitle){
        String ActualTile=getTitle();
        System.out.println("ActualTitle="+ActualTile);
        Assert.assertEquals(ActualTile, sTitle);
    }

 
    public String getTitle(){
        try{
            return driver.getTitle();
        }
        catch(Exception e){
            return "Not able to capture title";
        }
 
    }
     
    public void clickElement(WebElement sLocator){
        //driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
        try{
            sLocator.click();
            System.out.println("clicked");
        }catch(NoSuchElementException e){
            System.out.println("element not found");
        }
     }
 
 
//  public void clickElementByLinkText(String element){
//      try{
//          driver.findElement(By.linkText(element)).click();
//          System.out.println(element+" clicked");
//      }catch(Exception e){
//          System.out.println(element+" not found");
//      }
//   }

    public void setValue(WebElement sLocator, String sValue){
        try{
            sLocator.clear();
            sLocator.sendKeys(sValue);
            System.out.println(sValue+" entered");
        }catch(Exception e){
            System.out.println(sLocator+" not found");
        }
         
    }
     
//     public void verifyText(String expected){
//         try{
//             System.out.println("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" verified");
//            // return true;
//         }
//         catch(NoSuchElementException e){
//             System.out.println("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" not found");
//             Assert.fail("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" not found");
//         }
//          
//     }
    
    public String getRandomString (int length){
    	Random random = new Random();
    	String result = new BigInteger(Long.SIZE*length,random).toString(32);
    	return result.substring(0,  length);
    	
    }
    
   
    
    public void setDropdown(WebElement sLocator, String sValue){
    	new Select(sLocator).selectByVisibleText(sValue);
    }
    
    public void setDropdownInt(WebElement sLocator, int sValue){
    	new Select(sLocator).selectByIndex(sValue);
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
   
    public void acceptAlert(){
    	String alert = driver.switchTo().alert().getText();
    	System.out.println(alert);
    	driver.switchTo().alert().accept();
    }
    
//	JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolling up or down
//	jse.executeScript("scroll(250,0);");
//	jse.executeScript("scroll(0,50);");
}