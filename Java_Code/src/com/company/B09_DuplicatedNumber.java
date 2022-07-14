package com.company;

//Q:(video 20) (287 - leetcode)


import java.util.Arrays;
//Only for single digits

public class B09_DuplicatedNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,2,2,2,2,2,2};
        int ans = cyclic(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);

    }

    static int cyclic(int[] arr) {
        int i =  0;
        while (i < arr.length) {

            if (arr[i] != i+1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i] ;
                }
            }
            else {
                i++;
            }

        }
        return -1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
