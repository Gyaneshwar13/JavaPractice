public class SwitchCalculator {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;
        int res;
       String  symb = "+" ;

        switch ( symb )
        {

            case  "+":
                res = a + b ;
                System.out.println(res);
                break;
            case "-":
                res = a - b ;
                System.out.println(res);
                break;
            case "*":
                res = a * b;
                System.out.println(res);
                break;
            case "%":
                res = a % b;
                System.out.println(res);
                break;





            }
        }
    }

