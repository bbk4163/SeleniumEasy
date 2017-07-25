package com.automation.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pageobjects.MainClass;

public class BootstrapDatePicker {

	public static final Logger APP_LOGS=Logger.getLogger(BootstrapAlerts.class.getName());
	
	@BeforeClass
	public void before() throws Throwable
	{
		TestBase.initialization();
	}
	
	@Test
	public void verifyBootstrapCalendar() {
		APP_LOGS.info("******************************************Start verifying verifyBootstrapCalendar Test Case*********************************************");
		MainClass.NavigateToDatePickers();
		MainClass.NavigateToBootstrapDatePicker();
		MainClass.ValidateToBootstrapDatePickerPage();
		
		APP_LOGS.info("==========================================Completed verifying verifyBootstrapCalendar Test Case========================================");
	  }
	
	@Test
	public void verifyDaysOfWeekDisabled(){
		APP_LOGS.info("******************************************Start verifying verifyDaysOfWeekDisabled Test Case*********************************************");
		MainClass.NavigateToDatePickers();
		MainClass.NavigateToBootstrapDatePicker();
		
		
		APP_LOGS.info("******************************************Completed verifying verifyDaysOfWeekDisabled Test Case*********************************************");
		
	}
	
	@AfterClass
	public void after()
	{
	  TestBase.destroy();
	}
	
	

}
