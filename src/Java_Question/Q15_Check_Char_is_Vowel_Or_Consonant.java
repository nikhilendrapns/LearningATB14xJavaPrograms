package Java_Question;
import java.util.Scanner;
public class Q15_Check_Char_is_Vowel_Or_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char character = scanner.next().charAt(0);
        char ch = Character.toLowerCase(character);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println(ch +" is vowel");
                break;
            default:
                if(Character.isLetter(ch))
                    System.out.println(ch + " is consonant");
                else
                    System.out.println("It is not a valid character");
        }
        scanner.close();
    }

}

/*
static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        String str = sc.next();

        if(str.equalsIgnoreCase("A") || str.equalsIgnoreCase("E")
                || str.equalsIgnoreCase("I")|| str.equalsIgnoreCase("O")
        || str.equalsIgnoreCase("U"))
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}
 */
/*
 public static void main(String[] args) {
        char ch = 'e';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }
    }
}
 */
/*
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character number");
		int ch = sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		System.out.printf("%c is vowel",ch);
		}else{
		System.out.printf("%c is consonant",ch);
		}
	}
}
 */
/*
public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a character");
        String letter=scn.next();

        switch(letter){
            case "a":
                System.out.println("letter is a vowel");break;
            case "e":System.out.println("letter is a vowel");break;
            case "i":System.out.println("letter is a vowel");break;
            case "o":System.out.println("letter is a vowel");break;
            case "u":System.out.println("letter is vowel");break;
            default:System.out.println("letter is a consonant");
        }


 */

/*
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        String input = sc.next();
        if (input.length() != 1) {
            System.out.println("Enter a single character to determine if its a vowel or consonant");
            sc.close();
            return;
        } else if (input.equalsIgnoreCase("a") ||
                input.equalsIgnoreCase("e") ||
                input.equalsIgnoreCase("i") ||
                input.equalsIgnoreCase("o") ||
                input.equalsIgnoreCase("u") ) {
            System.out.println("Its a vowel");
            return;
        } else {
            System.out.println("It is a consonant");
        }
    }
}
 */

/*
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String ent_ch = scanner.next();
        String vowel = "aeiou";
        String alpha_regex = "[A-Za-z]";
//        if(ent_ch.length() == 1 && Character.isLetter(ent_ch.charAt(0))){
        if(ent_ch.length() == 1 && ent_ch.matches(alpha_regex)){
            if(vowel.contains(ent_ch.toLowerCase()))
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }else
            System.out.println("Enter a character only");
    }
}
 */
/*
   public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character from a to z");
        if (!scan.hasNextInt()) {
            String c = scan.next();
            if (c.length() == 1) {
               // System.out.println(c);
                c = c.toUpperCase();

                if (c.equals("A")) {
                    System.out.println(c + " is a vowel");
                } else if (c.equals("E")) {
                    System.out.println(c + " is a vowel");

                } else if (c.equals("I")) {
                    System.out.println(c + " is a vowel");

                } else if (c.equals("O")) {
                    System.out.println(c + " is a vowel");

                } else if (c.equals("U")) {
                    System.out.println(c + " is a vowel");

                } else {
                    System.out.println(c + " is a consonant");
                }

            } else {
                System.out.println("Please enter single character");
            }
        }else {
            System.out.println("Only character is allowed");

        }
        }
    }
 */
/*
 public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc=new Scanner(System.in);
        String alphabet = sc.next();
        if(alphabet.length()!=1){
            System.out.println("Enter a single character:");
        }
        else if(alphabet.length()==1){
           char alphabet1= alphabet.charAt(0);
           char alphabet2=Character.toLowerCase(alphabet1);
           if((alphabet2=='a')||(alphabet2=='e')||(alphabet2=='i')||(alphabet2=='o')||(alphabet2=='u'))
           {
               System.out.println("It is vowel");
           }
           else
           {
               System.out.println("It is consonant");
           }
        }else{
            System.out.println("Enter a valid Character input");
        }
    }
}
 */
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

            for (int i =0; i<str.length(); i++)
            {
                char ch = str.charAt(i);
                if(Character.isLetter(ch))
                {
                    ch = Character.toLowerCase(ch);
                    if(ch =='a'||ch == 'e'|| ch == 'i'|| ch =='o' || ch =='u')
                        System.out.println("Character is vowel: " + ch);
                    else System.out.println("Character is consonant: " + ch);
                }
                else
                    System.out.printf("Ignoring character %c as its not a letter\n", ch);

            }
            sc.close();
        }
        }
 */
/*
 public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character from a to z");
        if (!scan.hasNextInt()) {
            String c = scan.next();
            if (c.length() == 1) {
               // System.out.println(c);
                c = c.toUpperCase();

                if (c.equals("A")) {
                    System.out.println(c + " is a vowel");
                } else if (c.equals("E")) {
                    System.out.println(c + " is a vowel");

                } else if (c.equals("I")) {
                    System.out.println(c + " is a vowel");

                } else if (c.equals("O")) {
                    System.out.println(c + " is a vowel");

                } else if (c.equals("U")) {
                    System.out.println(c + " is a vowel");

                } else {
                    System.out.println(c + " is a consonant");
                }

            } else {
                System.out.println("Please enter single character");
            }
        }else {
            System.out.println("Only character is allowed");

        }
        }
    }
 */