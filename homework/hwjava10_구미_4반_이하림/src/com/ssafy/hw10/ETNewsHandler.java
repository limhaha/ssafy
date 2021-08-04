package com.ssafy.hw10;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ETNewsHandler extends DefaultHandler {
	
	private String data;
	private Item item ;
	private int depth = 0;
	private Image image;
	private ArrayList<Item> list = null;
	public ETNewsHandler() {
		list = new ArrayList<Item>();
	}
	public ArrayList<Item> getList(){
		
		return list;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		switch(qName) {
		case "item" :
			item = new Item();
			depth++;
			break;
		case "image" :
			image = new Image();
//			depth++;
			break;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		switch(qName) {
		case "item":
			list.add(item);
			item = null;
			depth--;
			break;
		case "title" :
			switch(depth) {
			case  0:
//				채널의 타이틀에 추가
				break;
			case 1 :
				if(image != null) {
					image.title = data;
				}else {
					item.setTitle(data);
				}
			}
			break;
		case "image" :
			//작업 완료 하고
			image = null;
			break;
		case "author" :
			item.setAuthor(data);
			break;
		case "guid" :
			item.setGuid(data);
			break;
		case "comments" :
			item.setComments(data);
			break;
		case "pubDate" :
			switch(depth) {
			case  0:
//				채널의 타이틀에 추가
				break;
			case 1 :
				if(image != null) {
					image.title = data;
				}else {
					item.setPubDate(data);
				}
			}
			break;
		case "link" :
			switch(depth) {
			case  0:
//				채널의 타이틀에 추가
				break;
			case 1 :
				if(image != null) {
					image.title = data;
				}else {
					item.setLink(data);
				}
			}
			break;
		case "description" :
			switch(depth) {
			case  0:
//				채널의 타이틀에 추가
				break;
			case 1 :
				if(image != null) {
					image.title = data;
				}else {
					item.setDescription(data);
				}
			}
			break;
		}
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		data = new String(ch, start, length).trim();
	}
	


}

			