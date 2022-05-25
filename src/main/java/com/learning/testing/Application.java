package com.learning.testing;

public class Application {
    public static void main(String[] args) {
        Person obj = new Person();
        Person obja = new Person();
        Person obj1 = new Person();
        Person obj2 = new Person();
        Person obj3 = new Person();
        Person obj4 = new Person();
        System.out.println(obj.getName());
        System.out.println(obja.getName());
        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        System.out.println(obj3.getName());
        System.out.println(obj4.getName());
//        obj.name = "ram";
//       System.out.println(obj.name);

    }

}

class Person{

    private String name; ///

    public Person(){
        this.name = "Blank Space";
    }

    public String getName(){
        return name;
    }


    }



