public class KthnoUsingBrute {
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,2,3};
        System.out.println("duplicate numbers are");
        for (int i = 0; i <a.length; i++){
            for ( int j = i+1 ; j<a.length; j++){
                if ( a[i] == a[j]){
                    System.out.print(a[i]+", ");
                }


                }
            }
        }
    }

