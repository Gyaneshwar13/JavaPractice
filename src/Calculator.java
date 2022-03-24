import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String yn;
        do {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a  number ");
        int a = s.nextInt();
        System.out.println("please enter a  number ");
        int b = s.nextInt();
        System.out.println("please enter a  Symbol (+,-,/,*) ");
        String Sym = s.next();
        int res;


            switch (Sym) {

                case " + " :
                    res = a + b;
                    System.out.println("addition = " + res);
                    break;
                case "-":
                    res = a - b;
                    System.out.println("subtraction = " + res);
                    break;
                case "*":
                    res = a * b;
                    System.out.println("multiplication = " + res);
                    break;
                case "/":
                    res = a / b;
                    System.out.println("Division = " + res);
                    break;
                default:
                    System.out.println(" Wrong symbol");
            }
            System.out.println("would you like to continue type y or n   ");

            yn = s.next();
        }

        while (yn.equals("y") || yn.equals("Y"));


    }
}





