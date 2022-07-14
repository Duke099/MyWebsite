package Assignment;

import java.util.Scanner;

public class A04_LCM {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int lcm;
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: ");
        int b = in.nextInt();

        // maximum number between n1 and n2 is stored in lcm
        lcm = Math.max(a, b);   // (a > b) ? a : b;

        // Always true
        while(true) {
            if( lcm % a == 0 && lcm % b == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
                break;
            }
            ++lcm;
        }
    }
}
