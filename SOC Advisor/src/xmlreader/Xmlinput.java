package xmlreader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Xmlinput {

	public static NodeList nodes;

	public static void createReader() throws Exception {
	//public static void main(String[] args) throws Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true); // never forget this!
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("src\\xmlreader\\coursecatalog.xml");

        XPathFactory xpathfactory = XPathFactory.newInstance();
        XPath xpath = xpathfactory.newXPath();

        System.out.println("Get department and number from catalog year 2012");

        XPathExpression expr = xpath.compile("//catalog[@year=2012]/course/department/text() | //catalog[@year=2012]/course/number/text()");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        nodes = (NodeList) result;
        for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println(nodes.item(i).getNodeValue());

        	}


		}//end createReader


		public static void readFile() throws Exception {

			System.out.println(nodes.item(2).getNodeValue());

		}



} //end class


