package com.obj.psr.ObjectParserTest5;

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
			InputStream input = new FileInputStream("C:\\\\\\\\works\\\\\\\\Workspaces\\\\\\\\XMLJSONWorkspace\\\\\\\\ObjectParserTest\\\\\\\\target\\\\\\\\classes\\\\\\\\com\\\\\\\\obj\\\\\\\\psr\\\\\\\\ObjectParserTest5\\\\\\\\car.json");

			Car car = objectMapper.readValue(input, Car.class);
			System.out.println("car brand = " + car.getBrand());
			System.out.println("car doors = " + car.getDoors());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
