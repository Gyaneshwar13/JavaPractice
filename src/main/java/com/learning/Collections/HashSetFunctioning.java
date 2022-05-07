package com.learning.Collections;

import java.util.HashSet;
public class HashSetFunctioning {

    public static void main(String[] args) {
        int [] a = {1,3,5,6,7,8,7};
        int [] b = {1,2,3,4,5,6,7};
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        for ( int no:a){
            hs.add(no);

                }
        for (int no:b){
           hs1.add(no);
        }
        for (int no:hs1){
           boolean y =  hs.add(no);

        if ( y == false ){
            System.out.print(no + " ");
        }

            }
        }

    }

