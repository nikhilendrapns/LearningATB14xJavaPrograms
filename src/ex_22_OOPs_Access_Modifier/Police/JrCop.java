package ex_22_OOPs_Access_Modifier.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop Jrcop = new Cop(200);
        //  Jrcop.canishoot ; private - not allowed  ,
        Jrcop.canishoot(); // protected - allowed within the package
    }
}
