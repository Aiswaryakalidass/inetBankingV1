package com.intbanking.testCases;




import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddNewCustomerPage;
import com.inetbanking.pageObjects.LoginPage;


public class TC_AddNewCustomer_003 extends BaseClass{
	
	@Test
	public void AddNewCustomer() throws InterruptedException, IOException{ 
	LoginPage lp=new LoginPage(driver);
    lp.setUserName(username);
	lp.setPassword(password);
	lp.clickLogin();
	
	AddNewCustomerPage addcust= new AddNewCustomerPage(driver);
	addcust.ClickNewCustomer();
	logger.info("clicked NewCuster button");
	addcust.setCustomerName("Aishwarya");
	logger.info("Name Entered");
	addcust.clickBtnFemale();
	logger.info("Clicked female button");
	Thread.sleep(1000);
	addcust.setDOB("1990");
	addcust.findDOB();
	addcust.setDOB("03");
	addcust.setDOB("31");
	logger.info("Entered DOB");
	addcust.setAddress("3655 kinston road");
	logger.info("Entered the address");
	addcust.setcityName("Chennai");
	logger.info("Entered the cityname");
	addcust.setstateName("Tamilnadu");
	logger.info("Entered the Statename");
	addcust.setpinNo("731671");
	logger.info("Entered Pinno");
	addcust.setTelNo("8390749183");
	logger.info("Entered telephone Number");
	addcust.setMailIdclr();
	addcust.setMailId("wehgdggu@gmail.com");
	logger.info("Entered the emailid");
	addcust.setNCpasswordclr();
	addcust.setNCpassword("wsafajri");
	logger.info("Entered the password");
	addcust.clickSubmit();
	logger.info("Clicked submit");
	
	Thread.sleep(1000);
	
	boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
	
	if (res==true)
	{
		Assert.assertTrue(true);
		logger.info("Test passed");
	}
	else
	{
		captureScreen(driver,"AddNewCustomer");
		Assert.assertTrue(false);
		logger.info("Test failed");
		
	}
	}
	
}
