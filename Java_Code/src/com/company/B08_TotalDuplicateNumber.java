package com.company;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B08_TotalDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,3,2,7,8,2,3,1,2};
        int ans = cyclic(arr);
        System.out.println(ans);

        cyclic((arr));
        System.out.println(Arrays.toString(arr));
    }

    static int cyclic(int[] arr) {
        int i =  0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]) {
                swap(arr, correct, i);
            }
            else {
                i++;
            }

        }

        //search for missing multiple numbers
//        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1 ) {
                sum = sum+1;
            }
        }
        return sum;
    }
    static void swap(int[] arr, int correct, int i) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;

    }
}
