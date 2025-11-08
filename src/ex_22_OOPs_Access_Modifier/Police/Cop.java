package ex_22_OOPs_Access_Modifier.Police;

public class Cop {

    public  int gun;
    private String id_card;

    public Cop(int bullet){
        this.gun = bullet;

    }
    // method and behaviour
    protected void canishoot(){
        System.out.println("Yes you can");
    }

    // no return is no one use
    void thisDefaultF1(){
        System.out.println("Hi cop");
    }

}
