package com.learning.others;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2015;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ){

            System.out.println ("it is a leap year ");

        }
        else {
            System.out.println ("it is not a leap year");
        }
    }
}
