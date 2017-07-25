/**
 * 
 */
package com.automation.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pageobjects.MainClass;

/**
 * @author bbanduch
 *
 */
public class AjaxFormSubmit {
	
	String sheetName = "InputFormSubmit";
	
	@BeforeClass
	  public static void before() throws Throwable
	  {
		  //TestBase.initialization();
	  }
	
	@Test
	public static void validatingFieldsData() throws InterruptedException
	{
		MainClass.ajaxFormLaunc();
		MainClass.ajaxFormSubmitInValidValidations();
		
		
	}
	
	@Test
	public static void enterAjaxFormDetails() throws InterruptedException
	{
		MainClass.ajaxFormLaunc();
		MainClass.ajaxFormSubmitInValidValidations();
		MainClass.enterAjaxFormDetails();
		
	}
	
	@AfterClass
		public static void after()
		{
			TestBase.destroy();
		}
}
