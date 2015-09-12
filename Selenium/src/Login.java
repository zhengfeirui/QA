import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Login {
	
private WebDriver driver;


    @Before
	public void setUp(){
		
		driver = new FirefoxDriver(); //open firefox
		driver.get("http://107.170.213.234/catalog/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}

	@Test
	public void Login01(){
		
		driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
		driver.findElement(By.name("email_address")).sendKeys("ecalix@test.com");;
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.xpath(".//*[@id='tdb5']/span[2]")).click();
		String ExpectedText = "Welcome to iBusiness";
		String ActualText = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
		Assert.assertEquals(ExpectedText,ActualText);
		driver.findElement(By.xpath(".//*[@id='tdb4']/span")).click();		
	}

	@Test
	public void Login02(){
		
		driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
		//System.out.println("1");
		driver.findElement(By.xpath(".//*[@id='tdb5']/span[2]")).click();
		//System.out.println("2");
		String ExpectedText = " Error: No match for E-Mail Address and/or Password.";
		String ActualText = driver.findElement(By.xpath(".//*[@id='bodyContent']/table/tbody/tr/td")).getText();
		System.out.println("Expected="+ExpectedText+"Actual="+ActualText);
		Assert.assertEquals(ExpectedText.trim(),ActualText.trim());
		//System.out.println("3");		
	}

	@After
	public void tearDown(){
		
		driver.quit();
		
	}

}
