package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab187_Abstraction {

    public static void main(String[] args) {
        //Car
        Car Tesla = new Car(300);
        Tesla.drive();
    }
}
class Vehicle{
    public int maxSpeed = 180;
    void noTest(){
        System.out.println("Empty");
    }
    Vehicle(){
        System.out.println("Default Const");
    }
    Vehicle(int a){
        System.out.println("Param con");
    }
    Vehicle(int a, int b){
        System.out.println("Param con");
    }
    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }
    void message(int a){
        System.out.println("PC Argument");
    }
    void drive(){
        System.out.println("Vehicle Parent");
    }
}
class Car extends Vehicle{
    private int maxSpeed = 281;
    Car(){
        super(100);
    }
    Car(int a){
        System.out.println("PC car");
    }
    void test(){

    }
    @Override
    void drive(){
        System.out.println("Over ridden the Vehicle");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();

    }
}

