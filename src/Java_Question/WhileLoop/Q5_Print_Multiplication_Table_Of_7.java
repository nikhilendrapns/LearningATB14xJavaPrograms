package Java_Question.WhileLoop;

public class Q5_Print_Multiplication_Table_Of_7 {

    public static void main(String[] args) {
        int n=1;
        while(n<=10)
        {
            System.out.println("7 * "+n+" = "+ 7*n);
            n++;
        }
    }
}

/*
 public static void main(String[] args) {
        int i=0;
        boolean status=true;
        while(true){
            i=i+1;
            System.out.print(i+ " ");
            if(i>10){
                status=false;
                break;

            }

        }
    }
}
 */