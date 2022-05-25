import java.util.HashSet ;
import java.util.Set;
public class KthnousingSet {
    public static void main(String[] args) {
        int [] a = {1,3,4,5,6,7,3,8,7};
        Set<Integer> r = new HashSet<>();
        for (int no : a){
            if (( r.add(no)) == false){
                System.out.print(no +" ");
            }

        }

    }
}
