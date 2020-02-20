package Capitolul1;

public class AccesModifierTest {
    public void method(){
        //tested public modifier in package
        AccesModifiers accesModifiers=new AccesModifiers();
        accesModifiers.publicMethod();
        //tested protected modifier in package
        accesModifiers.protectedMethod();

        //private method doesnt work in the same package
        //accesModifiers.privateMethod();

        //tested for default access modifier in package
        accesModifiers.noModifierMethod();
    }
}
