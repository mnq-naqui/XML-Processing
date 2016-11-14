package com.lara;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class BookParser {
	
	private static final String XML_PATH="F:\\Workspaces\\XML-Processing\\LaraXML\\resources\\books.xml";
	public static void main(String[] args) {
		
		SAXParserFactory spf=SAXParserFactory.newInstance();
		
		try {
			SAXParser sp=spf.newSAXParser();
			sp.parse(new File(XML_PATH), new BookHandler());
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
