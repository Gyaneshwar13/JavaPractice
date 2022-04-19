package com.learning.sorting;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] a = {8, 12, 18, 9, 6, 3, 14, 16};
        int temp = 0;
        boolean swapHappened= false;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapHappened = true;
                }
            }

            if (!swapHappened) {
                break;
            }
            swapHappened = false;
        }


            for ( int i = 0 ; i<a.length;i++){
                System.out.println(a[i]+" ");
            }
           System.out.println();
        }
    }


