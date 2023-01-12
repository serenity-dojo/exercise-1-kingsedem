package com.serenitydojo;


import org.junit.Test;


public class WhenWorkingWithWholeNumbers {

    @Test
    public void addNumbersTogether(){
        int initialYear =  1985;
        int targetYear  = 0;

        int timeJump = 30;
        targetYear =  initialYear + timeJump;

        System.out.println(targetYear);
        //assertThat(targetYear, equalTo(2015));
    }

}
