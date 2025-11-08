package Java_Question;
import java.util.Scanner;
public class Q24_Character_is_an_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        String s = sc.next();
        if (s.length() > 1) {
            System.out.println("Invalid input.Enter a single character");
            return;
        } else if ((s.length() == 1)) {
            char c = s.charAt(0);
            if ((c>='A'&& c<='Z')||(c>='a'&& c<='z')) {
                System.out.println("It is an alphabet");
            } else {
                System.out.println("It is not an alphabet");
            }
        }
    }
}
/*
 public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the alphabet");
            char ch =scanner.next().charAt(0);
            if ((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){
                            System.out.println(ch+ " is an alphabet");
                        } else {
                            System.out.println(ch+ " is not an alphabet");
                        }
                    }
                }
 */
/*
public static void main(String[] args) {
        char ch = '0';
        if (Character.isAlphabetic(ch)){
            System.out.println(ch + " character is alphabet");
        }
        else {
            System.out.println(ch + " character is not an alphabet");
        }
    }
}
 */
/*
  public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Character");
        char c=scanner.next().charAt(0);

        if((c>='a' && c<='z') || (c>='A' && c<='Z'))
            System.out.println("It's an alphabet");
        else System.out.println("Its not an alphabet");

    }
 */

/*
  public static void main(String[] args) {
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an alphabet (a to z) or(A to Z): ");
        char ch='\0';
        boolean flag=false;
        input=sc.next();
        if(input.length()==1)
        {
            ch= input.charAt(0);

        }
        else{
            System.out.println("Enter a valid single character");

        }
//if(flag==true)
        //Using Logic
//{
        if((ch >='a' && ch<='z') || (ch>='A'&& ch<='Z') ) //Here it checks for ASCII Values
        {
            System.out.println("Entered Character "+input+" is an alphabet");
        }
        else{
            System.out.println("Entered input is not an alphabet");
        }

    }
    }
 */