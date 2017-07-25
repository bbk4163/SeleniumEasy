package com.automation.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pageobjects.MainClass;

public class SingleSelectDropdownList {
	public static final Logger APP_LOGS=Logger.getLogger(SingleSelectDropdownList.class.getName());
	
  @Test(priority=1)
  public void SelectDay() {
	  MainClass.inputForm();
	  MainClass.selectDropdownListMenu();
	  MainClass.selectADay();
	  APP_LOGS.info("=====================================End of SelectDay Testcase====================================");
  }
  @Test(priority=2)
  public void verifyMessage()
  {
	  
	  
	  
	  APP_LOGS.info("=====================================End of verifyMessage Testcase====================================");
  
	  
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
