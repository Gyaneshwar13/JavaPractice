package com.learning.array;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[][][] a = {{{1, 2, 3, 4, 5,  6}, {9, 8, 7, 6, 5, 4}, {2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6,}, {1, 2, 3, 4, 5, 6}}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {

                    System.out.print(a[i][j][k]);
                }
                System.out.println();

            }
        }
    }
}


