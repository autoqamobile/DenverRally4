package ChurchApp_Pack_Sanity;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.RepositoryParser;

public class ChurchApp_Sanity 
{
	/*public static AndroidDriver<WebElement> driver;
	public static RepositoryParser parser;
	public static TouchAction act;*/


	//	SetUp Connection and Test Scenario ID: TS_01
	@Test(priority = 1, enabled=true)
	public static void setUp() throws MalformedURLException
	{
		Integrated_Module.Church_Functions.Setup_Connection();
	}
	
	//	Activity Screen and Test Scenario ID: TS_02
	@Test(priority = 2, enabled=false)
	public static void ActivityScreen() throws IOException, InterruptedException
	{
		Integrated_Module.Church_Functions.ActivityScreen();
	}
	
	//	Event Screen and Test Scenario ID: TS_03
	@Test(priority = 3, enabled=true)
	public static void EventScreen() throws IOException, InterruptedException
	{
		Integrated_Module.Church_Functions.EventScreen();
	}
	
//	Event Screen and Test Scenario ID: TS_04
	@Test(priority = 4, enabled=false)
	public static void Events_CheckDateFormat () throws IOException, InterruptedException
	{
		Integrated_Module.Church_Functions.Events_CheckDateFormat();
	}
	
//	Event Screen and Test Scenario ID: TC_07
	@Test(priority = 5, enabled=true)
	public static void Events_Count () throws IOException, InterruptedException
	{
		Integrated_Module.Church_Functions.Events_Count();
	}
	
//	Event Screen and Test Scenario ID: TC_08
	@Test(priority = 5, enabled=true)
	public static void AllEventsMonthDate () throws IOException, InterruptedException
	{
		Integrated_Module.Church_Functions.AllEventsMonthDate();
	}
	
}
