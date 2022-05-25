import java.util.HashSet;
public class ConsecutiveSequence {
    public static void main(String[] args) {
        int[] a = {2, 9, 3, 10, 1, 4, 5, 11, 26};
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        int length =0;
        for (int i = 0; i < a.length; i++) {
           if  (!hs.contains(a[i] - 1)) {
               int no = a[i];
               while (hs.contains(no)) {

                   no++;
               }

            if (length < no-a[i]) {
                 length = no - a[i];
            }
           }

        }
        System.out.print(length);
    }
}



