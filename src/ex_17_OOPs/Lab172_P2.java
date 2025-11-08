package ex_17_OOPs;

public class Lab172_P2 {
    public static void main(String[] args) {

        // Create an object of ATBx class
        ATBx amit = new ATBx();
        // Class - ATBx
        // Object Ref - amit
        // Object -> new ATBx();

        amit.name = "Amit Sharma";
        amit.doAssignment();

        // Create multiple Baby objects
        Baby b1 = new Baby();
        Baby b2 = new Baby();
        Baby b3 = new Baby();
    }
}

/*class ATBx {
    String name;

    void doAssignment() {
        System.out.println(name + " is doing the assignment.");
    }
}
*/
class Baby {
    Baby() {
        System.out.println("A new baby object is created!");
    }
}
