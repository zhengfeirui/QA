package com.ecalix.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecalix.common.Common;

public class LoginPage {
	private WebDriver driver;
	Common CM;
	public String EmailAddress="email_address";
	public String Password="password";
	public String SignInButton="//*[@id='tdb5']/span[2]";
	public String SignOff="//*[@id='tdb4']/span";
	public String LogYourSelfLink="log yourself in";
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		CM=new Common(this.driver);
	this.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
		public void Login(String userName,String password ){
			CM.setValueByName(EmailAddress,userName);
			CM.setValueByName(Password,password);
			CM.clickElementByXPATH(SignInButton);
		}
		
		public void clickLogOff(){
			CM.clickElementByXPATH(SignOff);
		}
		
		public void clickLogYourSelfLink(){
			System.out.println("ready to clink ");
			CM.clickLink(LogYourSelfLink);
			//driver.findElement(By.xpath(LogYourSelfLink)).click();
			System.out.println("link clicked");
		}
		
		public void enterUserName(String UserName){
			CM.setValueByName(EmailAddress,UserName);
		}
		
	   public void enterPassword(String password){
			CM.setValueByName(Password,password);
		}
   
	   public void clickSignIn(){
		   CM.clickElementByXPATH(SignInButton);
	   }

}
