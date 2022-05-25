public class MinimumArray {
    public static void main(String[] args) {
        int[]a ={2,3,4,6,8,9,1,5};
        int temp;

         for ( int i =0 ; i < a.length ; i++){
             for ( int j = 0 ; j< a.length -1; j++){
                 if ( a[j] > a[j+1]){
                     temp = a[j];
                     a[j] = a[j+1];
                     a[j+1] = temp;

                 }

             }


         }

             System.out.print("minimum array is =  " +a[0] );
         }
    }


