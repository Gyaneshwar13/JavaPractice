public class SecondLargest1 {
    public static void main(String[] args) {
        int[] a  = {10,23,42,54,67,56,98,99,76,87,88,76 };
        int largest = Integer.MIN_VALUE;
        int second_largest= Integer.MIN_VALUE;
           for ( int i = 0; i <a.length; i++){
               if ( a[i]> largest){
                  second_largest = largest;
                  largest = a[i];
               }
               else if ( a[i]> second_largest && a[i] != largest){
                   second_largest = a[i];
               }
           }
        System.out.println(second_largest);
        System.out.println(largest);

    }
}
