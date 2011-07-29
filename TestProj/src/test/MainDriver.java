package test;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import test.dataClasses.BaseDataSet;
import test.dataClasses.Wrapper;

public class MainDriver {
	public static void main(String[] args) {
		JSonReader reader = new JSonReader();
		
		reader.setUrl("http://claybook.net:8080/energy-information-repository/service/getBaseData");
		reader.connect();
		String jsonData = reader.readData();
		
		ObjectMapper mapper = new ObjectMapper();
//		mapper.configure(Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		try {
			Wrapper wrapper = mapper.readValue(jsonData, Wrapper.class);
			wrapper.print();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(jsonData);
	}
}
