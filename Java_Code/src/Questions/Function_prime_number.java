package Questions;

import java.util.Scanner;

public class Function_prime_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number to check for prime: ");
        int a = in.nextInt();
        System.out.println(isPrime(a));
    }
    static boolean isPrime(int n) {
        if (n<=1){
            return false;
        }
        int c=2;
        while (c*c<= n) {
            if (n % c ==0) {
                return false;
            }
            c++;
        }


        if (c*c > n) {
            return true;
        }
        return false;

    }
//          This could be simplified by clicking if.
}
