public class NumericSequenceThree {
    public static void main(String[] args) {
        int count = 0;
        for ( int i = 1 ; i <= 5 ;  i++){
            for ( int l = 1; l <=i ; l++){
                count = count +1;
                System.out.print(count +" ");
            }
            System.out.println();
        }
    }
}
