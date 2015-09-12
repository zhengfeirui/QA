package com.iBusiness.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iBusiness.common.CommonMethods;
import com.iBusiness.common.DataDriverXLS;
import com.iBusiness.common.ReadPropertyFile;
import com.iBusiness.pages.Navigation;

public class Tests {
	private WebDriver driver;
    public CommonMethods CM;

    public String sURL="http://107.170.213.234/catalog/index.php";
    public DataDriverXLS Excel = new DataDriverXLS("/Users/ZhengfeiRui/Desktop/QADownloads/MyData.xlsx");
//    @Parameters({ "remoteBrowserType" })
   
	@BeforeMethod(alwaysRun=true)
    public void setUp(){//String remoteBrowserType
    CM=new CommonMethods(driver);
    String browser = ReadPropertyFile.getConfigPropertyVal("BrowserType");
    driver=CM.openBrowser(browser);
    String getURL = ReadPropertyFile.getConfigPropertyVal("URL");
    CM.GotoUrl(getURL);
    }
     
    @AfterMethod(alwaysRun=true)
    public void tearDown(ITestResult it) throws Exception{
    	//CommonMethods CommonMethods1 = new CommonMethods(driver);
    	//CommonMethods1.postResults(it);
    	CM.CloseBrowser();
    }
    
    @Test
    public void Cart() {
    	Navigation Navi = new Navigation(driver);
    	Navi.clickCart();
    }
    
    @Test
    public void Manufacturers(){
    	Navigation Navi = new Navigation(driver);
    	Navi.ManufacDropdown();
    }
    
    @Test
    public void CreateAccount(){
    	Navigation Navi = new Navigation(driver);
    	Navi.clickCreate();
    	Navi.enterGender(Excel.getCellData("Sheet1",0,2));
    	Navi.enterFN(Excel.getCellData("Sheet1",1,2));
    	Navi.enterLN(Excel.getCellData("Sheet1",2,2));
    	Navi.enterDOB(Excel.getCellData("Sheet1",3,2));
    	//Navi.enterEmail(Excel.getCellData("Sheet1",4,2));   	
    	Navi.enterEmail(CM.getRandomString(10)+"@gmail.com");
    	Navi.enterCompany(Excel.getCellData("Sheet1",5,2));
    	Navi.enterStreet(Excel.getCellData("Sheet1",6,2));
    	Navi.enterSuburb(Excel.getCellData("Sheet1",7,2));
    	Navi.enterPostCode(Excel.getCellData("Sheet1",8,2));
    	Navi.enterCity(Excel.getCellData("Sheet1",9,2));
    	Navi.enterState(Excel.getCellData("Sheet1",10,2));
    	Navi.selectCountry(Excel.getCellData("Sheet1",11,2));
    	Navi.enterPhone(Excel.getCellData("Sheet1",12,2));
    	Navi.enterFax(Excel.getCellData("Sheet1",13,2));
    	Navi.selectNewsLetter(Excel.getCellData("Sheet1",14,2));
    	Navi.enterPassword(Excel.getCellData("Sheet1",15,2));
    	Navi.enterConPassword(Excel.getCellData("Sheet1",16,2));
        Navi.enterClickContinue();
    	
    }

}
