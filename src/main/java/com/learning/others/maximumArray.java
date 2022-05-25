public class maximumArray {
    public static void main(String[] args) {
        int [] a = {22,33,43,5,6,78,9,4,56,98};
        int max = a[0];
        for ( int i = 0 ; i<a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
            }
        System.out.print("maximum value = "+ max);
        }

    }

