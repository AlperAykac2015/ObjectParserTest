package com.obj.psr.ObjectParserTest6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

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

			String carJson =
			        "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

			byte[] bytes = carJson.getBytes("UTF-8");

			Car car = objectMapper.readValue(bytes, Car.class);
			
			System.out.println("car brand = " + car.getBrand());
			System.out.println("car doors = " + car.getDoors());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
