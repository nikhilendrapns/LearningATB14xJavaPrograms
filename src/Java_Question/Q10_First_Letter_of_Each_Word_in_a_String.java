package Java_Question;
import java.util.Scanner;
public class Q10_First_Letter_of_Each_Word_in_a_String {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String I will give first letter of Each word");
        String S1=  sc.nextLine();

        String[] arr =S1.split(" ");
        String Final="";
        for(String s:arr)
        {
            Final=Final+s.substring(0,1)+ " ";
        }
        System.out.println(Final);
    }
}

/*
  public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter word");
        String str = scanner.nextLine();
        System.out.println("first letter of each word");
        boolean isWordStart = true;
        for (int i = 0 ; i < str.length() ; i++) {
        char ch = str.charAt(i);
        if (ch != ' ' && isWordStart) {
            System.out.println(ch);
            isWordStart = false;
        } else if (ch == ' ') {
            isWordStart = true;
        }
        }
    }
}
 */

/*
public static void main(String[] args) {
        String str="Here is your string to validate the First letter of each words";

String [] split= str.split(" ");

        for (int i = 0; i < split.length; i++) {
            System.out.println("first letter of each word is:"+ split[i].charAt(0));
    }}}
 */

/*
 public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input string ");
        String str= scanner.nextLine();

        String[] splitted= str.split(" ");
        System.out.println("The first letter of each word is ");

        for (String split:splitted) {
            System.out.print(split.charAt(0)+ " ");
        }
    }
}
 */

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String s1 = scanner.nextLine();
        String[] wordsArray = s1.split(" ");
        for (String word:wordsArray) {
            char firstLetterOfWord = word.charAt(0);
            System.out.println(firstLetterOfWord);
        }
    }
}

 */

/*
   //First Letter of Each Word in a String.
        String str = "This is a testing world. And testing is important.";
        String[] splitString = str.split(" ");

        System.out.println("Created Array : ");
        for(int i = 0 ; i <= splitString.length - 1 ; i++){
            System.out.println(splitString[i]);
        }

        System.out.println("First Letter Of Each Word : ");
        for(int i = 0 ; i <= splitString.length -1 ; i++){

            for(int j=0; j < 1 ; j++){

                System.out.println(splitString[i].charAt(j));

            }

        }

    }
}
 */

/*
  public static void main(String[] args) {
        String input = "Java Programming Language";
        String output = "";
        String[] array = input.split(" ");
        for (int i = 0 ; i < array.length; i++){
            output = output + array[i].charAt(0);
        }
        System.out.println(output);
    }
}
 */
