package vigo;

public class Common {

	String authUrl = "";
	String dataUrlTestNG = "";
	String dataUrlCucumber = "";

	String server = getServerURl("vigo");
	String configFileName = "";

	String testResultFile = "";

	public Common() {

		testResultFile = "testng-results.xml";
		authUrl = server + "/api/v1/project/key/auth";
		dataUrlTestNG = server + "/api/v1/build/sync/testng";
		dataUrlCucumber = server + "/api/v1/build/sync/cucumber";
		configFileName = "vigo.config.json";

	}

	public void pause() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	

	public String getTestResultFile() {
		return testResultFile;
	}

	public void setTestResultFile(String testResultFile) {
		this.testResultFile = testResultFile;
	}

	public String getServerURl(String server) {
		String serverURl = "";

		switch (server) {
		case "local":
			serverURl = "http://192.168.0.101:3000";
			break;
		case "vigo":
			serverURl = "https://vigoreport.io";
			break;

		}
		return serverURl;
	}

	public String getConfigFileName() {
		return configFileName;
	}

	public String getAuthUrl() {
		return authUrl;
	}

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}

	public String getDataUrlTestNG() {
		return dataUrlTestNG;
	}

	public void setDataUrlTestNG(String dataUrlTestNG) {
		this.dataUrlTestNG = dataUrlTestNG;
	}

	public String getDataUrlCucumber() {
		return dataUrlCucumber;
	}

	public void setDataUrlCucumber(String dataUrlCucumber) {
		this.dataUrlCucumber = dataUrlCucumber;
	}

}
