package Capitolul1;

public class AccesModifiers {

    public void publicMethod()//function definition--signature
    {

    }

    private void privateMethod()
    {
        // has public acces modifier so it can be called only in another function in the same class
        publicMethod();//how to call a function

        // has protected access modifier so it can be called only in another function in the same class
        protectedMethod();

        // has default access modifier so it can be called only in another function in the same class
        noModifierMethod();


    }
    protected void protectedMethod()
    {

        // has private access modifier so it can be called only in another function in the same class
        privateMethod();

    }
     void noModifierMethod()
    {

    }


}
