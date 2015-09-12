package com.ecalix.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecalix.common.Common;
import com.ecalix.pages.LoginPage;

@Test(groups = "Login")
public class LoginTests {
	private WebDriver driver;
	LoginPage LoginPage;
	Common CM;
	
	@BeforeMethod
	public void setUp(){
		CM=new Common(driver);
		driver=CM.openBrowser("Firefox");
		//driver=CM.openBrowser("Remote");
		CM.gotoURL("http://107.170.213.234/catalog/");
		
		System.out.println("Hello");//test running process
	}
	
	
	@Test
	public void Login01() throws InterruptedException{
	    LoginPage=new LoginPage(driver);
		LoginPage.clickLogYourSelfLink();
		LoginPage.Login("ecalix@Test.com", "test123");
		Thread.sleep(1000);
		CM.verifyText("Welcome to iBusiness");
		LoginPage.clickLogOff();
		//throw new RuntimeException();// added to test dependOnMethods functionality on login02
		//driver.quit(); //因为对每一个test 先运行beforemethod然后test 然后aftermethod 如此再循环第二个test。因不需要再用driver quit了
		
	}
	
	
	@Test (dependsOnMethods = { "Login01" })// NOT WORKING!!!
	//@Test
	public void Login02() throws InterruptedException{
	    LoginPage = new LoginPage(driver);
		LoginPage.clickLogYourSelfLink();
		LoginPage.clickSignIn();
		Thread.sleep(1000);
		CM.verifyText(" Error: No match for E-Mail Address and/or Password.");
		//driver.quit();
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void tearDown(){
		System.out.println("BYBY");
		CM.CloseBrowser();//就是在common里面定义的driver.quit()
		
	}

}
