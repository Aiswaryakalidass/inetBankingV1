package com.intbanking.testCases;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;


public class TC_LoginTest_DDT_002 extends BaseClass{
		
		@Test (dataProvider="LoginData")
		public void loginDDT()
		{
			LoginPage lp= new LoginPage(driver);
			lp.setUserName(username);
			lp.setPassword(password);
			lp.clickLogin();
			
			
		}

		@DataProvider(name="LoginData")
		String [][] getData() throws IOException
		{
			String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
			int rownum=XLUtils.getRowCount(path, "Sheet1");
			int colcount=XLUtils.getCelCount(path, "Sheet1", 1);
			
			String loginData[][]= new String[rownum][colcount];
			for (int i=1; i<=rownum; i++)
			{
				for (int j=0; j<colcount; j++)
				{
				loginData[i-1][j]=XLUtils.GetCelData(path, "Sheet1", i, j);	
				}
			}
			return loginData;
		}
		
	}

