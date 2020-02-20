package ExempleCapitolul1;

import Capitolul1.AccesModifiers;

public class ExempleCapitolul1 {
    public void method(){
        //tested public access modifier for world
        AccesModifiers accesModifiers=new AccesModifiers();
        accesModifiers.publicMethod();

        //protected method doesnt work in another package aka world
        //accesModifiers.protectedMethod();

        //private method doesnt work in another package aka world;
        //accesModifiers.privateMethod();
    }

}
