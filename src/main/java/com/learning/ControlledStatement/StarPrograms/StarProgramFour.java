package com.learning.ControlledStatement.StarPrograms;

public class StarProgramFour {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int l =1 ; l <= i; l++) {

                System.out.print("*");
            }

            System.out.println();


        }
    }
}

