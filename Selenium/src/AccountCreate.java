

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreate {
	
	static String url = "http://107.170.213.234/catalog/login.php";
	static WebElement wElement;
	static String sText = "";
	static boolean result;
	
	
	public static void print(boolean res){
		if(res)
		System.out.println("Test case passed");
		else
			System.out.println("Test case failed");
			
	}
	
	
	public static boolean openwebsite(FirefoxDriver fd){
		fd.get(url);
		wElement = fd.findElementByXPath(".//*[@id='bodyContent']/h1");
		sText = wElement.getText();
		System.out.println(sText);
		
		if (sText.equals("Welcome, Please Sign In") )
			return true;
		else 
		    return false;			
	}
	
	
    public static boolean MyAccount(FirefoxDriver fd) throws InterruptedException{
    	
    	Thread.sleep(300);
         fd.findElementByXPath(".//*[@id='tdb4']/span[2]").click();
         wElement = fd.findElementByXPath(".//*[@id='bodyContent']/h1");
         sText = wElement.getText();
         System.out.println(sText);
         return true;        
		}
    
    
    public static boolean datainput(FirefoxDriver fd){
    	fd.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
    	fd.findElement(By.name("firstname")).sendKeys("Jeff");
    	fd.findElement(By.name("lastname")).sendKeys("Rui");
    	fd.findElement(By.name("dob")).sendKeys("08/08/1988");
    	fd.findElement(By.name("email_address")).sendKeys("zhengfeirui2@gmail.com");
    	
    	fd.findElement(By.name("company")).sendKeys("Clairx");
    	
    	fd.findElement(By.name("street_address")).sendKeys("Stonbridge Drive");
    	fd.findElement(By.name("suburb")).sendKeys("NoIdea");
    	fd.findElement(By.name("postcode")).sendKeys("94553");
    	fd.findElement(By.name("city")).sendKeys("Pleason");
    	fd.findElement(By.name("state")).sendKeys("CA");
    	new Select(fd.findElement(By.name("country"))).selectByVisibleText("United States");
    	
    	fd.findElement(By.name("telephone")).sendKeys("911911911");
    	fd.findElement(By.name("fax")).sendKeys("123456789");
    	fd.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[3]/td[2]/input")).click();
    	fd.findElement(By.name("password")).sendKeys("123456");
    	fd.findElement(By.name("confirmation")).sendKeys("123456");

    	return true;

    }
    
        public static boolean AccountCreate(FirefoxDriver fd) throws InterruptedException{
    	
    	 //Thread.sleep(100);
         fd.findElementByXPath(".//*[@id='tdb4']").click();
         wElement = fd.findElementByXPath(".//*[@id='bodyContent']/h1");
         sText = wElement.getText();
         System.out.println(sText);
         
         fd.findElementByXPath(".//*[@id='tdb5']/span[2]").click();
         wElement = fd.findElementByXPath(".//*[@id='bodyContent']/h1");
         sText = wElement.getText();
         System.out.println(sText);
         return true;        
		}
       
  //public static boolean 
  //  .//*[@id='tdb5']/span[2]
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    FirefoxDriver fd = new FirefoxDriver();
    result = openwebsite(fd);   
    print(result);
    result = MyAccount(fd);
    print(result);
    result = datainput(fd);
    print(result);
    result = AccountCreate(fd);
    print(result);
    	
    }
    
	

}
