package com.automation.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pageobjects.MainClass;

public class JavaScriptAlerts{
	public static final Logger APP_LOGS=Logger.getLogger(JavaScriptAlerts.class.getName());
	

  @Test(priority=1)
  public void verifyJavascriptAlertPage() throws InterruptedException {
	  APP_LOGS.info("******************************JAVASCRIPT ALERT***************************************");

	  MainClass.alertsAndModelsMenu();
	  MainClass.javascriptAlert();
      APP_LOGS.info("==============================End of verifyJavaScriptAlertPage TestCase========================");
  }
  @Test(priority=3)
  public static void getAlertMessage() throws InterruptedException
  {
	  
	  
	  MainClass.alertsAndModelsMenu();
	  MainClass.javascriptAlert();
	  MainClass.getAlert(false);
	  APP_LOGS.info("==============================End of getAlertMessage Testcase========================");

	 
	  //MainClass.acceptAlert();
  }
  @Test(priority=2)
  public static void acceptAlertMessage() throws InterruptedException
  {
	  MainClass.alertsAndModelsMenu();
	  MainClass.javascriptAlert();
	  MainClass.getAlert(true);
	  APP_LOGS.info("==============================End of acceptAlertMessage Testcase========================");

  }

  @AfterClass
  public static void destroyBrowser()
  {
	TestBase.destroy();
  }
	  
  
@BeforeClass
public static void login() throws Throwable
{
		
		TestBase.initialization();
}}
