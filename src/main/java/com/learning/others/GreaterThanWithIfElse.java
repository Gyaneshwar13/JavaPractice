public class GreaterThanWithIfElse {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        if (a > c && a > b) {
            System.out.println(" a is the greater no.");
        } else if (b > c && b > a) {
            System.out.println("b is the greater no.");


        }
        else if (  c > a && c > b ){
            System.out.println ("c is the greater no.");

        }
        else {

            System.out.println (" program ended");
        }
    }


}
