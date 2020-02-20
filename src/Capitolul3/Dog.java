package Capitolul3;

public class Dog {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void bark() {
         System.out.println("ham");

    }

    static void eat(){
        System.out.println("Food");
    }

    static void chaseCat(){
        System.out.println("Chase");
    }
}
