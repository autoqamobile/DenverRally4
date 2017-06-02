package Utility;

import java.io.IOException;
import org.testng.annotations.Test;

public class Common_Functions
{
	
//	Send Report and Test Scenario ID: TS_10
	@Test(enabled=true)
	public static void sendEmail() throws IOException
	{
		Runtime.getRuntime().exec("cmd /c start C:\\Backup\\Nitesh\\Nitesh data\\Test_AutomationPractice\\GIT_Platform\\qa-platform-app\\Batch_File\\SendEmail.bat");
	}
	

}
