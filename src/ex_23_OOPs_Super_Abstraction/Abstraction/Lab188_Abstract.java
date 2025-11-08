package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab188_Abstract {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50k();
        s1.loan10k();
    }
}
abstract class AmitFather{
    abstract void loan50k();
    void loan10k(){
        System.out.println("Given");
    }
}
class Son extends AmitFather{
    @Override
    void loan50k(){
        System.out.println("Ok, I am Amit, I will give the Father Loan of 50k");
    }
}

