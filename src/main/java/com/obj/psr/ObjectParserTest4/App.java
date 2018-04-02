package com.obj.psr.ObjectParserTest4;

import java.io.IOException;
import java.net.URL;

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
			URL url = new URL(
					"file:C:\\\\works\\\\Workspaces\\\\XMLJSONWorkspace\\\\ObjectParserTest\\\\target\\\\classes\\\\com\\\\obj\\\\psr\\\\ObjectParserTest4\\\\car.json");
			Car car = objectMapper.readValue(url, Car.class);

			System.out.println("car brand = " + car.getBrand());
			System.out.println("car doors = " + car.getDoors());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
