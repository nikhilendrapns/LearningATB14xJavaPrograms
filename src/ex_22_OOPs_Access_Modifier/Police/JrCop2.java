package ex_22_OOPs_Access_Modifier.Police;

public class JrCop2 {
    public static void main(String[] args) {
        Cop j2 = new Cop(100);
        j2.thisDefaultF1(); // default allowed within the package same as protected
    }
}

