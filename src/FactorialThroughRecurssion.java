public class FactorialThroughRecurssion {
    static int fact = 1;
    public static void main(String[] args) {
        int no = 5 ;


        FactorialThroughRecurssion obj = new FactorialThroughRecurssion ();
        obj.calfact (no);
        System.out.println (fact);



    }

    int calfact (int no) {
        if (no >= 1) {
            fact = fact * no ;
            calfact(no - 1);

        }
        return fact;
    }
}
