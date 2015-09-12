

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class CHECKSignIn {

	public static void main(String[] args) throws InterruptedException {
		// Create firefox driver
		WebDriver driver = new FirefoxDriver();
		
		//Open Catalog Home Page
		driver.get("http://107.170.213.234/catalog/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Declaring the elements Home Page
		//WebElement lnk_Login = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[1]/u")));
		//id('bodyContent')/x:div/x:div[1]/x:a[1]/x:u
		WebElement lnk_Login = driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[1]/u"));
		
		//Sig In test
				System.out.println("1111");

				lnk_Login.click();
				
		//Declaring Elements - SigIn page
		WebElement txt_username = driver.findElement(By.name("email_address"));
		WebElement txt_password = driver.findElement(By.name("password"));
		WebElement btn_submit = driver.findElement(By.xpath(".//*[@id='tdb5']"));
		
		//Declaring Elements - Index Page
		WebElement title_welcome = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1"));
		
		
		System.out.println("2222");
        Thread.sleep(3000);
		txt_username.sendKeys("ecalix@test.com");
		txt_password.sendKeys("test123");
		btn_submit.click();
		String str_title_welcome = title_welcome.getText();
		Assert.assertEquals("Welcome to iBusiness", str_title_welcome);
			
		driver.close();
		
	
		
	}
	
	
	public void elementHighlight(WebElement element) {
		WebDriver driver = new FirefoxDriver();
		for (int i = 0; i < 2; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(
					"arguments[0].setAttribute('style', arguments[1]);",
					element, "color: red; border: 3px solid red;");
			js.executeScript(
					"arguments[0].setAttribute('style', arguments[1]);",
					element, "");
		}
	}
}


