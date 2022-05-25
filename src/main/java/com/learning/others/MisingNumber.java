public class MisingNumber {
    public static void main(String[] args) {
        int  [] a = {1,2,3,4,5,7,8};
        int len = a.length;
        int explen = a.length+1;
        int totalsum = explen*(explen+1)/2;
        int sum = 0 ;
        for (int i =0 ; i<a.length; i++){
            sum = sum+ a[i];
        }
        System.out.print( (totalsum-sum) +" ");



    }
}
