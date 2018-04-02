package com.obj.psr.ObjectParserTest7;

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

			String jsonArray = "[{\"brand\":\"ford\"}, {\"brand\":\"Fiat\"}]";

			Car[] cars = objectMapper.readValue(jsonArray, Car[].class);
			
			System.out.println("car brand = " + cars[0].getBrand());
			System.out.println("car doors = " + cars[0].getDoors());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
