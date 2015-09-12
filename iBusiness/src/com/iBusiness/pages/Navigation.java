package com.iBusiness.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.iBusiness.common.CommonMethods;

public class Navigation {
	private WebDriver driver;
    public CommonMethods CM;
    
    public Navigation(WebDriver driver){
        System.out.println("Setting up Create Account page");
        this.driver = driver;
        CM=new CommonMethods(this.driver);
        PageFactory.initElements(this.driver, this);
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[2]/span[1]/a/span[2]")
    private WebElement CartContents;
    
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/p/span/a/span[1]")
    private WebElement CartContinue;
    
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/div[2]/div[2]/form/select")
    private WebElement Manufacturers;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/div/div[1]/a[2]/u")
    private WebElement CreateAccount;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[1]/h2")
    private WebElement VerifyInfo;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")
    private WebElement Male;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")
    private WebElement Female;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[2]/td[2]/input")
    private WebElement FirstName;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[3]/td[2]/input")
    private WebElement LastName;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='dob']")
    private WebElement DOB;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[5]/td[2]/input")
    private WebElement Email;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[3]/table/tbody/tr/td[2]/input")
    private WebElement Company;
    
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[1]/td[2]/input")
    private WebElement Street;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[2]/td[2]/input")
    private WebElement Suburb;
    
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[3]/td[2]/input")
    private WebElement PostCode;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[4]/td[2]/input")
    private WebElement City;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[5]/td[2]/input")
    private WebElement State;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[6]/td[2]/select")
    private WebElement Country;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[1]/td[2]/input")
    private WebElement Phone;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[2]/td[2]/input")
    private WebElement Fax;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[3]/td[2]/input")
    private WebElement NewsLetter;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[1]/td[2]/input")
    private WebElement Password;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[2]/td[2]/input")
    private WebElement ConPassword;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='tdb4']")
    private WebElement ClickContinue;  
    
    public void clickCart(){
    	CM.clickElement(CartContents);
    	CM.clickElement(CartContinue);
//    	CM.VerifyTitle("What's In My Cart?");
    }
    
    public void ManufacDropdown(){
    	CM.setDropdown(Manufacturers, "Samsung");
    }
    
    public void clickCreate(){
    	CM.clickElement(CreateAccount);
    }
    
    
    public void enterGender(String Gender){
      if(Gender.equals("Male"))
    	  CM.clickElement(Male);
      else if (Gender.equals("Female"))
    	  CM.clickElement(Female);
      else 
    	  System.out.println("Gender not clear");
    }
    
    public void enterFN(String sValue){
    	CM.setValue(FirstName,sValue);
    }
    
    
    public void enterLN(String sValue){
    	CM.setValue(LastName,sValue);
    }
    
    public void enterDOB(String sValue){
    	CM.setValue(DOB,sValue);
    }
    
    public void enterEmail(String sValue){
    	CM.setValue(Email,sValue);
    }
    
    public void enterCompany(String sValue){
    	CM.setValue(Company,sValue);
    }
    
    public void enterStreet(String sValue){
    	CM.setValue(Street,sValue);
    }
    
    public void enterSuburb(String sValue){
    	CM.setValue(Suburb,sValue);
    }
    
    public void enterPostCode(String sValue){
    	CM.setValue(PostCode,sValue);
    }
    
    public void enterCity(String sValue){
    	CM.setValue(City,sValue);
    }
    
    public void enterState(String sValue){
    	CM.setValue(State,sValue);
    }
    
    public void selectCountry(String sValue){
    	CM.setDropdown(Country, sValue);
    }
    
    public void enterPhone(String sValue){
    	CM.setValue(Phone,sValue);
    }
    
    
    public void enterFax(String sValue){
    	CM.setValue(Fax,sValue);
    }
            
    
    public void selectNewsLetter(String NL){
    	if(NL.equals("NewsLetter"))
    		CM.clickElement(NewsLetter);  
    }
    
    public void enterPassword(String sValue){
    	CM.setValue(Password,sValue);
    }
    
    public void enterConPassword(String sValue){
    	CM.setValue(ConPassword,sValue);
    }
    
    
    public void enterClickContinue(){
    	CM.clickElement(ClickContinue);
    }
    
}
