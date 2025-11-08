package ex_23_OOPs_Super_Abstraction.SuperKeyword;

public class Lab195_Private {
}
class XYZ {
    XYZ() {
    }
    protected int my_gold = 10;
}

class CAB extends XYZ{
    void display(){
        System.out.println(super.my_gold);
    }
}