package com.intbanking.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig=new ReadConfig();


	public String baseURL=readConfig.getApplicationURL();
	public String username=readConfig.getUserName();
	public String password=readConfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	
	public void setup(String browser)
	{	
		logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
	if (browser.equals("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver",readConfig.getChromeDriver());
		driver=new ChromeDriver();
	}
	else if(browser.equals("edge")) 
	{
		System.setProperty("webdriver.edge.driver",readConfig.getEdgeDriver());
		driver=new EdgeDriver();
	}
	driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File (System.getProperty("user.dir")+"/Screenshots/"+ tname+ ".png");
		FileUtils.copyFile(source,target);
		System.out.println("Screenshot taken");
	}
}
