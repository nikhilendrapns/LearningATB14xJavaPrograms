package ex_15_StringBuffer_Builder_String_Functions;

public class Lab143_String_Functions {

    public static void main(String[] args) {
        String name = "Gargeya";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
        // System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException: Index 10 ou

        // 2. concat()
        System.out.println(name.concat("Borgaonkar"));

        // 3. contains()
        System.out.println(name.contains("hello"));

        // 4. equals()
        System.out.println(name.equals("Gargeya"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("gargeya"));

        // 6. indexOf() //  gargeya -> ? a
        System.out.println(name.indexOf('a'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("GARGEYA".toLowerCase());

        // 12. toUpperCase()
        System.out.println("gargeya".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("G"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "    Gargeya Borgaonkar     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Gargeya"));


        // --------------
        StringBuilder stringBuilder = new StringBuilder("Gargeya");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());




    }
}
