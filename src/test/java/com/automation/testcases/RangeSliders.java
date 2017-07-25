package com.automation.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pageobjects.MainClass;

public class RangeSliders {
	
	@BeforeClass
	  public static void before() throws Throwable
	  {
		  TestBase.initialization();
	  }
	@Test
	public static void validatingFieldsData() throws InterruptedException
	{
		MainClass.rangeSlidersLaunch();
		//MainClass.rangeSlidersSliderOne();
		MainClass.rangeSlidersAll();
		
		
	}

}
