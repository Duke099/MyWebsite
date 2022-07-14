package MathsCodes;

import java.util.Arrays;

public class A2_ExclusiveNumber {

    public static void main(String[] args) {

        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(ans(arr));

    }

    public static int ans(int[] arr) {
        int Exclusive = 0;

        for (int n : arr) {
            Exclusive ^= n;
        }
        return Exclusive;

    }
}
