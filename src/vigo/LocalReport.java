package vigo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class LocalReport {

	public String generateLocalReportDirectory(String path) {

		File localReportDir = new File(path);
		String Parent = localReportDir.getParentFile().getAbsolutePath() + "/VigoReport";

		File ReportDir = new File(Parent);

		//System.out.println(ReportDir.exists());

		if (ReportDir.mkdir()) {
			//System.out.println("here");
		} else {
			//System.out.println("there");
		}

		return ReportDir.getAbsolutePath();
	}

	protected void generateLocalReport(String localReportDir, JSONObject obj) {

		//System.out.println("Generating local report");
		File indexFile = new File(localReportDir + "/index.js");

		if (!indexFile.exists()) {
			try {
				indexFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		FileWriter writer;
		try {
			writer = new FileWriter(indexFile);
			BufferedWriter br = new BufferedWriter(writer);

			br.write("(function () { vigo_testNG_json =  { jsondata :" + obj.toJSONString() + " }})()} ");

			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
