public class ReverseAString {
    public static void main(String[] args) {
        String a = "indian";
        int num = a.length();
        String b = "";

            for ( int i = num - 1 ; i >= 0; i-- ){

                  b = b + a.charAt (i);



            }
        System.out.print(b);


        }
    }

