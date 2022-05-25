public class LeapYear1 {
    public static void main(String[] args) {
        int a = 2012;
        if ( (a % 4 == 0 && a % 400 == 0)|| ( a % 100 != 0 ) ) {
        System.out.println(" it is a leap year");

        }
        else {
            System.out.println(" it is not  a leap year");
        }

    }

}
