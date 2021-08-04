

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ETNewsTest {
	String etNewsURL = "http://rss.etnews.com/Section902.xml";

	public ETNewsTest() {
		String res = getData();
//		System.out.println(res);
		
//		ArrayList<Item> list = ETNewsParser.getETNews(res);
		ArrayList<Item> list = ETNewsParser.getETNews(getDataInputStram());
		System.out.println(list.size());
		for(Item item : list) {
			System.out.println(item);
		}
	}
	private InputStream getDataInputStram() {
		URL url = null;
		InputStream is = null;
		try {
			url = new URL(etNewsURL);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			int code = conn.getResponseCode();
			if(code == 200) {
				System.out.println("success");
				is = conn.getInputStream();
			}else {
				System.out.println(code + "접속 에러");
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return is;
	}
	private String getData() {
		String result = "";
		URL url = null;
		BufferedReader br = null;
		try {
			url = new URL(etNewsURL);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			int code = conn.getResponseCode();
			if(code == 200) {
				System.out.println("success");
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String line = "";
				StringBuilder sb = new StringBuilder();
				while((line = br.readLine()) != null) {
					sb.append(line).append("\n");
				}
//				System.out.println(sb.toString());
				result = sb.toString();
			}else {
				System.out.println(code + "접속 에러");
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				}catch(IOException e) {}
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		new ETNewsTest();

	}

}
