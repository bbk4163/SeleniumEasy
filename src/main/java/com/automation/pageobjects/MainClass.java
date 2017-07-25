package com.automation.pageobjects;
//import com.automation.base.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.base.TestBase;

public class MainClass extends TestBase{
	
	//public static WebDriver driver=null;
	public static Select sel=null;
	public static final Logger APP_LOGS=Logger.getLogger(MainClass.class.getName());
	//public static WebElement cBoxValue=singleSelectCheckbox();
//---------------------------------------CheckBoxDemo Methods-------------------------------------------------------
	/*public static void launchBrowser()
	
	{
		System.out.println("Open Mozilla browser");
		driver=new FirefoxDriver();
		System.out.println("Maximise the window");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void launchUrl()
	{
		System.out.println("Navigate to Selenium Easy.com");
		driver.get("http://www.seleniumeasy.com/test/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}*/
	public static void inputForm()
	{
		//System.out.println("click on InputFormlink");
		driver.findElement(By.xpath(prop.getProperty("inputformlink"))).click();
		APP_LOGS.info("InputFormLInk is clicked");
	}
	public static void checkboxDemo()
	{
		//System.out.println("click on Checkbox Demo");
		driver.findElement(By.xpath(prop.getProperty("checkboxdemolink"))).click();
		APP_LOGS.info("CheckBox Demo Link is clicked");

	}
	public static void singleSelectCheckbox()
	{
		//System.out.println("select the Single checkbox");
		WebElement cBox=driver.findElement(By.id(prop.getProperty("singleselectcheckbox")));
		cBox.click();
		APP_LOGS.info("Single select Checkbox Checked");
		verifySelected(cBox);
		//return cBox;
	}
	
public static void verifySelected(WebElement cBox)
	{
		
		//System.out.println("Verify the checkbox is selected or not");
		if(cBox.isSelected())
		{
			APP_LOGS.info("Verified and found Checkbox selected");
		}
		else
		{
			APP_LOGS.info("Verified and found Checkbox not selected");
		}

	}
public static void compareMessage()
{
	System.out.println("Verify Expected and actual are true");
	String expectedmessage="Success - Check box is checked";
	String actualmessage=driver.findElement(By.xpath(prop.getProperty("successmessage"))).getText();
	System.out.println(actualmessage);
	if(expectedmessage.equalsIgnoreCase(actualmessage))
	{
		APP_LOGS.info("The expectedmessage is same as "+actualmessage);
	}
	else
	{
		APP_LOGS.info("The expectedmessage is not same as "+actualmessage);}

}
public static void selectAllCheckbox()
{
	//System.out.println("Select all the checkbox");
	WebElement cBoxAll=driver.findElement(By.xpath(prop.getProperty("checkall_button")));
	cBoxAll.click();
	APP_LOGS.info("All the options selected");
}
public static void getButtonLabel()
{
//System.out.println("Verify if Check All button label getting changed to Uncheck all");
String uncheck=driver.findElement(By.xpath(prop.getProperty("checkall_button"))).getAttribute("value");
APP_LOGS.info("label is "+uncheck);
if(uncheck.equalsIgnoreCase("Uncheck All"))
{
	APP_LOGS.info("Button label Check All got Changed to Uncheck All.The actual value on the button is "+uncheck);
}
else
{
	APP_LOGS.info("Button label Check All did not Changed to Uncheck All.The actual value on the button is "+uncheck);
}}
public static void deselectOneCheckbox()
{
	
	driver.findElement(By.xpath(prop.getProperty("option3"))).click();
	APP_LOGS.info("one checkbox deselected");
	//System.out.println("Verify the button label");
	String actLabel=driver.findElement(By.xpath(prop.getProperty("checkall_button"))).getAttribute("value");
	APP_LOGS.info("actual text on the button is "+actLabel);
	if(actLabel.equalsIgnoreCase("Check All"))
	{
		APP_LOGS.info("Button label Uncheck All got Changed to Check All after deselcting one option.The actual label is "+actLabel);
	}
	else
	{
		APP_LOGS.info("Button label Uncheck All did not Changed to Check All after deselcting one option.The actual label is "+actLabel);

	}
	}


	public static void destroyBrowser()
	{
		System.out.println("Close the Active Browser");
		driver.quit();
		
	}

	//-----------------------------------ListBox Methods--------------------------------------------------

public static void selectDropdownListMenu()
{

	driver.findElement(By.xpath(prop.getProperty("selectdropdownlist_link"))).click();
	APP_LOGS.info("Select Dropdown List Menu selected");
}
public static void selectADay()
{
	sel=new Select(driver.findElement(By.xpath(prop.getProperty("selectaday_dropdown"))));
	sel.selectByVisibleText("Tuesday"); 
	APP_LOGS.info("Day Selected");
	String expText="Tuesday";
	String actText=driver.findElement(By.xpath(prop.getProperty("selectaday_dropdown"))).getAttribute("value");
	if(expText.equalsIgnoreCase(actText))
	{
		APP_LOGS.info("Expected Text is matiching with the selected Option.The Selected Option is "+actText);
	}
	else
	{
		APP_LOGS.info("Expected Text is not matiching with the selected Option.The Selected Option is "+actText);
	}
	
	}
public static void displayMessage()
{
	APP_LOGS.info("Verify the vaue selected in dropdownlist is displayed or not");
	
}
public static void firstlySelected() throws InterruptedException
{

sel=new Select(driver.findElement(By.xpath(prop.getProperty("multiselect_listbox"))));
List<WebElement> options=sel.getOptions();
int listSize=options.size();
APP_LOGS.info("The listbox options are:");
for(int i=3;i<=listSize;i++)
{
	String oValue=sel.getOptions().get(i).getText();
	APP_LOGS.info(oValue);
	sel.selectByIndex(i);
	Thread.sleep(2000);
}
WebElement firstOption=(sel.getFirstSelectedOption());
APP_LOGS.info("First Selcted option is "+firstOption.getText());
}



//-------------------------------------Bootstrap Alerts--------------------------------------

public static void alertsAndModelsMenu()
{
	driver.findElement(By.xpath(prop.getProperty("alertandmodelsmenu_link"))).click();
	APP_LOGS.info("Alert and Models Menu options opened");
}
public static void bootstrapAlert()
{
	driver.findElement(By.xpath(prop.getProperty("bootstrapalert_link"))).click();
	APP_LOGS.info("Navigated to Bootstrap Alert Page");
	String s=driver.getTitle();
	APP_LOGS.info(s);
}
public static void getBootstrapAlertMessage() throws InterruptedException
{
	String alerts=driver.findElement(By.xpath(prop.getProperty("autoclosable_button"))).getText();
	APP_LOGS.info("The message on the bootstrap button is "+alerts);
	//WebElement alertElement=driver.findElement(By.xpath(".//*[@id='autoclosable-btn-success']"));
	driver.findElement(By.xpath(prop.getProperty("autoclosable_button"))).click();
	APP_LOGS.info("Clicked on bootstrap alert button");

	
	/*WebDriverWait wait = new WebDriverWait(driver, 2 timeout in seconds);
	if(wait.until(ExpectedConditions.alertIsPresent())==null)
	    System.out.println("alert was not present");
	else
	    System.out.println("alert was present");*/
	
	
	//String alertText=alertElement.getText();
	//System.out.println(alert1.getText());	
	//Alert alert=driver.switchTo().alert();
	String alertMsg=driver.findElement(By.xpath(prop.getProperty("autoclose_alertmessage"))).getText();
	Thread.sleep(10000);
	APP_LOGS.info(alertMsg);
	
	//driver.switchTo().alert().accept();
}
/*public static boolean isAlertPresent() 
{ 
	WebElement alertElement=driver.findElement(By.xpath(".//*[@id='autoclosable-btn-success']"));
	alertElement.click();
    try 
    { 
        driver.switchTo().alert(); 
        return true; 
    }   // try 
    catch (NoAlertPresentException Ex) 
    { 
        return false; 
    }   // catch 
*/


//---------------------------------Javascript Alerts-----------------------------------

	
public static void javascriptAlert()
{
	
	driver.findElement(By.xpath(prop.getProperty("javascriptalertmenu"))).click();
	//String s1=driver.getTitle();
	APP_LOGS.info("Navigateed to Javascript Alerts menu page");
//System.out.println(s1);
}
public static void getAlert(boolean flag) throws InterruptedException
{
	//System.out.println("Get the alertmessage");
	driver.findElement(By.xpath(prop.getProperty("clickme"))).click();
	APP_LOGS.info("Clickme button clicked");

	Alert alert=driver.switchTo().alert();
	String alertText=alert.getText();
	APP_LOGS.info("Alert message is-"+alertText);

	//alert.accept();
	Thread.sleep(5000);
	 if(flag)
	{
		 acceptAlert(alert);
		 }
	
}
public static void acceptAlert(Alert alert) throws InterruptedException
{
	//System.out.println("Try to accept the message");
	alert.accept();
	Thread.sleep(5000);
	APP_LOGS.info("Alert message accepted");

}
//********* Mohan's Test Cases ***********
public static void NavigateToJQuerySelectDropdown(){
	
	driver.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/a")).click();
	
	driver.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/ul/li[7]/a")).click();
	System.out.println("You are in JQuery Select Dropdown Page");
}

public static void NavigateToDatePickers(){
	
	driver.findElement(By.xpath(prop.getProperty("datepickers_link"))).click();
	System.out.println("You Clicked on DatePickers Menu");
}

public static void NavigateToBootstrapDatePicker(){
	
	driver.findElement(By.xpath(prop.getProperty("bootstrapdatepicker_link"))).click();
	System.out.println("You Clicked on Bootstrap DatePickers Link");
}

public static void ValidateToBootstrapDatePickerPage(){
	
	String actTitle = driver.findElement(By.xpath(prop.getProperty("bootstrapdatepicker_header"))).getText();
	
	String expTitle="Bootstrap Date Pickers Example";
	
		if(expTitle.equalsIgnoreCase(actTitle))
	{
		APP_LOGS.info("You are in the Bootstrap DatePicker Test Case Page");
	}
	else
	{
		APP_LOGS.info("You are not in the Bootstrap DatePicker Test Case Page");
	}
	
}

public static void daysOfWeekDisabled(){
	driver.findElement(By.xpath("//*[@id='sandbox-container1']/div/span/i")).click();
	/*List<WebElement> alldays = driver.findElement(By.xpath("//table[@class='table-condensed']//th"));
	
	for (WebElement dayofweek : alldays)
	{
		String day=dayofweek.getText();
		if(day.equalsIgnoreCase("Su"))
		{
			System.out.println("Week Of Day Sunday is disabled");;
			break;
		}
	}*/
	
	
}


// ****************************Bala's Classes***********************

///input form


public static void inputFormLaunch() 
{
	driver.findElement(By.xpath(prop.getProperty("inputformlink"))).click();
	driver.findElement(By.xpath(prop.getProperty("inputFormSubmit"))).click();	
}

public static void enterInputFormDetails()
{

	driver.findElement(By.xpath(prop.getProperty("inputformlink"))).click();
	driver.findElement(By.xpath(prop.getProperty("inputFormSubmit"))).click();
	driver.findElement(By.cssSelector(prop.getProperty("firstName"))).sendKeys("FirstName");
	driver.findElement(By.cssSelector(prop.getProperty("lastName"))).sendKeys("LastName");
	driver.findElement(By.cssSelector(prop.getProperty("eMail"))).sendKeys("eMail@email.com");
	driver.findElement(By.cssSelector(prop.getProperty("phoneNumber"))).sendKeys("9008001242");
	driver.findElement(By.cssSelector(prop.getProperty("address"))).sendKeys("1234, 1st street");
	driver.findElement(By.cssSelector(prop.getProperty("city"))).sendKeys("City");
	
	//State Selector
	WebElement stateList = driver.findElement(By.cssSelector(prop.getProperty("state")));
	Select oneState=new Select(stateList);
	oneState.selectByIndex(3);
	
	driver.findElement(By.cssSelector(prop.getProperty("zipCode"))).sendKeys("12345");
	driver.findElement(By.cssSelector(prop.getProperty("projDescription"))).sendKeys("This is Project Description");
	driver.findElement(By.cssSelector(prop.getProperty("sendButton"))).click();
	
	
	APP_LOGS.info("*****************InputFormSubmit Button is clicked*****************");
	
	
}

public static void inputFormSubmitInValidValidations()
{
	driver.findElement(By.cssSelector(prop.getProperty("sendButton"))).click();
	List<WebElement> inValidAlert=driver.findElements(By.cssSelector(prop.getProperty("allFieldsValidationErrorMessages_Invalid")));
	
	for(int i=0;i<inValidAlert.size();i++)
	{
		System.out.print(inValidAlert.get(i).getText()+"-->");
		String displayMessage= inValidAlert.get(i).getText();
		
		if (displayMessage.equals("Please supply your first name"))
		{
			System.out.println("Error Message Displayed for FirstName is Correct");
		}else if (displayMessage.equals("Please supply your last name"))
		{
			System.out.println("Error Message Displayed for LastName is Correct");
		}else if (displayMessage.equals("Please supply your email address"))
		{
			System.out.println("Error Message Displayed for Email is Correct");
		}else if (displayMessage.equals("Please supply your phone number"))
		{
			System.out.println("Error Message Displayed for PhoneNumber is Correct");
		}else if (displayMessage.equals("Please supply your street address"))
		{
			System.out.println("Error Message Displayed for Street Address is Correct");
		}else if (displayMessage.equals("Please supply your city"))
		{
			System.out.println("Error Message Displayed for City is Correct");
		}else if (displayMessage.equals("Please supply your state"))
		{
			System.out.println("Error Message Displayed for state is Correct");
		}else if (displayMessage.equals("Please supply your zip code"))
		{
			System.out.println("Error Message Displayed for zip code is Correct");
		}else if (displayMessage.equals("Please supply a description of your project"))
		{
			System.out.println("Error Message Displayed for Description is Correct");
		}
	}
	
	APP_LOGS.info("*****************InputFormSubmit Button Error Validation is Completed*****************");
	
	
}

//Ajax Form

public static void ajaxFormLaunc()
{
	driver.findElement(By.xpath(prop.getProperty("inputformlink"))).click();
	driver.findElement(By.xpath(prop.getProperty("ajaxFormSubmit"))).click();

}

public static void enterAjaxFormDetails() throws InterruptedException
{
	driver.findElement(By.cssSelector(prop.getProperty("name"))).sendKeys("This should be name of Ajax field");
	driver.findElement(By.cssSelector(prop.getProperty("comment"))).sendKeys("A Lead QA Engineer is responsible for all of the activities in the testing of the product, including system and integration testing, test plan review, and best practice improvements. Work with Platform engineering team to plan and develop test suites for a set of products. Maintain and evaluate tests day to day and report problems discovered.  Work with developers to make hard-to-test features more testable for QA. Understand the inner workings of technologies of applications under test. Should be aware that job of a Quality Assurance Engineer is to speak up at any point in the process and test the edge cases of products, and lobby for having problems encountered to get fixed. Ensure the quality of various software products through test planning and execution, serving as a technical point of contact for a product, and assisting the QA Manager drive projects to completion through project planning and management");
	driver.findElement(By.cssSelector(prop.getProperty("submitButton"))).click();
	Thread.sleep(5000);
	WebElement successMsg=driver.findElement(By.cssSelector(prop.getProperty("successMsg")));
	boolean msgStatus=successMsg.getText().equals("Form submited Successfully!");
	if(msgStatus){
		System.out.println("Form submited Successfully!");	
		APP_LOGS.info("*****************AJAXFormSubmit Flow is over*****************");
	}
	else
	{
		System.out.println("Something Wrong");
		APP_LOGS.info("*****************AJAXForm Submit has some issue*****************");
	}
}

public static void ajaxFormSubmitInValidValidations()
{
	driver.findElement(By.cssSelector(prop.getProperty("submitButton"))).click();
	String errNameFieldValidation = driver.findElement(By.cssSelector(prop.getProperty("name"))).getAttribute("style");
	if(errNameFieldValidation.equalsIgnoreCase("border: 1px solid rgb(255, 0, 0);")){
		System.out.print("Name is Mandate value to Enter");
		APP_LOGS.info("*****************AJAXForm Field Validation is over*****************");
	}
	
}

//RangeSlider

public static void rangeSlidersLaunch()
{
/*	driver.findElement(By.xpath(prop.getProperty("progressBarSlider"))).click();
	driver.findElement(By.xpath(prop.getProperty("dragNDropSlider"))).click();*/
	
	driver.get("http://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html");

}

public static void rangeSlidersSliderOne()
{
	
	WebElement sliderOneRange=driver.findElement(By.xpath(prop.getProperty("slider1Range")));
	WebElement sliderOneRangeText=driver.findElement(By.xpath(prop.getProperty("slider1RangeValue")));
	Actions act=new Actions(driver);
	
	//act.clickAndHold(sliderOneRange).build().perform();;
	act.dragAndDropBy(sliderOneRange, 10, 0).build().perform();
	APP_LOGS.info("Slide1 value is incresed and Current value is:: "+sliderOneRangeText.getText());
	
	
}

public static void rangeSlidersAll() throws InterruptedException
{
	List<WebElement> allSlidersRanges=driver.findElements(By.xpath(prop.getProperty("allSlidersRange")));
	
	
	List<WebElement> allSiderRangeValues=driver.findElements(By.xpath(prop.getProperty("allSlidersRangeValue")));
	Actions act=new Actions(driver);
	for(int i=0;i<allSlidersRanges.size();i++)
	{
		act.click(allSlidersRanges.get(i)).build().perform();
		System.out.println(allSlidersRanges.get(0).getText());
		//act.dragAndDropBy(allSlidersRanges.get(0), 25, 0).build().perform();
		APP_LOGS.info("Slide value is incresed and Current value is:: "+allSiderRangeValues.get(i).getText());
		Thread.sleep(5000);
	}
}

}

