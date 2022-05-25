package com.learning.others;

public class SwapingNumbers {
    public static void main(String[] args) {

        case1 (10,20);
        case2 (10,30);

    }
    public static void case1 (int a , int b ){

        int t = 0 ;

        t = a ;
        a = b ;
        b = t ;

        System.out.println ("value of a " + a );
        System.out.println ("value of b " + b );

    }
    public static void case2 (int a , int b ){

        a = a+b ;
        b = a-b ;
        a = a-b ;
        System.out.println ("value of a " + a );
        System.out.println ("value of b " + b );



    }
}
