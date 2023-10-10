package curs10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	// Write properties
	public void writePropertiesFile() {
	
		try {
			OutputStream output = new FileOutputStream("test.properties");
			Properties propFile = new Properties();
			propFile.setProperty("hostname", "amazon aws");
			propFile.setProperty("user", "testuser");
			propFile.setProperty("email", "testuser@gmail.com");
			propFile.store(output, "am salvat fisierul!");
			output.close();

			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}

	
	//read properties file
	
	public void readPropertiesFile(String key) {
		
		try (FileInputStream input = new FileInputStream("test.properties")){
			Properties propFile = new Properties();
			propFile.load(input);
			
			System.out.println(propFile.getProperty(key));
		
				
	}catch (IOException e){
			
			
			e.printStackTrace();
		
		
	}
	}
	
		
		//UPDATE properties file
		public void updatePropertiesFile(String key, String value) {
			
			try (FileInputStream input = new FileInputStream("test.properties")){
				Properties propFile = new Properties();
				propFile.load(input);
				
									
		}catch (IOException e){
				
				
				e.printStackTrace();
		
			
		}
			try {
				OutputStream output = new FileOutputStream("test.properties");
				Properties propFile = new Properties();
				propFile.setProperty(key, value);
				
				propFile.store(output, null);
				output.close();

				
				
			}catch (IOException e) {
			
				e.printStackTrace();
			}
			
		
		
	
	}
	
	
	
	
}
