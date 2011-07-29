package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class JSonReader {
	
	private URLConnection connection;
	private URL data;
	
	private String currentJsonData;
	private String url;
	
	public String getCurrentJsonData() {
		return currentJsonData;
	}

	public void setCurrentJsonData(String currentJsonData) {
		this.currentJsonData = currentJsonData;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public void connect() {
		try {
			data = new URL(url);
			connection = data.openConnection();
		} catch (MalformedURLException e) {
			System.out.println("Invalid URL");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not initialize data connection");
			e.printStackTrace();
		}
	}
	
	public String readData() {
		String dataStream = new String();
		String currentLine = new String();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			while( (currentLine = in.readLine()) != null ) {
				dataStream += currentLine;
			}
		} catch (IOException e) {
			System.out.println("Could not initialize InputStream");
			e.printStackTrace();
		}
		
		currentJsonData = dataStream;
		return currentJsonData;
	}
}
