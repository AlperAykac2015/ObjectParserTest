package com.obj.psr.ObjectParserTest2;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ObjectMapper objectMapper = new ObjectMapper();

    	try {
    		String carJson =
    		        "{ \"brand\" : \"Mercedes\", \"doors\" : 4 }";
    		Reader reader = new StringReader(carJson);

    		Car car = objectMapper.readValue(reader, Car.class);
    	    System.out.println("car brand = " + car.getBrand());
    	    System.out.println("car doors = " + car.getDoors());
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}    	
    }
}
