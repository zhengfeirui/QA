

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class indeedJobSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        //Create firefox driver to drive the browser
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/ZhengfeiRui/Desktop/QADownloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//Open indeed home page
		driver.get("http://www.indeed.co.uk");
		//Find what field and enter "seleninum"
		Thread.sleep(1000);
		driver.findElement(By.id("what")).clear();
		driver.findElement(By.id("what")).sendKeys("Selenium");;
		//Find location field and enter London
		Thread.sleep(1000);
		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys("London");;
		
		//Find FindJobs button and click on it
		Thread.sleep(1000);
        driver.findElement(By.id("fj")).click();
		//From job search result page and get page title
		//
        driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.id("searchCount")).getText());
        driver.close();
		
	}

}
