package com.learning.array;

public class FindingNonDulplicateElement {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 2, 4, 5};
        int b = a[0];
        for (int i = 1; i < a.length; i++) {
            b = b ^ a[i];
        }

    System.out.print(b+" ");


    }
    }



