package com.obj.psr.ObjectParserTest10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.obj.psr.ObjectParserTest4.Car;

/**
 * Hello world!
 *
 */
/**
 * @author alper
 *
 */
public class App {
	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(
			    DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		try {

			URL url = new URL(
					"file:C:\\\\works\\\\Workspaces\\\\XMLJSONWorkspace\\\\ObjectParserTest\\\\target\\\\classes\\\\com\\\\obj\\\\psr\\\\ObjectParserTest9\\\\car.json");

			Cars cars = objectMapper.readValue(url, Cars.class);
			
			
			System.out.println("car brand = " + cars.getCars().get(0).getBrand());
			System.out.println("car brand = " + cars.getCars().get(0).getDoors());
			System.out.println("car brand = " + cars.getCars().get(0).getInsurances()[0]);	
			System.out.println("car brand = " + cars.getCars().get(0).getInsurances()[1]);	
			System.out.println("car brand = " + cars.getCars().get(0).getInsurances()[2]);	
			System.out.println("car brand = " + cars.getCars().get(2).getBrand());
			System.out.println("car doors = " + cars.getCars().get(2).getDoors());
			System.out.println("car doors = " + cars.getRecordNo());
			System.out.println("car doors = " + cars.getRecordType());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
