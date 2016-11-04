package xmlreader;

import java.io.FileInputStream;


import javax.xml.stream.*;
import javax.xml.stream.events.*;

public class Xmlinput {

	public static void main(String[] args) {
		try {
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();

			XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new FileInputStream("src\\xmlreader\\coursecatalog.xml"));

			while(xmlStreamReader.hasNext()) {
				int eventType = xmlStreamReader.getEventType();

				switch(eventType) {
					case XMLEvent.START_DOCUMENT: System.out.println("Start document");

					break;

					case XMLEvent.START_ELEMENT:
						System.out.println("Start Element: " + xmlStreamReader.getName());

						if (xmlStreamReader.getAttributeCount() > 0) {
							System.out.println("\tAttributes: " + xmlStreamReader.getAttributeCount());
						}

						for (int i = 0; i < xmlStreamReader.getAttributeCount(); i++) {
							System.out.println("\t" + xmlStreamReader.getAttributeName(i) + ": " + xmlStreamReader.getAttributeValue(i));
						}


					break;

					case XMLEvent.END_ELEMENT: System.out.println("End Element: " + xmlStreamReader.getName());

					break;

					case XMLEvent.CHARACTERS:
					String content = xmlStreamReader.getText().trim();
					if(!content.isEmpty()) {
						System.out.println("Characters: " + content);

							if (content.equalsIgnoreCase("CSC")) {

								System.out.println("COURSE FOUND!!!!");
								// add to list
						}

					}


					break;


				}//end switch

				xmlStreamReader.next();
			} //end while

			if (xmlStreamReader.getEventType() == XMLEvent.END_DOCUMENT) {
					System.out.println("End Document");
			}
			xmlStreamReader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
