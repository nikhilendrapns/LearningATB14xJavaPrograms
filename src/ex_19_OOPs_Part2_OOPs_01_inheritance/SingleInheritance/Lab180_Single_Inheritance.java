package ex_19_OOPs_Part2_OOPs_01_inheritance.SingleInheritance;

public class Lab180_Single_Inheritance {
    public static void main(String[] args) {
        Son gargeya = new Son();
        System.out.println(gargeya.gold_f);
        gargeya.bhk2();
        gargeya.bhk3();

        Father f1  = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();
        // f1.bhk3();?
    }
}


