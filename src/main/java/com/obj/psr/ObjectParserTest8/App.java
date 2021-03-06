package com.obj.psr.ObjectParserTest8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

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

		try {

			URL url = new URL(
					"file:C:\\\\works\\\\Workspaces\\\\XMLJSONWorkspace\\\\ObjectParserTest\\\\target\\\\classes\\\\com\\\\obj\\\\psr\\\\ObjectParserTest8\\\\car.json");

			Cars cars = objectMapper.readValue(url, Cars.class);
			
			
			System.out.println("car brand = " + cars.getCars()[0].getBrand());
			System.out.println("car brand = " + cars.getCars()[0].getDoors());
			System.out.println("car brand = " + cars.getCars()[2].getBrand());
			System.out.println("car doors = " + cars.getCars()[2].getDoors());
			System.out.println("car doors = " + cars.getRecordNo());
			System.out.println("car doors = " + cars.getRecordType());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
