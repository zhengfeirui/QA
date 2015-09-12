

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver wb = new FirefoxDriver();

		//WebDriver wb = new SafariDriver();
		wb.get("http://www.gmail.com");
		wb.navigate().to("http://www.gmail.com");
		//wb.navigate().to("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");

		wb.findElement(By.name("Email")).sendKeys("ruixx001@gmail.com");
		wb.findElement(By.name("Email")).clear(); //
		wb.findElement(By.name("Email")).sendKeys("ruixx002@gmail.com");
		wb.findElement(By.name("signIn")).click();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

/*	    //test navigate back and forward fails
        wb.findElement(By.id("link-forgot-passwd")).click();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		wb.navigate().back();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		wb.navigate().forward();

		

/*
		//Facbook one test ok for navigate back()
		WebDriver driver= new FirefoxDriver();
		String URL="http://www.facebook.com";
		driver.navigate().to(URL);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.navigate().back();
*/
		
		

		Thread.sleep(1000);

		wb.findElement(By.name("Passwd")).sendKeys("uafcup1981");
		//wb.findElement(By.name("Passwd")).sendKeys(Keys.RETURN);
		wb.findElement(By.name("Passwd")).sendKeys(Keys.ENTER);

		//wb.findElement(By.name("Passwd")).sendKeys(Keys.PAUSE);//Not sure about what functionality it is 

		//wb.findElement(By.id("signIn")).click(); //上面的return  enter 相当于click功能
        
		wb.manage().window().maximize();

        File scrFile = ((TakesScreenshot)wb).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        FileUtils.copyFile(scrFile, new File("/Users/ZhengfeiRui/Desktop/screenShot.png"));
		wb.quit();
    
       
       /*	
        	
		WebDriver wb1 = new FirefoxDriver();
		wb1.get("http://www.gmail.com");
		String s1 = wb1.findElement(By.xpath("//a[@href='https://www.google.com/accounts/recovery?hl=en']")).getText();
        System.out.println(s1);
        wb1.quit();
        
       */ 



		

	}

}
