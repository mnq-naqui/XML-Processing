package com.lara;
// This program is incomplete
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;


public class XMLCreatorExample {
	public static void main(String[] args) {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		Document dom = null;

		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			dom = db.newDocument();

		} catch (ParserConfigurationException e) {

			System.out
					.println("Error while trying to instantiate Document Builder"
							+ e);
			System.exit(0);
		}

		Element rootEle = dom.createElement("books");
		dom.appendChild(rootEle);

		Element p1 = dom.createElement("book");
		p1.setAttribute("author", "ramu");
		Element age = dom.createElement("price");
		Text ageText = dom.createTextNode("22");
		age.appendChild(ageText);
		p1.appendChild(age);
		rootEle.appendChild(p1);
		
		Element p2 = dom.createElement("book");
		p1.setAttribute("author", "vijay");
		Element age1 = dom.createElement("price");
		Text ageText1 = dom.createTextNode("25");
		age.appendChild(ageText1);
		p1.appendChild(age1);
		rootEle.appendChild(p2);
		
		try {
		
					
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
