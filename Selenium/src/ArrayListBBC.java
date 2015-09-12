import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArrayListBBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wb = new FirefoxDriver();
		System.out.println("1");
		wb.get("http://107.170.213.234/catalog/login.php");
		System.out.println("2");
		List<WebElement> allLinks = wb.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for (WebElement al:allLinks){
			System.out.println(al.getText());
		}
		
		System.out.println(allLinks.get(0));
		System.out.println(allLinks.get(1));
		
		wb.quit();
   
	}

}
