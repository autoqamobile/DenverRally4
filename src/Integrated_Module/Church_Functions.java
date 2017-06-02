package Integrated_Module;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.testng.Assert;

import Utility.RepositoryParser;

public class Church_Functions 
{
	public static AndroidDriver<WebElement> driver;
	public static RepositoryParser parser;
	public static TouchAction act;
	
	
	public static void Setup_Connection() throws MalformedURLException
	{
		try
		{
		
//		final File app = new File("D:\\Ventive data\\APK\\19May\\Android\\app-release (1).apk");
			
		final File app = new File("E:\\Appium\\App\\31May\\31_May_App-Release.apk");
		// Created object of DesiredCapabilities class.
		final DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("device", "Android");
		
		// Set android deviceName desired capability. Set your device name.
//		capabilities.setCapability("deviceName", "000e0bee6e2021");
//		capabilities.setCapability("deviceName", "8246f274");
		capabilities.setCapability("deviceName", "HKE69N4D"); 
		
		// Set android VERSION desired capability. Set your mobile device's OS version.
//		capabilities.setCapability(CapabilityType.VERSION, "4.3");
		capabilities.setCapability(CapabilityType.VERSION, "6.0");
		
		// Set android platformName desired capability. It's Android in our case here.
		capabilities.setCapability(CapabilityType.PLATFORM, "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		
		 // Set your application's appPackage if you are using any other app.
		capabilities.setCapability("app-package", "com.awesomeproject");
		// Set your application's appPackage if you are using any other app.
		capabilities.setCapability("app-activity", ".MainActivity");
		
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	

		//parser = new RepositoryParser("mPOSObjectRepo.properties");
		act = new TouchAction(driver);
		System.out.println("Church application has been launch successfully !!!");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			Assert.fail();
		}
		
	}
	
	
	public static void ActivityScreen() throws IOException, InterruptedException
	{
	try
	{
		parser = new RepositoryParser("ObjectRepo.properties");
		
		Thread.sleep(500);
		
		List <WebElement> list = driver.findElements(By.xpath("//android.widget.TextView[@index=2]"));
		System.out.println(list);
		list.get(0).click();	
		
		
		
		/*String ActivityTitle_GetText = driver.findElement(parser.getObjectLocator("ActivityTitle_GetText")).getText();
			
		String ExpectedActivityText = "Activity";		
		Assert.assertEquals(ActivityTitle_GetText, ExpectedActivityText);
		System.out.println("-------------------------------------");
		System.out.println("Activity Screen is successfully open.");
		System.out.println("-------------------------------------");*/
	}
	catch(Exception ex)
	{
		System.out.println(ex);
		Assert.fail();
	}
	
	}
	
	public static void EventScreen()
	{
		try
		{
			parser = new RepositoryParser("ObjectRepo.properties");
			Thread.sleep(10000);	
			
								
			List <WebElement> list = driver.findElements(By.xpath("//android.widget.ImageView[@index=0]"));		
			list.get(4).click();
			
			String EventsTitle_GetText = driver.findElement(parser.getObjectLocator("EventsTitle_GetText")).getText();
			
			String ExpectedEventsText = "Events";		
			Assert.assertEquals(EventsTitle_GetText, ExpectedEventsText);
			System.out.println("-------------------------------------");
			System.out.println("Events Screen is successfully open.");
			System.out.println("-------------------------------------");
			
			
			
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			Assert.fail();
		}
	}	
	
	public static void Events_CheckDateFormat()
	{
		try
		{
			parser = new RepositoryParser("ObjectRepo.properties");
			Thread.sleep(10000);	
			
								
			
			
			String EventsDate_month_Text = driver.findElement(parser.getObjectLocator("Events_Date_month")).getText();
			String EventsDate_Day_Text = driver.findElement(parser.getObjectLocator("Events_Date_day")).getText();
			
			String Expected_EventsDate_month_Text = "JUL";	
			String Expected_EventsDate_Day_Text = "09"; 
			
			
			Assert.assertEquals(EventsDate_month_Text, Expected_EventsDate_month_Text);
			Assert.assertEquals(EventsDate_Day_Text, Expected_EventsDate_Day_Text);
			System.out.println("-------------------------------------");
			System.out.println("Events Date Format is successfully verified.");
			System.out.println("-------------------------------------");
			
			
			
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			Assert.fail();
		}
	}
	

	public static void Events_Count()
	{
		try
		{
			Thread.sleep(8000);
			scrolldown();
			List <WebElement> Eventlist = driver.findElements(By.xpath("//android.widget.TextView[@index=1]"));
			int actualEventsCount = Eventlist.size()/2;				
			int expectedEventsCount = 4;	
			
			
			Assert.assertEquals(actualEventsCount, expectedEventsCount);
			
			System.out.println("-------------------------------------");
			System.out.println("Events Count is successfully verified and is: "+ actualEventsCount);
			System.out.println("-------------------------------------");	
			
			
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			Assert.fail();
		}
	}
	
	
	
	public static void AllEventsMonthDate()
	{
		try
		{
			Thread.sleep(8000);
			scrolldown();
			List <WebElement> group = driver.findElements(By.xpath("//android.widget.TextView[@index=1]"));
//			List<String> list = new ArrayList<String>();
			System.out.println(group.size());
			
			ArrayList<String> al=new ArrayList<String>();
			
			for(int j=0;j<group.size();j++)
			{
			String var = (group.get(j).getText());
		    al.add(var);
			
//			System.out.println("-------------------------------------");
//			System.out.println("Listed events are: "  ); 
//			System.out.println("-------------------------------------");	
			}	
			
			for(int j=0;j<(al.size());j++)
			{
				if( j % 2 == 0 )
				{
					System.out.println("-------------------------------------");
					System.out.println("Event date: " +al.get(j));
					
				}
				else{
			    System.out.println("-------------------------------------");
				System.out.println("Event: " +al.get(j));
				
				}
			}
			
			
			
//			Assert.assertEquals(actualEventsCount, expectedEventsCount);
			
			
			
			
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			Assert.fail();
		}
	}
	
	
	
	
//	Visitor Information 	
	public static void scroll() 
	{
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.1;
		int scrollStart = screenHeightStart.intValue();
		// System.out.println("s=" + scrollStart);
		Double screenHeightEnd = dimensions.getHeight() * 0.5;
		int scrollEnd = screenHeightEnd.intValue();
		driver.swipe(0, scrollStart, 0, scrollEnd, 2000);
		
		
	}
	
	public static void scrolldown () throws InterruptedException 
	{
		Dimension size = driver.manage().window().getSize();
		  System.out.println(size);
		   
		  
		  int starty = (int) (size.height * 0.1);
		  int endy = (int) (size.height * 0.5);
		  //Find horizontal point where you wants to swipe. It is in middle of screen width.
		  int startx = size.width/2;
		  System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

		  //Swipe from Top to Bottom.
		  driver.swipe(startx, endy, startx, starty, 3000);
		  Thread.sleep(2000);
		  System.out.println("Swipe done");		
		
	}
	
	
	
	
	

}
