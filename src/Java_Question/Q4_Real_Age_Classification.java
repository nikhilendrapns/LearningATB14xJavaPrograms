package Java_Question;

public class Q4_Real_Age_Classification {

    public static void main(String[] args) {
        //Real_Age_Classification (  age → 59 ) →  Minor, Adult (Adult , Sr Senior) - Ternary Operator

        int age=50;

        String age_classification = (age<18) ? "Minor" : (age>18 && age<65) ? "Adult" : "Senior citizen";
        String result3= age<18 ? "Minor" : (age>=60 ? "Senior": "Adult");

        System.out.println("age_classification:" + age_classification);
        System.out.println(result3);

    }
}
