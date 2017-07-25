package com.automation.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pageobjects.MainClass;

public class MultipleSelectDropdownList {
	public static final Logger APP_LOGS=Logger.getLogger(MultipleSelectDropdownList.class.getName());
	
  @Test
  public void selectMultipleOption() throws InterruptedException {
	  APP_LOGS.info("*******************************MULTIPLE SELECT DROPDOWN LIST******************************");
	  MainClass.inputForm();
	  MainClass.selectDropdownListMenu();
	  MainClass.firstlySelected();
	  APP_LOGS.info("===============================End of selectMultipleOption TestCase============================");
  }
  @BeforeClass
  public static void before() throws Throwable
  {
	  TestBase.initialization();
  }

@AfterClass
	public static void after()
	{
		TestBase.destroy();
	}
}
