package ex_20_OOPs_Polymorphism.MethodOverriding;

public class Lab183_MethodOverriding {

    //Runtime Polymorphism
    public static void main(String[] args) {

        Father f1 = new Father();
        f1.home();

        Gargeya m1 = new Gargeya();
        m1.home();

        Father f2 = new Gargeya(); // Dynamic Dispatch
        f2.home();

        //  Gargeya m2=new Father();
        // When father is getting born, child reference cannot be given to.
    }
}

class Father {
    void home() {
        System.out.println("3BHK");
    }
}

class Gargeya extends Father
{
    @Override
    void home()
    {
        System.out.println("4BHK");
    }
}

