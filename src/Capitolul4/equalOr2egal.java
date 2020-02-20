package Capitolul4;

import java.awt.*;

public class equalOr2egal {
    public static void main(String[] args) {

        int a = 3;
        byte b = 3;

        if (a==b)
            System.out.println("true");
        else
            System.out.println("false");


        ElectricGuitar x=new ElectricGuitar();
        ElectricGuitar y=new ElectricGuitar();
        ElectricGuitar z=x;

        if(x==y)
            System.out.println("true");
        else
            System.out.println("false");

        if(x==z)
            System.out.println("true");
        else
            System.out.println("false");


        String name1="Mihai";
        String name2="Mihai";

        if(name1.equals(name2))
            System.out.println("true");
        else
            System.out.println("false");

    }
}
