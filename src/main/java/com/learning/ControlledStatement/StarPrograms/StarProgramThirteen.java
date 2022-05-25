package com.learning.ControlledStatement.StarPrograms;

public class StarProgramThirteen {
    public static void main(String[] args) {
        for (int i = 1 ; i <=5 ;i++) {
            for (int l = 5; l > i; l--) {
                System.out.print(" ");
            }

            for (int k = 1; k < (i * 2); k++) {
                if (k > 1 && k < (i * 2) - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
        }
        }



