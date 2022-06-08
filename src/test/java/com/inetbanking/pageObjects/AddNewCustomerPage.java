package com.inetbanking.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	WebDriver ldriver;
	
	 public AddNewCustomerPage(WebDriver driver)
	 {
		ldriver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(linkText="New Customer") WebElement newCustomer;
	 @FindBy (xpath=" //input[@name='name']") WebElement customerName;
	 @FindBy (xpath=" //input[@value='m']") WebElement btnMale;
	 @FindBy (xpath=" //input[@value='f']") WebElement btnFemale;
	 @FindBy (xpath="//input[@id='dob']") WebElement dob;
	 @FindBy (xpath="//textarea[@name='addr']") WebElement address;
	 @FindBy (xpath="//input[@name='city']") WebElement cityName;
	 @FindBy (xpath="//input[@name='state']") WebElement stateName;
	 @FindBy (xpath="//input[@name='pinno']") WebElement pinNo;
	 @FindBy (xpath="//input[@name='telephoneno']") WebElement telNo;
	 @FindBy (xpath="//input[@name='emailid']") WebElement mailId;
	 @FindBy (xpath=" //input[@name='password']") WebElement NCPassword;
	 @FindBy (xpath=" //input[@name='sub']") WebElement btnsubmit;

public void ClickNewCustomer()
{
	 newCustomer.click();
}

public void setCustomerName(String custName)
{
	 customerName.sendKeys(custName);
}
public void clickBtnMale()
{
	 btnMale.click();
}
public void clickBtnFemale()
{
	 btnFemale.click();
}
public void findDOB()
{
	 dob.sendKeys(Keys.TAB);
	 
}
public void setDOB(String yy)
{
	 dob.sendKeys(yy);
	 
}

public void setAddress(String add)
{
	address.sendKeys(add);
}
public void setcityName(String txtcity)
{
	cityName.sendKeys(txtcity);
}
public void setstateName(String txtState)
{
	stateName.sendKeys(txtState);
}
public void setpinNo(String pinNum)
{
	pinNo.sendKeys(pinNum);
}
public void setTelNo(String telNum)
{
	telNo.sendKeys(telNum);
}
public void setMailIdclr()
{
	mailId.click();
	mailId.sendKeys(Keys.CONTROL+"a");
	mailId.sendKeys(Keys.DELETE);
}
public void setNCpasswordclr()
{ NCPassword.click();
	NCPassword.sendKeys(Keys.CONTROL+"a");
	NCPassword.sendKeys(Keys.DELETE);
}
public void setMailId(String mailid)
{
	mailId.sendKeys(mailid);
}
public void setNCpassword(String pwd)
{
	NCPassword.sendKeys(pwd);
}
public void clickSubmit()
{
	btnsubmit.click();
}
}