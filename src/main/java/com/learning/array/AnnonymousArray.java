public class AnnonymousArray {
    public static void main(String[] args) {

        AnnonymousArray.temp(new int[]{10, 20, 30});
    }

        static void  temp ( int[] no) {

            int total = 0;
            for ( int i:no)
            {
                total = total + i;
            }
            System.out.print(total);

        }
    }


