package com.learning.others;

public class GreaterThanNumber {
    public static void main(String[] args) {

        case1(12,45);
        case2(10,54,72);
    }
        public  static void case1 (int a , int  b ){

            if (a > b) {
                System.out.println("a is a greater number " + a);

            } else {
                System.out.println("b is a greater number " + b);
            }



        }
        public static void case2(int a , int b , int c ){

           if (a > b && a > c ){

            System.out.println ("a is the greater number " + a);
        }
           else if ( b > a && b > c ){

         System.out.println ("b is the greater number " + b);

        }
           else {

         System.out.println ("c is the greater number " + c);
        }
    }
}






