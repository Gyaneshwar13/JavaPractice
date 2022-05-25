package com.learning.ControlledStatement.StarPrograms;

public class StarProgramNine {
    public static void main(String[] args) {
        for (int i = 1 ; i <=4 ;i++){
            for (int l = 2 ; l<=i ; l++) {
                System.out.print(" ");
            }

        for (int k = 4; k >= i; k--) {
            System.out.print("*");
        }
        for (int l = 3; l>=i; l--){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
