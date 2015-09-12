import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException{
		String URL = "http://www.spicejet.com";
		String departTime = "17";
		String returnTime = "29";
		//没有测试已经过去的日期！！！
		
		WebDriver wd = new FirefoxDriver();//是否可以用WebDriver替代FirefoxDriver？
		wd.get(URL);
		//wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		wd.manage().window().maximize();
		wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		//wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		//点击下拉或者点击方框 都会显示下拉菜单的  所以上下2种都可以
		wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("IXA");
		//在方框中sendkey是不可行的吗？  此处点击下拉菜单 点击选择一个  因此sendkey貌似不是很切题
		
		wd.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[4]/a")).click();
		//wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction']")).click();
		wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		//wd.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[1]/a")).click();
		//use xpath there is a problem, it will not show DEL so will use text instead
		wd.findElement(By.linkText("Chennai (MAA)")).click();
		wd.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
		//Jessica的code没有考虑是第一个月的还是接下来某个月的多少号  有一定的局限性
		//而且既然考虑了日期是复杂化的选择 为什么出发地和目的地没有这么做呢？
		
		//for departTime selection
		WebElement we = wd.findElement(By.className("ui-datepicker-calendar"));
		Thread.sleep(500);

		List<WebElement> rows =we.findElements(By.tagName("tr"));
		List<WebElement> cols =we.findElements(By.tagName("td"));

		
		for(WebElement cell :cols){
			if (cell.getText().equals(departTime)){
				cell.findElement(By.linkText(departTime)).click();
				break;
			}
		}
		
		   Thread.sleep(100); //此处不能缺 否则没法显示选择return日期

		//for return date selection   Why cannot ommit the same part?
		WebElement we1 =wd.findElement(By.className("ui-datepicker-calendar"));
		System.out.println("1111");

		List<WebElement> rows1 = we1.findElements(By.tagName("tr"));
		List<WebElement> cols1 = we1.findElements(By.tagName("td"));
		System.out.println("22222");

		for(WebElement cell :cols1){
			if (cell.getText().equals(returnTime)){
				cell.findElement(By.linkText(returnTime)).click();
				break;
			}
		}
		

		wd.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		WebElement wet = wd.findElement(By.id("selectMainBody"));
		List <WebElement> wet_tables = wet.findElements(By.tagName("tables"));
		
		for (WebElement cell: wet_tables){
			
			System.out.println("****"+cell.getTagName());
			
			String sText = cell.getAttribute("id");
			System.out.println("****"+sText+"****");
			if(sText.isEmpty()){
				break;
			}
						
			WebElement e1 = wd.findElement(By.id(sText));
			List<WebElement> lst1 = e1.findElements(By.tagName("tr"));
			for(WebElement wb : lst1){
					System.out.println("Selected value: " + wb.getText()); 
			}
			
			
			
		}
		
		

	}
}
