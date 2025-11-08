package ex_19_OOPs_Part2_OOPs_01_inheritance.MulitLevel_Inheritance;

public class Lab179_MultiLevel {
    public static void main(String[] args) {

        //SOn can inherit from both GF and Father
        System.out.println("-----SON here------");
        Son gargeya = new Son();
        gargeya.bhk3();
        gargeya.home();
        gargeya.extra();
        gargeya.gf();

        System.out.println("----Father here-------");
        //Father can inherit from GF only
        Father f1 = new Father();
        f1.gf();
        f1.home();
        f1.extra();

        System.out.println("------GrandFather Here-----");
        //GF can only use his own functions
        GrandFather gf1 = new GrandFather();
        gf1.gf();
        gf1.home();

        //Dynamic Dispatch
        GrandFather gf2 = new Son();// This will Access child class method in case of method overriding
        Father f11 = new Son();
        //Son S1 = new GrandFather();  --- Not Possible
        // Son s1 = new Father();

    }
}

