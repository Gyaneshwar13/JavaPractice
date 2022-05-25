public class PrimeNumber {
    public static void main(String[] args) {
        int a = 51;
        int b = 1;
        int defer  =  0;
        for (int i = 2 ; i <= a-1; i++ ){
           if  (a % i == 0){
               defer = defer+1;
           }

           }
        if ( defer > 0){
            System.out.println( "a is not a prime number");

        }
        else{
            System.out.println("a is a even no");
        }

    }
}
