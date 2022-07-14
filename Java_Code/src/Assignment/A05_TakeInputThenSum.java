package Assignment;

import java.util.Scanner;

public class A05_TakeInputThenSum {
//    Q: Keep taking numbers as inputs till the user enters ‘0’, after that print sum of all.

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int a =  in.nextInt();
            int sum = 0;
            while (a != 0) {
                a = in.nextInt();
                sum += a;
            }
            if (a == 0) {
                System.out.println(sum);
            }

        }

}
