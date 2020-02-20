package Capitolul1;

public class AccesModifierChild extends AccesModifiers {
    public void method(){
        //tested public access modifier for subclass
        publicMethod();
        //tested protected access modifier for subclass
        protectedMethod();
        //private method doesnt work in a subclass
        //privateMethod();

        //tested default access modifier for subclass
        noModifierMethod();
    }
}
