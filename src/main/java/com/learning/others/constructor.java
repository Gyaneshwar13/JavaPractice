public class constructor {

        String name;
        String colour;
        int age;
        String type;


       public constructor(String name, int age , String type, String colour){
            this.name = name;
            this.type = type ;
            this. age = age;
            this.colour = colour;

        }
        public void speak(){

            System.out.println( "Name of the animal is ="+ name);
            System.out.println( "animal type is =" + type);
            System.out.println( "animal age is ="+age);
            System.out.println("animal colour is ="+colour);
        }

    public static void main(String[] args) {

           constructor zirraf = new constructor( "zirraf", 4, "carnivorous","yellowand black");
               constructor panda = new constructor("panda",6,"herbevorous","blackandwhite");

               zirraf.speak();
               panda.speak();



    {

        }

    }
        }




