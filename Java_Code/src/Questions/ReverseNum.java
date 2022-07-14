package Questions;
//Reverse the number

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 0;

        int count = 0;
        while(n>0) {

            int rem = n%10;
            int temp = num;
            num = (num*10+rem);
            n = n/10;  // This eliminate the last number
        }
        System.out.println(num);

    }

}

