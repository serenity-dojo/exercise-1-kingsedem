package com.serenitydojo;

import org.junit.Test;

import java.io.FilterOutputStream;

public class WhenWorkingWithFloatingPointNumbers {
    @Test
// test to convert a number from celsius to fahrenheit
    public void convertCelsiusToFahrenheit(){

        double celsius = 50.0;
        double fahrenheit = 0.0;

        fahrenheit = (celsius * 1.8) + 32;  //formula conversion to
        System.out.println("Value of temperature in fahrenheit: " +  fahrenheit);
    }


    @Test
    //Convert kilograms to pounds
    public void convertKilogramsToPounds(){

        int kg = 20;
        double pounds = kg * 2.20462262;

        System.out.println("Kilogram to pounds: " + pounds);


    }
}
