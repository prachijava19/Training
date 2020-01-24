package com.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

	
	
	static void read()
	{
		FileReader reader = null;
		try {
			reader = new FileReader(new File("C:\\Users\\talwa\\Documents\\GitHub\\Training\\ClassPrograms\\src\\com\\training\\app.properties"));
			Properties prop = new Properties();
			prop.load(reader);
			
			System.out.println(prop.get("server"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Configuration.read();
		
	}
}
