package com.company;

//Q:(Q-1  -  Video 20) (268 - Leetcode)
//There is exception - 0 is present in array.
import java.util.Arrays;
public class B05_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1,4};
        int ans = cyclic(arr);
        System.out.println(ans);
    }

    static int cyclic(int[] arr) {
        int i =  0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, correct, i);
            }
            else {
                i++;
            }

        }
        //search for missing number
        for (int index = 0; index < arr.length-1; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int correct, int i) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;

    }

}
