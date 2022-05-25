package com.learning.ControlledStatement.StarPrograms;

public class StarProgramSix {
    public static void main(String[] args)
    {
        for ( int i = 1; i <= 4 ; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
            for (int d = 1; d <= 4; d++) {
                for (int l = 0; l < d; l++) {
                    System.out.print(" ");
                }
                for (int m = 4; m > d ; m--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }




