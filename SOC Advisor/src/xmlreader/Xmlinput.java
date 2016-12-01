/**
* @author Ken Hyatt, Genesis Stroud, David Rose, David McCarter
* @version 4
*/

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



	static int catalogYear = Integer.parseInt(Main.catChk.getText());

	/**
	* This method is responsible for creating the DocumentBuilder factory, loading "courseCatalog"
	* into memory and setting the correct catalog year based on user input. This method Must be called AT LEAST
	*  ONCE before reading or making changes to the internal Nose List of courses.
	*  @throws Exception NullPointerException if unable to read from the coursecatalog (Possibly due to being unable to find a matching xml attribute)
	*/
	public static void createReader() throws Exception {



		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true); // never forget this!
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("src\\xmlreader\\courseCatalog.xml");

        XPathFactory xpathfactory = XPathFactory.newInstance();
        XPath xpath = xpathfactory.newXPath();


        XPathExpression expr = xpath.compile("//core[@year=" + catalogYear + "]/course/title/text() | //core[@year="+ catalogYear +"]/course/title/text()");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        nodes = (NodeList) result;
        for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println(nodes.item(i).getNodeValue());

        	}


		}//end createReader



		/**
		* Outputs a List of titles of the courses in the NodeList
		* @throws Exception NullPointerException if unable to read from the coursecatalog (Possibly due to being unable to find a matching xml attribute)
		*/
		public static void classList() throws Exception {


			XPathFactory xpathfactory = XPathFactory.newInstance();
	        XPath xpath = xpathfactory.newXPath();



			expr= xpath.compile("//core[@year="+catalogYear+"]/course/title/text()");
	        for (int i = 0; i < nodes.getLength(); i++) {
	            System.out.println("from classList: " + nodes.item(i).getNodeValue());

	        	}

		}



} //end class


