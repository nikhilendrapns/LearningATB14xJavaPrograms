package ex_18_OOPs_Constructors;

public class Lab175_OOPs {
    public static void main(String[] args) {
        baby b1 = new baby();
        System.out.println(b1.name);
        baby b2 = new baby();
        System.out.println(b2.name); // default constructor giving same name to all
        baby b3 = new baby("Rahul");
        System.out.println(b3.name); // parameterized Constructor
        baby b4;
// System.out.println(b4.name);  not initialized .. ERROR
    }

}

class baby {

    String name;

    // Default Constructor also called
    baby() {
        name = "gargeya";
        System.out.println("Baby function is called");
    }

    baby(String lname) {
        this.name = lname;
    }
}