public class MissingElement1 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,7,8,9,10};
        int xo1 =a[0];
        for ( int i = 1 ; i <a.length; i++ ){
            xo1 =xo1^a[i];
        }
        int xo2 = 1;
        for ( int i = 2; i<= 10;i++){
            xo2 = xo2^i;
        }
        System.out.println((xo1^xo2));


    }
}
