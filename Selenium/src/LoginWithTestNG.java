

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginWithTestNG {
	
private WebDriver driver;


    @BeforeMethod
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
		//System.out.println("1"); Test purpose
		driver.findElement(By.xpath(".//*[@id='tdb5']/span[2]")).click();
		//System.out.println("2");
		String ExpectedText = " Error: No match for E-Mail Address and/or Password.";
		String ActualText = driver.findElement(By.xpath(".//*[@id='bodyContent']/table/tbody/tr/td")).getText();
		//System.out.println("Expected="+ExpectedText+"Actual="+ActualText);
		Assert.assertEquals(ExpectedText.trim(),ActualText.trim());
		//System.out.println("3");		
	}

	@AfterMethod
	public void tearDown(){
		
		driver.quit();
		
	}

}
