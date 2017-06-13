package vigo;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Map;

import org.json.simple.JSONObject;

public class SystemDetails {

	public JSONObject getSystemDetails() {

		JSONObject systemDetails = new JSONObject();
		RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();

		long memorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean())
				.getTotalPhysicalMemorySize();

		Map<String, String> systemProperties = runtimeBean.getSystemProperties();

		systemDetails.put("name", systemProperties.get("os.name"));
		systemDetails.put("ram", Math.round(((memorySize / 1024.0) / 1024.0) / 1024.0) + "GB");
		systemDetails.put("arc", systemProperties.get("sun.arch.data.model") + " bit");
		systemDetails.put("version", systemProperties.get("os.version"));
		systemDetails.put("hostname ", systemProperties.get("user.name"));
		//System.out.println(systemDetails);

		return systemDetails;

	}
	
	
	public JSONObject getSDKDetails() {
		JSONObject sdkDetails = new JSONObject();
		RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();

		Map<String, String> systemProperties = runtimeBean.getSystemProperties();

		sdkDetails.put("name", "Java");

		sdkDetails.put("arc", systemProperties.get("sun.arch.data.model") + " bit");

		sdkDetails.put("version", systemProperties.get("java.version"));

		//System.out.println(sdkDetails);
		return sdkDetails;
	}

	
}
