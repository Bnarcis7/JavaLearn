package ExempleCapitolul1;

import Capitolul1.AccesModifiers;

public class AccesModifierDifferentPackageChild extends AccesModifiers {
    public void method(){
        //tested public access modifier for subclass
        publicMethod();
        //tested protected access modifier for subclass
        protectedMethod();
        //private method doesnt work in a subclass of another package
        //privateMethod();

        //default method doesnt work in a subclass of another package
        //noModifierMethod();
    }
}
