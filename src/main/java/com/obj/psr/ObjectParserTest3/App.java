package com.obj.psr.ObjectParserTest3;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
/**
 * @author alper aykac
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ObjectMapper objectMapper = new ObjectMapper();

    	try {
    		File file = new File("C:\\works\\Workspaces\\XMLJSONWorkspace\\ObjectParserTest\\target\\classes\\com\\obj\\psr\\ObjectParserTest3\\car.json");

    		Car car = objectMapper.readValue(file, Car.class);

    	    System.out.println("car brand = " + car.getBrand());
    	    System.out.println("car doors = " + car.getDoors());
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}    	
    }
}
