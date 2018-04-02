package com.obj.psr.CustomDeserializer;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

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

		SimpleModule module =
		        new SimpleModule("CarDeserializer", new Version(3, 1, 8, null, null, null));
		module.addDeserializer(Cars.class, new CarsDeserializer(Cars.class));

		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(module);

//		mapper.configure(
//			    DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		try {

			URL url = new URL(
					"file:C:\\works\\Workspaces\\XMLJSONWorkspace\\ObjectParserTest\\target\\classes\\com\\obj\\psr\\CustomDeserializer\\car.json");

			Cars cars = mapper.readValue(url, Cars.class);
			
			System.out.println("car brand = " + cars.getCars()[0]);
			System.out.println("car brand = " + cars.getCars()[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
