package vigo;

import java.io.File;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class XmltoJson {

	protected JSONObject generateJsonFile(String path, String project) {

		SystemDetails systemDetails = new SystemDetails();
		Common common = new Common();
		File fXmlFile = new File(path + "/" + common.getTestResultFile());
		LocalReport report = new LocalReport();

		String localReportDir = report.generateLocalReportDirectory(path);

		JSONObject obj = null;

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();

			obj = new JSONObject();

			NodeList Summary = doc.getElementsByTagName("testng-results");
			Node overAllSummary = Summary.item(0);
			Element allSuiteSummary = (Element) overAllSummary;
			obj.put("projectKey", project);
			obj.put("skip", Integer.parseInt(allSuiteSummary.getAttribute("skipped")));
			obj.put("fail", Integer.parseInt(allSuiteSummary.getAttribute("failed")));
			obj.put("total", Integer.parseInt(allSuiteSummary.getAttribute("total")));
			obj.put("pass", Integer.parseInt(allSuiteSummary.getAttribute("passed")));
			obj.put("os", systemDetails.getSystemDetails());

			obj.put("sdk", systemDetails.getSDKDetails());

			NodeList suite = doc.getElementsByTagName("suite");

			JSONArray modules = new JSONArray();

			for (int i = 0; i < suite.getLength(); i++) {

				Node suiteDetailsNode = suite.item(i);

				Element suiteDetailsElement = (Element) suiteDetailsNode;

				JSONObject suiteObject = new JSONObject();

				suiteObject.put("name", suiteDetailsElement.getAttribute("name"));
				suiteObject.put("duration", Integer.parseInt(suiteDetailsElement.getAttribute("duration-ms")));
				suiteObject.put("start", suiteDetailsElement.getAttribute("started-at"));
				suiteObject.put("finish", suiteDetailsElement.getAttribute("finished-at"));

				JSONArray groupSmallArray = null;
				JSONArray groupArray = new JSONArray();
				JSONArray testArray = new JSONArray();
				JSONObject groupDetails = null;
				if (suiteDetailsNode.hasChildNodes()) {

					NodeList testlist = suiteDetailsNode.getChildNodes();

					for (int j = 0; j < testlist.getLength(); j++) {
						Node testNode = testlist.item(j);

						if (testNode.getNodeName().equals("groups")) {
							groupSmallArray = new JSONArray();

							NodeList grouplist = testNode.getChildNodes();

							for (int k = 0; k < grouplist.getLength(); k++) {
								groupDetails = new JSONObject();

								Node groupNode = grouplist.item(k);

								try {
									JSONArray methodArray = new JSONArray();

									if (groupNode.hasChildNodes()) {

										Element grpElement = (Element) groupNode;

										groupDetails.put("name", grpElement.getAttribute("name"));

										NodeList methodlist = groupNode.getChildNodes();

										for (int method = 0; method < methodlist.getLength(); method++) {
											Node methodnode = methodlist.item(method);

											// System.out.println("node name
											// method " +
											// methodnode.getNodeName());
											if (methodnode.getNodeName().equals("method")) {
												Element methodElement = (Element) methodnode;
												JSONObject methodDetailsObject = new JSONObject();

												methodDetailsObject.put("name", methodElement.getAttribute("name"));

												methodDetailsObject.put("class", methodElement.getAttribute("class"));

												methodArray.add(methodDetailsObject);
											}

										}

										groupDetails.put("methods", methodArray);
										groupSmallArray.add(groupDetails);
									}

								} catch (Exception e) {
									e.printStackTrace();
								}

							}

						}

						if (testNode.getNodeType() == Node.ELEMENT_NODE && testNode.getNodeName().equals("test")) {
							Element testElement = (Element) testNode;

							JSONObject testJsonObject = new JSONObject();

							testJsonObject.put("name", testElement.getAttribute("name"));
							testJsonObject.put("duration", Integer.parseInt(testElement.getAttribute("duration-ms")));
							testJsonObject.put("start", testElement.getAttribute("started-at"));
							testJsonObject.put("finish", testElement.getAttribute("finished-at"));

							JSONArray methodJSONArray = new JSONArray();

							if (testNode.hasChildNodes()) {

								NodeList classNodeList = testNode.getChildNodes();

								for (int k = 0; k < classNodeList.getLength(); k++) {
									Node classNode = classNodeList.item(k);

									if (classNode.hasChildNodes()) {

										NodeList methodNodeList = classNode.getChildNodes();

										for (int l = 0; l < methodNodeList.getLength(); l++) {
											Node methodNode = methodNodeList.item(l);

											if (methodNode.getNodeType() == Node.ELEMENT_NODE
													&& methodNode.getNodeName().equals("test-method")) {

												Element methodElement = (Element) methodNode;
												JSONArray logstepArry = new JSONArray();

												if (methodElement.getAttribute("is-config").equals("true")) {

												} else {

													JSONObject methodJsonObject = new JSONObject();

													if (methodElement.getAttribute("status").equals("PASS")) {
														methodJsonObject.put("status", Integer.parseInt("1"));
													}

													if (methodElement.getAttribute("status").equals("FAIL")) {
														methodJsonObject.put("status", Integer.parseInt("2"));
													}

													if (methodElement.getAttribute("status").equals("SKIP")) {
														methodJsonObject.put("status", Integer.parseInt("3"));
													}

													methodJsonObject.put("name", methodElement.getAttribute("name"));
													methodJsonObject.put("duration", Integer
															.parseInt(methodElement.getAttribute("duration-ms")));
													methodJsonObject.put("start",
															methodElement.getAttribute("started-at"));
													methodJsonObject.put("finish",
															methodElement.getAttribute("finished-at"));

													// JSONArray
													// exceptionJsonArray = new
													// JSONArray();

													JSONObject exceptionJsonObject = new JSONObject();

													if (methodNode.hasChildNodes()) {
														NodeList childMethodNodeList = methodNode.getChildNodes();

														for (int v = 0; v < childMethodNodeList.getLength(); v++) {
															Node childMethodNode = childMethodNodeList.item(v);

															if (childMethodNode.getNodeName().equals("exception")) {

																if (childMethodNode.hasChildNodes()) {
																	NodeList exceptionNodeList = childMethodNode
																			.getChildNodes();

																	for (int exc = 0; exc < exceptionNodeList
																			.getLength(); exc++) {

																		Node exceptionNode = exceptionNodeList
																				.item(exc);

																		if (exceptionNode.getNodeName()
																				.equals("message"))

																		{
																			exceptionJsonObject.put("message",
																					exceptionNode.getTextContent());

																		}
																		if (exceptionNode.getNodeName()
																				.equals("full-stacktrace"))

																		{
																			exceptionJsonObject.put("stacktrace",
																					exceptionNode.getTextContent());

																		}

																	}

																}

															}

															if (childMethodNode.getNodeName()
																	.equals("reporter-output")) {

																if (childMethodNode.hasChildNodes()) {

																	NodeList lognodelist = childMethodNode
																			.getChildNodes();

																	for (int line = 0; line < lognodelist
																			.getLength(); line++) {
																		Node lognode = lognodelist.item(line);

																		if (lognode.getNodeName().equals("line"))

																		{

																			logstepArry.add(lognode.getTextContent());
																		}

																	}

																}

															}

														}

													}

													// exceptionJsonArray.add(exceptionJsonObject);

													methodJsonObject.put("exception", exceptionJsonObject);

													methodJsonObject.put("steps", logstepArry);
													methodJSONArray.add(methodJsonObject);
												}

											}

										}

									}

								}
								testJsonObject.put("methods", methodJSONArray);
							}

							testArray.add(testJsonObject);

						}

					}

				}
				suiteObject.put("groups", groupSmallArray);

				suiteObject.put("tests", testArray);
				modules.add(suiteObject);

			}

			obj.put("modules", modules);

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//log.printLog("VigoBot trying to connect with Vigoworld");

		//System.out.println(obj.toJSONString());

		report.generateLocalReport(localReportDir, obj);

		return obj;
	}

	/*public void printLog(String msg) {
		System.out.println("[" + getCurrentTime() + "] : " + msg);
	}

	protected static String getCurrentTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();

		return dateFormat.format(cal.getTime());
	}*/

}
