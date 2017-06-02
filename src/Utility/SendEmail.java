package Utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.annotations.Test;


public class SendEmail {

	@Test
	public static void Sendmail() throws Exception {

		final String username = "APatel";
		final String password = "abc@123";

		Properties props = new Properties();
		props.put("mail.smtp.auth", false);
		props.put("mail.smtp.starttls.enable", false);
		props.put("mail.smtp.host", "172.18.10.13");
		props.put("mail.smtp.port", "25");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		}); 

		try {
//			ExcelUtils.setExcelFile(TestData.Path_TestData + TestData.File_TestData,"Send_Email_Sheet");
			
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("NoReply_Selenium@syxautomations.co.in"));
			
			message.addRecipients(Message.RecipientType.TO, InternetAddress.parse("nitesh.harit@syxautomations.co.in"));
//			message.addRecipients(Message.RecipientType.CC, InternetAddress.parse("Prakash.jha@syxautomations.co.in"));
//			message.addRecipients(Message.RecipientType.CC, InternetAddress.parse("Christof.Cuypers@syx.be"));
			
//			message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(ExcelUtils.getCellData(1, "TO")));
//			message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(ExcelUtils.getCellData(2, "CC")));
//			message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(ExcelUtils.getCellData(3, "CC")));
			message.setSubject("NG Platform Sanity Test Automation Result");

			MimeBodyPart messageBodyPart = new MimeBodyPart();	         
			Multipart multipart = new MimeMultipart();
			messageBodyPart = new MimeBodyPart();

			String justContent = readContentFromHtmlFile();
			messageBodyPart.setContent(justContent, "text/html");
			multipart.addBodyPart(messageBodyPart);	        
			messageBodyPart = new MimeBodyPart();        

			String file = "C:\\Backup\\Nitesh\\Nitesh data\\Test_AutomationPractice\\GIT_Platform\\qa-platform-app\\Output.txt";
			String fileName = "Automation Log Report.txt";

			DataSource source = new FileDataSource(file);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(fileName);

			multipart.addBodyPart(messageBodyPart);	        
			message.setContent(multipart);

			System.out.println("Sending Email...");

			Transport.send(message);

			System.out.println("Congrats... mail has been sent successfully");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	private static String readContentFromHtmlFile() throws InterruptedException {
		StringBuilder contentBuilder = new StringBuilder();
		try {

			String file = "C:\\Backup\\Nitesh\\Nitesh data\\Test_AutomationPractice\\GIT_Platform\\qa-platform-app\\test-output\\emailable-report.html";			 
			FileReader filer = new FileReader(file);

			BufferedReader in = new BufferedReader(filer);

			String str;
			while ((str = in.readLine()) != null) {
				contentBuilder.append(str);
			}
			in.close();
		} catch (IOException e) {
		}
		String content = contentBuilder.toString();
		return content;
	}
}