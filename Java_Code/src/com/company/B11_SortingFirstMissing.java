package com.company;

//Q:(6-Video-20) (41 - leetcode)

import java.util.Arrays;

public class B11_SortingFirstMissing {
    public static void main(String[] args) {
        int[] arr = {3,1};
        int ans = cyclic(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }

    static int cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap2(arr, i, correct);
            }
            else{
                i++;
            }
        }

        for(int index = 0; index<arr.length; index++) {
            if (arr[index] != index + 1) {
                return index+1;
            }
        }
        return arr.length + 1;
    }
    static void swap2(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
