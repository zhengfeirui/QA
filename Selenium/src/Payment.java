
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Payment {
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
  public void testPayment() throws Exception {
    driver.get(baseUrl + "/catalog/index.php");
    driver.findElement(By.cssSelector("img[alt=\"iBusiness\"]")).click();
    driver.findElement(By.cssSelector("#tdb4 > span.ui-button-text")).click();
    driver.findElement(By.cssSelector("img[alt=\"iBusiness\"]")).click();
    driver.findElement(By.cssSelector("u")).click();
    driver.findElement(By.name("email_address")).clear();
    driver.findElement(By.name("email_address")).sendKeys("ecalix@test.com");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("test123");
    driver.findElement(By.id("tdb5")).click();
    driver.findElement(By.cssSelector("img[alt=\"Samsung Galaxy Tab\"]")).click();
    driver.findElement(By.cssSelector("li.on")).click();
    driver.findElement(By.cssSelector("li.on")).click();
    driver.findElement(By.cssSelector("li.on")).click();
    driver.findElement(By.id("tdb5")).click();
    driver.findElement(By.linkText("Software->")).click();
    driver.findElement(By.cssSelector("img[alt=\"Unreal Tournament\"]")).click();
    new Select(driver.findElement(By.name("id[5]"))).selectByVisibleText("Box: Windows - English");
    driver.findElement(By.id("tdb5")).click();
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.id("tdb6")).click();
    driver.findElement(By.cssSelector("#tdb7 > span.ui-button-text")).click();
    driver.findElement(By.id("tdb6")).click();
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("payment")).click();
    driver.findElement(By.id("tdb6")).click();
    driver.findElement(By.cssSelector("img[alt=\"Disciples: Sacred Lands\"]")).click();
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
