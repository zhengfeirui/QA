

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class indeedLocatingStrategies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        //Create firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		
		//Open indeed home page
		driver.get("http://www.indeed.co.uk");
		
		//Locating by ID
		//driver.findElement(By.id("what")).sendKeys("Selenium");;
		
		//Locating by Name
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//Locating by LinkText
		//driver.findElement(By.linkText("Upload your CV")).click();
		
		//Locating by paritial link
        //driver.findElement(By.partialLinkText("Post Job")).click();
		
        //Locating by xpath
        //System.out.println(driver.findElement(By.xpath("//img[@title='Indeed job search']")).getAttribute("src"));
	
        //Locating by CssSelector
        System.out.println(driver.findElement(By.cssSelector("input.input_submit")).getAttribute("value"));
	
	}

}
