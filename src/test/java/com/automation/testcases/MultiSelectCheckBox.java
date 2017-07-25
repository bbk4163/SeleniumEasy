package com.automation.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pageobjects.MainClass;

public class MultiSelectCheckBox {
	public static final Logger APP_LOGS=Logger.getLogger(MultiSelectCheckBox.class.getName());
	

	@Test(priority=1)
  public void verifyCheckAllButtonCLick()
  {
		
		APP_LOGS.info("********************************CHECKBOXDEMO-MULTISELECTCHECKBOX*****************************");
	  MainClass.inputForm();
	  MainClass.checkboxDemo();
	  MainClass.selectAllCheckbox();
	  APP_LOGS.info("=============================End Of verifyCheckAllButtonClick TestCase===========================");
  }
	@Test(priority=2)
	public void verifyButtonLabel()
	{
		 MainClass.inputForm();
	     MainClass.checkboxDemo();
	     MainClass.selectAllCheckbox();
	     MainClass.getButtonLabel();
	     APP_LOGS.info("=============================End Of verifyButtonLabel TestCase-Button Label Changed to Uncheck All after selecting all options===========================");

	}
	@Test(priority=3)
	public void verifyBUttonLabelAfterDeselectOneOption()
	{
		 MainClass.inputForm();
	     MainClass.checkboxDemo();
	     MainClass.selectAllCheckbox();
	     MainClass.deselectOneCheckbox();
	     APP_LOGS.info("=============================End Of verifyBUttonLabelAfterDeselectOneOption TestCase-Button Label Changed to Check All after selecting all options=======");


	}
	@AfterClass
	  public void after()
	  {
		  TestBase.destroy();
	  }
	@BeforeClass
		public void before() throws Throwable
		{
		TestBase.initialization();
	}
	
}
