package vigo;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SendDataToServer {

	protected void sendDataToServer(JSONObject obj) {
		Common common = new Common();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		HttpPost request = new HttpPost(common.getDataUrlTestNG());
		StringEntity entity = null;
		try {
			entity = new StringEntity(obj.toString());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		entity.setContentType("application/json;charset=UTF-8");
		entity.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "application/json;charset=UTF-8"));
		request.setHeader("Accept", "application/json");
		request.setEntity(entity);

		HttpResponse response = null;

		HttpClient client = HttpClientBuilder.create().build();

		try {
			response = client.execute(request);

			String responseString = new BasicResponseHandler().handleResponse(response);

			JSONParser responseJson = new JSONParser();

			Object res = null;
			try {
				res = responseJson.parse(responseString);

			} catch (ParseException e) {
				e.printStackTrace();
			}
			JSONObject a = (JSONObject) res;

			if (a.get("flag").toString().equals("true")) {

				JSONObject build = (JSONObject) a.get("data");

				printLog("Build-" + build.get("sequence") + " reached successfully On VigoWorld.");

				printLog("You can view this build on - " + common.getServerURl("vigo") + "/app/builds/"
						+ build.get("id"));

				//log.printLog("---------------------------------------------------");

				printLog("Your Report is Generated.");

				//log.printLog("---------------------------------------------------");

			} else {

				printLog(a.get("message").toString());

			}

		} catch (Exception se) {

			se.printStackTrace();

		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void printLog(String msg) {
		System.out.println("[" + getCurrentTime() + "] : " + msg);
	}

	protected static String getCurrentTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();

		return dateFormat.format(cal.getTime());
	}

}
