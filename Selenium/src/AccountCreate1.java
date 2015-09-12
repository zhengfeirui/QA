

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreate1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://107.170.213.234/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCreateAccount() throws Exception {
    driver.get(baseUrl + "/catalog/");
    driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[2]/u")).click();
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys("jessica");
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys("chopra");
    driver.findElement(By.id("dob")).clear();
    driver.findElement(By.id("dob")).sendKeys("08/30/1963");
    driver.findElement(By.xpath("//div[@id='bodyContent']/form/div/div[3]/table/tbody/tr/td[2]")).click();
    driver.findElement(By.name("email_address")).clear();
    driver.findElement(By.name("email_address")).sendKeys("jessica_chopra@yahoo.com");
    driver.findElement(By.name("company")).clear();
    driver.findElement(By.name("company")).sendKeys("ecalix");
    driver.findElement(By.name("street_address")).clear();
    driver.findElement(By.name("street_address")).sendKeys("1535 rubino ct");
    driver.findElement(By.name("postcode")).clear();
    driver.findElement(By.name("postcode")).sendKeys("94566");
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("pleasanton");
    driver.findElement(By.name("state")).clear();
    driver.findElement(By.name("state")).sendKeys("CA");
    new Select(driver.findElement(By.name("country"))).selectByVisibleText("United States");
    driver.findElement(By.name("telephone")).clear();
    driver.findElement(By.name("telephone")).sendKeys("510-453-9160");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("pooja123");
    driver.findElement(By.name("confirmation")).clear();
    driver.findElement(By.name("confirmation")).sendKeys("pooja123");
    driver.findElement(By.id("tdb4")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
