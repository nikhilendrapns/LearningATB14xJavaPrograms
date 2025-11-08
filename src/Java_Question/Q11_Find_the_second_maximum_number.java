package Java_Question;

public class Q11_Find_the_second_maximum_number {
    public static void main(String[] args) {
        int[] nums2 = {12,34,10,1,100,3,4,32};

        int max = 0;
        int max2 = 0;

        for (int i : nums2) {
            if (i > max) {
                max2 = max;
                max = i;
            } else if (i > max2 && i != max) {
                max2 = i;
            }
        }
        System.out.println(max2);
    }
}

/*
public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max1=0;
        int max2=0;
        for(int i=0; i<numbers.length;i++){
            if(max1<numbers[i]){
                max1=numbers[i];
            }
        }
        System.out.println("maximum number is:"+max1);
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]!=max1){
                if(max2<numbers[i]){
                    max2=numbers[i];
                }
            }
        }
        System.out.println("Second maximum number is:"+max2);
    }
} */
/*
public class P6_SecondMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 68, 89, 10, 1, 100, 99, 3, 4, 32, 67, 112};
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>highest)
            {
                secondHighest=highest;
                highest=numbers[i];
            }else if(numbers[i]>secondHighest && numbers[i]<highest)
            {
                secondHighest=numbers[i];
            }
        }
        if (secondHighest == Integer.MIN_VALUE)
            System.out.println("No second highest element (all elements are equal)");
        else
            System.out.println("Second highest number: " + secondHighest);
    }
}
*/
//I want you to find the second maximum number in this array
//int[] numbers = {12, 34, 10, 1, 100, 3};
//public static void main(String[] args) {
//    int[] numbers = {12, 34, 10, 1, 100, 3};
//   int max = numbers[0];
//   int secondMax = numbers[1];
//    for (int i = 0; i < numbers.length; i++) {
//        if (numbers[i] > max) {
//            secondMax = max;
//            max = numbers[i];
//        } else if (numbers[i] > secondMax && numbers[i] != max) {
//            secondMax = numbers[i];
//        }
//    }
//    System.out.println("Second maximum number is: " + secondMax);


//}}
// */
/*
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter length of array : ");
        int lengthOfArray = sc.nextInt();

        int[] num = new int[lengthOfArray];

        //input of array from user
        for(int i = 0 ; i <= lengthOfArray-1 ; i++){
            System.out.printf("Enter element at index %d --> ",i);
            num[i] = sc.nextInt();
        }

        //created array
        for(int i = 0 ; i <= lengthOfArray-1 ; i++){
            System.out.println(num[i]);
        }

        //sorting
        for(int i = 0;i <= lengthOfArray-1;i++){

            for(int j = 0;j <= lengthOfArray-1;j++){

                if(num[j] > num[i]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }

            }

        }

        //Sorted Array
        System.out.println("Sorted Array : ");
        for(int i = 0 ; i <= lengthOfArray-1 ; i++){
            System.out.println(num[i]);
        }

        //Second Largest Number :
        System.out.println("Second largest Num : " + num[lengthOfArray-2]);


    }
}
 */

/*
 public static void main(String[] args) {
        int[] a= {1, 7, 3, 9, 2};
        int l=a.length;
        int temp;
        System.out.println("before sorting:"+ Arrays.toString(a));

        for(int i=0 ; i<l-1; i++) // number of passess
        {
            for(int j=0; j<l-1;j++) // number of passes in each iteration
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            }
        System.out.println("After sorting:"+ Arrays.toString(a));
        System.out.println("second highest number in an array is:"+a[l-2]);
    }
}
 */