package Questions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//    input 3 numbers and check which is greater
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if (b>max) {
//            max=b;
//        }
//        if (c>max) {
//            max=c;
//        }
//        System.out.println(max);

//        Alternate method

//        int max = Math.max(c,Math.max(a,b));
//        System.out.println(max);

//        Alternate Method
        System.out.println(Math.max(c,Math.max(a,b)));

    }


}
