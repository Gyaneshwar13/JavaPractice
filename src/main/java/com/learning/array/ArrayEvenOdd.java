import java.util.ArrayList;
public class ArrayEvenOdd {
    public static void main(String[] args) {
        int [] a = {2,5,4,1,6,7,8,9,10};
        ArrayList al1 = new ArrayList();
        ArrayList al2 = new ArrayList();
        for ( int i = 0; i<a.length; i++) {
            if (a[i] % 2 == 0) {
                al1.add(a[i]);
            } else {
                al2.add(a[i]);

            }
        }
            System.out.println(" even no are");

                System.out.println(al1);

            System.out.println("odd number are");

                System.out.println(al2);

        }
        }



