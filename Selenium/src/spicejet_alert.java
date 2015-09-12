import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class spicejet_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		String frmdate = "17";
		
		String todate = "29";
		
		
		FirefoxDriver fd = new FirefoxDriver();
		
		
		String baseUrl = "http://www.spicejet.com";
		
		fd.get(baseUrl);
		
		fd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		fd.manage().window().maximize();
	     
	     
	      fd.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	     
	      
	      
	      fd.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		 
	      
	      
	      fd.findElement(By.linkText("Dehradun (DED)")).click();
		  Thread.sleep(500);
	      
		  fd.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		  Thread.sleep(100);
		  
		  
		  
		  fd.findElement(By.linkText("Guwahati (GAU)")).click();
		  Thread.sleep(500);
		  
		  fd.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
		  Thread.sleep(1000);
		  
		  WebElement w = fd.findElementByClassName("ui-datepicker-calendar");
		  
		  Thread.sleep(500);

			 
			 List<WebElement> rows= w.findElements(By.tagName("tr"));  
			  List<WebElement> columns=w.findElements(By.tagName("td"));  
			    
			  for (WebElement cell: columns){  
			   if (cell.getText().equals(frmdate)){  
			   cell.findElement(By.linkText(frmdate)).click();  
			   break;  
			   }  
			  }   
		 		     
		   Thread.sleep(100);
		 
		   WebElement w1 = fd.findElementByClassName("ui-datepicker-calendar");	
		   
		   List<WebElement> rows1= w1.findElements(By.tagName("tr"));  
			  List<WebElement> columns1=w1.findElements(By.tagName("td"));  
			    
			  for (WebElement cell: columns1){  
			    
			   if (cell.getText().equals(todate)){  
			   cell.findElement(By.linkText(todate)).click();  
			   break;  
			   }  
			  }    
		   
		   
		   
		  fd.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		  WebElement we  = fd.findElement(By.id("selectMainBody"));
          		  
		  
		  List<WebElement> aE = we.findElements(By.tagName("table"));
		  
	
		 
		
		  for(WebElement item : aE )
		  {
		      
			  System.out.println("***" + item.getTagName());
			  
			  
			  
		         String sText =   item.getAttribute("id");
		         System.out.println("*****" + sText + "******");
		         if (sText.isEmpty()) 
		        	   break;
		  
		    WebElement e1 = fd.findElement(By.id(sText));
			List<WebElement> lst1 = e1.findElements(By.tagName("tr"));
			for(WebElement wb : lst1){
					System.out.println("Selected value: " + wb.getText()); 
		  
		  
	              } 
		  
		  
			
		  
		  
	    } 
		  	
			
		  
		  
		  
			 }      
	      
	
	}

	
