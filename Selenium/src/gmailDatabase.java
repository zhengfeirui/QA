import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class gmailDatabase {
	
	
    
	public static void main(String[] args) throws SQLException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		

    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/gmail","root","");
	Statement stmt = (Statement) conn.createStatement();
	
	
	String strSelect1 = "select username, password from login order by username";
	System.out.println(strSelect1);
	ResultSet rset1 = stmt.executeQuery(strSelect1);
	System.out.println(rset1);
    
	int i =0;

	while(rset1.next()){
		
		String UN = rset1.getString("username");
		String PW = rset1.getString("password");
		
		System.out.print(UN);
		System.out.print(", ");
		System.out.println(PW);
	    WebDriver wb = new FirefoxDriver();

		wb.navigate().to("http://www.gmail.com");
		wb.findElement(By.name("Email")).sendKeys(UN);
		wb.findElement(By.name("signIn")).click();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wb.findElement(By.name("Passwd")).sendKeys(PW);
		wb.findElement(By.name("Passwd")).sendKeys(Keys.ENTER);
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        File scrFile = ((TakesScreenshot)wb).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        Thread.sleep(3000);
        i++;
        FileUtils.copyFile(scrFile, new File("/Users/ZhengfeiRui/Desktop/screenShot"+i+".png"));
        
        wb.quit();//without this quit, it will have 3 browser windows open

	}
	
	
	
	
	}

}
