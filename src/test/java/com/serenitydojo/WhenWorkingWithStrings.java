package com.serenitydojo;


import org.junit.Test;

public class WhenWorkingWithStrings {

    //Exercise 1 - Converting to lower case
    @Test
    public void ConvertingToLowerCase(){
        String myFirstName = "KINGSLEY";
        System.out.println(myFirstName.toLowerCase());
    }

    //Exercise 2 - Converting to upper case

    @Test
    public void ConvertingToUpperCase(){

        String myFavoriteColor = "Green";
        System.out.println(myFavoriteColor.toUpperCase());
    }

    // Exercise 3 - Trim extra space
    @Test
    public void TrimExtraSpace(){
        String myCountry = " Nigeria  ";
        System.out.println(myCountry.trim());
    }
    // Exercise 4 - Finding the length of a string
    @Test
    public void LengthOfAString(){
        String myLastname = "James";
        System.out.println(myLastname.length());
    }

    //Exercise 5 - Replacing text in a string
    @Test
    public void ReplacingTextInAString(){
        String myHomeStreet= "Andrew-Street";
        String changeOfStreet = myHomeStreet.replace("Andrew", "Broad");
        System.out.println(changeOfStreet);
    }
}
