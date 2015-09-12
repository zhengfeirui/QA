

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageFactoryChrome {
private WebDriver driver;

@FindBy(how = How.NAME, using = "email_address")
private WebElement EMAILADDRESS;

@FindBy(how = How.NAME, using = "password")
private WebElement PASSWORD;

@FindBy(how = How.XPATH, using = "//*[@id='tdb5']/span[1]")
private WebElement SIGNIN;

@FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/div/div[1]/a[1]/u")
private WebElement LOGYOURSELFIN;

@FindBy(how = How.XPATH, using = "//*[@id='tdb4']/span")
private WebElement LOGOFF;

@Test
public void Login_01() throws InterruptedException{
	File chromedriver = new File("/Users/ZhengfeiRui/Desktop/QADownloads/chromedriver");
	System.setProperty("webdriver.chrome.driver", chromedriver.getAbsolutePath());
	DesiredCapabilities Capabilities = new DesiredCapabilities();
	Capabilities = DesiredCapabilities.chrome();
	Capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
	driver = new ChromeDriver(Capabilities);
	System.out.println("Chrome Browser is opened");
	//driver=new SafariDriver();
	driver.get("http://107.170.213.234/catalog/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	PageFactory.initElements(this.driver, this);
//	testPageFactory LoginPage =PageFactory.initElements(driver, testPageFactory.class);
	LOGYOURSELFIN.click();
	EMAILADDRESS.sendKeys("ecalix@test.com");
	PASSWORD.sendKeys("test123");
	SIGNIN.click();
	Thread.sleep(300);
	LOGOFF.click();
}

}
