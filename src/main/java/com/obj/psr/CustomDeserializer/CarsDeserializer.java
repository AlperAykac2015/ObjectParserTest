package com.obj.psr.CustomDeserializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class CarsDeserializer extends JsonDeserializer<Cars> {

    public CarsDeserializer(Class<?> vc) {
        super();
    }

    @Override
    public Cars deserialize(JsonParser parser, DeserializationContext deserializer) throws IOException {
        Cars cars = new Cars();
        Car[] car = new Car[10];
        cars.setCars(car);
        int t = 0;
        while(!parser.isClosed()){
            JsonToken jsonToken = parser.nextToken();

            if(JsonToken.FIELD_NAME.equals(jsonToken)){
                String fieldName = parser.getCurrentName();
                System.out.println("fieldName: "+fieldName);

                jsonToken = parser.nextToken();

                if("brand".equals(fieldName)){
                	cars.getCars()[t] = new Car();
                    cars.getCars()[t].setBrand(parser.getValueAsString());
                } else if ("doors".equals(fieldName)){
                    cars.getCars()[t].setDoors(parser.getValueAsInt());
                    t++;
                } 
            }
        }
        parser.close();
        return cars;
    }
}