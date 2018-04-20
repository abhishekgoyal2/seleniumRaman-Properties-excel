package testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testcase1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop =new Properties();
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/Java_properties_excel/object.properties");
		
		prop.load(file);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("id"));
		System.out.println(System.getProperty("user.dir"));

		
		
		
	}

}
