package HackerRank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOddString {

        public static void main(String[] args) {
            Scanner sr = new Scanner (System.in);
           EvenOddString obj = new EvenOddString();
            System.out.println("enter the number to define number of input");
            int t = sr.nextInt();
            for(int i= 0; i<t ; i++){
                System.out.println("enter a string ");
                String s= sr.next();
                traverse(s);
            }

        }

        public static void traverse(String x) {
            int length = x.length();
            char evenChar [] = new char[length] ;
            char oddChar  [] = new char[length] ;
            for (int i=0; i<length; i++){
                if (i % 2 == 0){
                    char ch = x.charAt(i);
                    evenChar[i] = ch;
                    oddChar[i] = '*';
                } else{
                    char ch = x.charAt(i);
                    oddChar[i] = ch;
                    evenChar[i] = '*';
                }
            }
            for (int i = 0; i<evenChar.length; i++ ){

                if (evenChar[i] != '*'){

                    System.out.print(evenChar[i]);
                }

            }
            System.out.print(" ");
            for (int j=0; j<oddChar.length; j++){

                if (oddChar[j] != '*'){

                    System.out.print(oddChar[j]);
                }

            }
            System.out.println();

        }


}



