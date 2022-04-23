package com.learning.numbers;

import java.util.ArrayList;
public class FindingCommonElement {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        int [] b = {1,3,6,7,8,9};
        int [] c = {1,2,3,6,4,5};
        int x=0;
        int y = 0;
        int z =0;
        ArrayList al = new ArrayList();
        while ( x < a.length && y < b.length  && z < c.length){
            if ( a[x] == b[y] && b[y] ==c[z]){

                 al.add(a[x]);
                 x++;
                 y++;
                 z++;
            }

            else if ( a[x] < b[y]){
                x++;
            }
            else if ( b[y]< c[z] ){
                y++;
            }
            else {
                z++;
            }



        }
        System.out.print(al);



    }
}
