public class Insertion {
    public static void main(String[] args) {
        int []a = {20,30,40,50,60};
        int insert = 100;
        int position = 3;
        for (int i = a.length-1; i> position-1 ; i--){
            if ( a[i] == a[2]){

               a[i] = a[i-1];

            }
            a[position-1] = insert;

        }
        for ( int i =0; i <a.length; i++){
            System.out.print(a[i] +" ,");
        }

    }
}
