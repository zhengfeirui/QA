


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionExample 
{
    private static FirefoxDriver driver;

    @BeforeMethod
    public void setUp() 
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() 
    {
        driver.close();
        driver.quit();
    }

    @Test(enabled = true)
    public void draggable() throws Exception
    {
        driver.get("http://jqueryui.com/demos/draggable/");
        Thread.sleep(1000);
        //driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div[2]/div/div/iframe")));
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        Thread.sleep(1000);
        WebElement draggable = driver.findElement(By.id("draggable"));

        new Actions(driver).dragAndDropBy(draggable, 400, 120).build().perform();
        Thread.sleep(2000);
        
    }

    @Test(enabled = true)
    public void droppable() throws InterruptedException
    {
        driver.get("http://jqueryui.com/demos/droppable/");
        Thread.sleep(1000);
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div[2]/div/div/iframe")));
        Thread.sleep(1000);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        new Actions(driver).dragAndDrop(draggable, droppable).build().perform();
        Thread.sleep(2000);

    }

    @Test(enabled = true)
    public void selectMultiple() throws InterruptedException  
    {
        driver.get("http://jqueryui.com/demos/selectable/");
        Thread.sleep(1000);
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div[2]/div/div/iframe")));

        Thread.sleep(1000);
        List<WebElement> listItems = driver.findElements(By.cssSelector("ol#selectable *")); //cssxpath

        Actions builder = new Actions(driver);
        builder.clickAndHold(listItems.get(1)).click(listItems.get(2));// list is starting from 0

        Action selectMultiple = builder.build();
        
        selectMultiple.perform();
        Thread.sleep(2000);


    }

    @Test(enabled = true)
    public void sliding() throws InterruptedException 
    {
        driver.get("http://jqueryui.com/demos/slider/");
        Thread.sleep(1000);

        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div[2]/div/div/iframe")));
        Thread.sleep(1000);

        WebElement draggable = driver.findElement(By.className("ui-slider-handle"));
        
        new Actions(driver).dragAndDropBy(draggable, 150, 0).build().perform();
        Thread.sleep(2000);


    }
    
    @Test
    public void movement() throws InterruptedException {
    	driver.get("http://www.macys.com/");
        Thread.sleep(1000);
        
        WebElement w1 = driver.findElement(By.xpath(".//*[@id='flexLabel_13247']/a"));
        WebElement w2 = driver.findElement(By.xpath(".//*[@id='flexLabel_25122']/a"));
       
        Actions builder =new Actions(driver);
        builder.moveToElement(w1).build().perform();
        builder.moveToElement(w2).build().perform();
        w2.click();
        Thread.sleep(2000);
   
    }
    
    
}
