public class REmoveDuplicate1 {
    public static void main(String[] args) {
        int a [] = {1,4,5,3,2,6,2,3,7,4,8};
      int delete = 5;
        for (int i = 0; i <a.length;i++){
            if ( delete ==a[i]){
                for (int j=i; j<a.length-1;j++){
                    a[j] = a[j+1];
                }
                break;
            }

        }
        for ( int i = 0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }


    }
}
