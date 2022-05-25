import java .util.HashMap;
import java.util.Map;
import java.util.Set;
public class KthnoUsingHashMap {
    public static void main(String[] args) {
        int[] a ={3,5,7,3,9,5,9,6,1};
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int no:a) {
            Integer count = hm.get(no);
            if (count == null) {
                hm.put(no, 1);

            } else {
                count = count + 1;
                hm.put(no, count);
            }
        }
            Set<Map.Entry<Integer,Integer>> m = hm.entrySet();
            for(Map.Entry<Integer,Integer> me:m){
                if(me.getValue()>1){
                    System.out.print(me.getKey());
                }
            }
        }

    }



