import java.util.HashSet;
public class KthnoUsingHashSet {
    public static void main(String[] args) {
        int [] a = {3,5,4,3,2,1,2};
        HashSet < Integer> hs = new HashSet < > ();
        for( int no: a){
            if ( hs.add(no)== false){
                System.out.print(no+" ");
            }
        }

    }
}
