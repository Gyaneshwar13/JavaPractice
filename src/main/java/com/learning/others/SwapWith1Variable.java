public class SwapWith1Variable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a+b;
        b = a -b ;
        a = a - b ;
        System.out.println (" value of a " +a);
        System.out.println (" value of b " +b);
        System.out.println (" program ended ");
    }
}
