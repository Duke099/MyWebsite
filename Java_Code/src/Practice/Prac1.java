package Practice;

import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 4) {
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

}