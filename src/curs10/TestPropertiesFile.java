package curs10;

//CRUD operation:
//create
//read
//update
//delete

public class TestPropertiesFile {

	public static void main(String[] args) {
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		obj.writePropertiesFile();
		obj.readPropertiesFile("hostname");
		obj.updatePropertiesFile("hostname", "google cloud");
		obj.readPropertiesFile("hostname");
	}

}
