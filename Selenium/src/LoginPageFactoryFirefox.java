

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageFactoryFirefox {
private WebDriver driver;

@FindBy(how = How.NAME, using = "email_address")
private WebElement EMAILADDRESS;

@FindBy(how = How.NAME, using = "password")
private WebElement PASSWORD;

@FindBy(how = How.XPATH, using = "//*[@ID='tdb5']/span[1]") //xpath is case insensitive
private WebElement SIGNIN;

@FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/div/div[1]/a[1]/u")
private WebElement LOGYOURSELFIN;

@FindBy(how = How.XPATH, using = "//*[@Id='tdb4']/span")
private WebElement LOGOFF;

@Test
public void Login_01() throws InterruptedException{
	driver = new FirefoxDriver();
	driver.get("http://107.170.213.234/catalog/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	PageFactory.initElements(this.driver, this);
                         //	testPageFactory LoginPage =PageFactory.initElements(driver, testPageFactory.class);
	LOGYOURSELFIN.click();
	EMAILADDRESS.sendKeys("ecalix@test.com");
	PASSWORD.sendKeys("test123");
	SIGNIN.click();
	LOGOFF.click();
	Thread.sleep(2000);
	driver.close();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//close not working????even response time
	//Thread.sleep(2000);  //Add this will cause failure, explain why???
    System.out.println("Browser closed");
	driver.get("http://107.170.213.234/catalog/");
    System.out.println("Browser open");

}

}
