package com.learning.others;

public class TableFactorial {
    public static void main(String[] args) {

        case1 (9);
        case2 (5 ,1);

    }
    public static void case1 (int a ){

        int table ;

        for (int i = 1 ; i <= 10 ; i++){

            table = a * i ;
            System.out.println( a + " * " + i +"=" + table );
        }

    }

    public static void case2 (int b  ,int fact){



        for( int i = 1 ; i <= b ; i++ ){

            fact = fact  * i;
        }
        System.out.println("factorial = " + fact);

    }
}
