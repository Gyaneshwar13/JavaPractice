public class Reverse {
    public static void main(String[] args) {
        int a = 5432;
        int ques , rem ;
       int rev = 0;

        while ( a>=1){

             rem = a % 10;
             rev = rev * 10 + rem ;
             a = a/ 10;

        }
        System.out.println(rev);
    }
}
