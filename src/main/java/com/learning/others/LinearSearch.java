public class LinearSearch {
    public static void main(String[] args) {
        int[]a = {12,34,53,67,86,93,64,75,8,6,8,12,};
        int sr = 0;
        int flag = 0;

        for( int i = 1; i <a.length; i++) {
            if (a[i] == sr) {
                System.out.print("sr is at this index no = " + i);
                flag = flag + 1;
            }
        }
            if ( flag ==0){
                System.out.print("item not found in the list");
            }


        }
    }

