package com.automation.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pageobjects.MainClass;

public class BootstrapAlerts {
	public static final Logger APP_LOGS=Logger.getLogger(BootstrapAlerts.class.getName());
	
  @Test
  public void verifyBootstrapAlerts() throws InterruptedException {
	  APP_LOGS.info("******************************************BOOTSTRAP ALERTS*********************************************");
	  MainClass.alertsAndModelsMenu();
	  MainClass.bootstrapAlert();
	  MainClass.getBootstrapAlertMessage();
	 // MainClass.isAlertPresent();
	  APP_LOGS.info("==========================================End of verifyBootstrapAlerts Testcases=======================");
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
