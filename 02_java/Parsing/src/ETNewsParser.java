
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ETNewsParser {
	public static ArrayList<Item> getETNews(InputStream data) {
		ArrayList<Item> list = null;
		//		디자인 패턴 Singtone 디자인, Iterator 디자인 패턴, Factory 디자인 패턴, MVC, MVVM 디자인
		SAXParserFactory factory = SAXParserFactory.newInstance();
		ETNewsHandler handler = new ETNewsHandler();
		try {
			SAXParser parser = factory.newSAXParser();
			parser.parse(data, handler);
			list = handler.getList();
			System.out.println("parser sessus");
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	public static ArrayList<Item> getETNews(String data) {
		ArrayList<Item> list = null;
		//		디자인 패턴 Singtone 디자인, Iterator 디자인 패턴, Factory 디자인 패턴, MVC, MVVM 디자인
		SAXParserFactory factory = SAXParserFactory.newInstance();
		ETNewsHandler handler = new ETNewsHandler();
		InputSource is = new InputSource(new StringReader(data));
		try {
			SAXParser parser = factory.newSAXParser();
			parser.parse(is, handler);
			list = handler.getList();
			System.out.println("parser sessus");
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
}
