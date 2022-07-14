package Questions;

import java.util.Scanner;

public class Func_isArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = in.nextInt();
        System.out.println(isArmstrong(a));
//        for (int i = 100; i < 1700; i++) {
//            if (isArmstrong(i)) { // If the number is armstrong print it
//                System.out.print(i + " ");
//            }
//
//        }
    }

//    Print all the 3 digits armstrong numbers
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n>0) {
            int rem = n%10;
            n=n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;


    }

}