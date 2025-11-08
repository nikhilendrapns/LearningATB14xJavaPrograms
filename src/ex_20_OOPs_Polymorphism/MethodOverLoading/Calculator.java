package ex_20_OOPs_Polymorphism.MethodOverLoading;

public class Calculator {

    public static void main(String[] args) {
        Calc c1=new Calc();
        c1.add(3,5); // int values
        c1.add(3.14,3.14);
        // Same Method with different parameters or Arguments > Compile Time Polymorphism
        // which method it will call int method
        // c1.add(3.58,7.6);
    }
}

class Calc{

    int add(int a,int b){
        return  a+b;
    }

    int add(int a,int b,int c){
        return  a+b+c;
    }
    // same function in both return type -> add but type is different int, double so this can use(call)
    double add(double a, double b){
        return a+b;
    }

    long add(long a, int b){
        return a+b;
    }
}
