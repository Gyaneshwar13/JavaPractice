public class SecondLargestArray {
    public static void main(String[] args) {
        int [] a = {3,9,4,7,2 ,6,5,8,1,10,43,56,73};
        int temp;
        for ( int i = 0 ; i<a.length-1 ; i++){
            for ( int j=i+1; j<a.length; j++){
                if( a[i]< a[j]){
                    temp = a[i];
                    a[i]= a[j];
                    a[j]= temp;
                }
            }
        }
        System.out.println("second largest digit is "+ a[1]);
    }
}
