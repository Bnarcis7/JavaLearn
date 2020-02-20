package Capitolul3;

public class DogTest {
    public static void main(String[] args) {

        //Dog[] pets;
        //Dog[] pets= new Dog[7];
        //pets[0]= new Dog(); //??
        Dog figo = new Dog();
        figo.name = "Figo";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = figo;

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }


    }
}
