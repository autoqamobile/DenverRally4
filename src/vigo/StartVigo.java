package vigo;

import java.util.HashMap;
import java.util.Map;



public class StartVigo {

    public void generateVigoReports(String projectKey, String reportDirectory, String exit) {
        Map<String, String> settingsFileData = readJSonFile(projectKey, reportDirectory, exit);
        SendDataToServer sendData = new SendDataToServer();
        XmltoJson jsonFile = new XmltoJson();

        sendData.sendDataToServer(jsonFile.generateJsonFile(settingsFileData.get("reportDirectory"), settingsFileData.get("projectKey")));
    }

    protected Map<String, String> readJSonFile(String projectKey, String reportDirectory, String exit) {

        Map<String, String> UserData = new HashMap<>();

        try {
            UserData.put("projectKey", projectKey);
            UserData.put("reportDirectory", reportDirectory);
            UserData.put("exit", exit);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return UserData;
    }

}
