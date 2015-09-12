import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmallTest {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub
		
		FirefoxDriver ds = new FirefoxDriver();
		
		
		
		 //String str; 
		 ds.get("http://www.icicidirect.com");
		 Thread.sleep(1000);
		 ds.findElement(By.linkText("Markets")).click();
		 ds.manage().window().maximize();
		 
		 Thread.sleep(1000);
		 ds.findElement(By.xpath(".//*[@id='nseNifty']")).click();
		 
		 Thread.sleep(1000);
		 WebElement table = ds.findElement(By.id("Table27"));
		 
		 
		
		 
		 List<WebElement> rows = table.findElements(By.tagName("tr"));
		 //System.out.println("rows  " + rows);
		 
		 for(WebElement r: rows)
		 {
			
		    
			 System.out.println("row text" + r.getText());
			 
			 if(r.getText().isEmpty())
  			 {
  				 
  				 ds.findElement(By.xpath(".//*[@id='ajaxNSETGDetailsData']/div/a")).click();
  			      
  			 } 
			 
			List<WebElement> cols = r.findElements(By.tagName("td"));
			 
		     for(WebElement c : cols)
		     {
		    	   
		    	   {
		    		   
		    		   
		    		   System.out.println(c.getText());
		    		   
		    		   
		    	   }
		    	   
		     }
		   System.out.println("88888888888888888");
		 
		 
		 
		 
		 }	 
		 
		 
		 
		/* .//*[@id='ajaxStatsData']/div
		 
		 for(int r=1;r<=rows;r++)
		 {
		  str=ds.getTable("gridSource."+r+".0").trim();
		  if(str.matches("ABB"))
		  {
			  for(int c=0;c<=7;c++)
			  {
				  System.out.println(ds.getTable("gridSource."+r+"."+c));
				   	  
			  }
		   break;	  
		  } */
	
		  	 
		 }
	
}

	


