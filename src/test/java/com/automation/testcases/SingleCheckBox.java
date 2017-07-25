package com.automation.testcases;
import com.automation.base.TestBase;
import com.automation.pageobjects.MainClass;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SingleCheckBox{
	public static final Logger APP_LOGS=Logger.getLogger(SingleCheckBox.class.getName());
	
	
	
	@Test(priority=1)
  public void checkSingleSelectCheckbox()
  {
		APP_LOGS.info("************************************CHECKBOX RELATED TESTCASES-SINGLESELECTCHECKBOX**************************************");

	  MainClass.inputForm();
	  MainClass.checkboxDemo();
	  MainClass.singleSelectCheckbox();
	  APP_LOGS.info("=====================================End of checkSingleSelectCheckbox Testcase====================================");

	  //MainClass.verifySelected();
  }
	@Test(priority=2)
	public void verifySucessMessage()
	{
	
		 MainClass.inputForm();
	     MainClass.checkboxDemo();
		 MainClass.singleSelectCheckbox();
		 MainClass.compareMessage();
		 APP_LOGS.info("=====================================End of verifySuccessMessage Testcase====================================");

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
