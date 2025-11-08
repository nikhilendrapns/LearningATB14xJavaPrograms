package Java_Question;

import java.util.Scanner;

// Count the Number of Words in a String.
public class Q9_Count_number_of_words_string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.nextLine().trim();

        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ' && !inWord) {
                // Start of a new word
                inWord = true;
                count++;
            } else if (ch == ' ') {
                // End of a word
                inWord = false;
            }
        }

        System.out.println("Number of words: " + count);

        sc.close();
    }
}

/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter String");
    String str = scanner.nextLine();
    int count = 0;
    boolean inWord = false;
    for (int i = 0 ; i < str.length() ; i++) {
        char ch = str.charAt(i);
        if (ch != ' ' && !inWord) {
            inWord = true;
            count++;
        } else if (ch == ' ') {
            inWord = false;
        }
    }
    System.out.println ("No. of words: " + count);
}
}

------------------------------------------------------------------------
public class NumberOfWords {
    public static void main(String[] args) {
        String str="Here is your string to validate the number of words.";
        String [] splitStr=str.split(" ");
        int len=splitStr.length;
        System.out.println("total number of words in string is: "+len);
        for (int i = 0; i < len; i++) {
            System.out.println("first letter of each word is:"+splitStr[i].charAt(0));
        }

    }
}

-------------------------------------------------------------------
/*
public class P4_NumberOfWordsString {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter The String I will count the words");
    String userInput= sc.nextLine();
    String[] S1= userInput.split(" ");
    int count =0;
     for(String s:S1) {
          count++;
     } System.out.println(count);
}}
 */

/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter String:");
    String s1 = scanner.nextLine();
    String[] wordsArray = s1.split(" ");
    System.out.printf( "The string Constance %d worlds ",wordsArray.length);

}
}

 */
/*
 public static void main(String[] args) {
        String input = "Java Programming Language";
        System.out.println("Given string is : "+input);
        String[] array = input.split(" ");
        System.out.println("Number of words in a given string is : "+ array.length);
    }
}
 */

/*
public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String str= scanner.nextLine();
        printFirstLetterOfEachWord(str);
        scanner.close();
    }

    public static void printFirstLetterOfEachWord(String str)
    {
        String[] strArray=str.split(" ");
        System.out.println("Printing first letter of each word");
        for(String s:strArray)
        {
            System.out.println(s.charAt(0));
        }
    }
}
 */
/*
//Program to find number of word ina string

public class Q004_Number_Of_Words_InString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scanner.nextLine();

        System.out.println("Number of words in the string is "+countNumberOfwords(str));
        System.out.println("Number of words without split "+countNumberOfwordsWithoutSplit(str));
        scanner.close();
    }

    public static int countNumberOfwords(String str)
    {
        int count =0;
        String[] wordArray=str.split(" ");
        for(String s:wordArray)
        {
        count++;
        }
        return count;
    }

    public static int countNumberOfwordsWithoutSplit(String str)
    {
        int count =0;
        char[] wordArray=str.toCharArray();
        for(int i=0;i<wordArray.length-1;i++)
        {
            if(wordArray[i]==' ')
            count++;
        }
        return count+1;
    }
}
 */

/*
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        String sr = scanner.nextLine();
        String[] count = sr.split(" ");
        System.out.println(count.length);
        // Count number of words
        System.out.println(sr);
        System.out.println("Total count of words are " + count.length);
       // System.out.println(count[0]);

        // first alphabet of each word in string

        // First way
        for (int i=0 ; i<count.length;  i++){
            System.out.print(count[i].charAt(0) + " ");
        }
        System.out.println("");
        // 2nd way

        for (String firstletter : count){
            System.out.println(firstletter.toUpperCase().charAt(0));
        }


        //}
    }
}
 */