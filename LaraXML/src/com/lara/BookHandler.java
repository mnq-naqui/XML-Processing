package com.lara;

import javax.xml.namespace.QName;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookHandler extends DefaultHandler {

	private Book book = null;
	private String content = null;

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		content = new String(ch, start, length);
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if (qName.equals("book")) {
			
			System.out.println(book);

		}
		else if (qName.equals("title")) {
			book.setTitle(content);
			
		}
		else if (qName.equals("author")) {
			book.setAuthor(content);
			
		}
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if (qName.endsWith("book")) {
			book = new Book();
			String id = attributes.getValue("id");
			book.setId(Integer.parseInt(id));
		}
	}

}
