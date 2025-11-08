package ex_22_OOPs_Access_Modifier.Criminal;

import ex_22_OOPs_Access_Modifier.Police.Cop;

public class Thief {

    public static void main(String[] args) {
        Cop T1 = new Cop(100);
        //   T1.canishoot();  private - not allowed ,public - allowed
        //   T1.thisDefaultF1(); // default also not allowed another package
    }
}

