public class MinimumArray1 {
    public static void main(String[] args) {

        int[] a = {3,4,5,67,8,43,75,69,2,1};

          int min = a [0];

        for ( int i = 1 ; i < a.length; i++){

            if ( a[i] < min){
                min = a[i];
            }


    }
        System.out.print ( min);
    }
}






