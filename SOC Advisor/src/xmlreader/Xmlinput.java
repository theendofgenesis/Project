package xmlreader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import application.Main;

public class Xmlinput {

	public static NodeList nodes;
	public static XPath xpath;
	public static Document doc;
	public static XPathExpression expr;


	//static String catstring = (Main.catChk.getText());
	//static int catalogYear = Integer.parseInt(Main.catChk.getText());

	public static void createReader() throws Exception {


		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true); // never forget this!
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("src\\xmlreader\\courseCatalog.xml");

        XPathFactory xpathfactory = XPathFactory.newInstance();
        XPath xpath = xpathfactory.newXPath();

        System.out.println("Get department and number from catalog year 2012");



        XPathExpression expr = xpath.compile("//core[@year=20122013]/course/title/text() | //core[@year=20122013]/course/title/text()");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        nodes = (NodeList) result;
        for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println(nodes.item(i).getNodeValue());

        	}


		}//end createReader


		public static void readFile() throws Exception {

			System.out.println(nodes.item(2).getNodeValue());

		}

		public static void classList() throws Exception {


			XPathFactory xpathfactory = XPathFactory.newInstance();
	        XPath xpath = xpathfactory.newXPath();



			expr= xpath.compile("//core[@year=20122013]/course/title/text()");
	        for (int i = 0; i < nodes.getLength(); i++) {
	            System.out.println("from classList: " + nodes.item(i).getNodeValue());

	        	}

		}



} //end class


