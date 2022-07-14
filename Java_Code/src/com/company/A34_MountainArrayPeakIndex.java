package com.company;

//Q: (Q-852--LeetCode)--Find peak in mountain array
public class A34_MountainArrayPeakIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9,45,3,2,5,7,99,120};
        System.out.println(find(arr));
    }
    static int find(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        for (int row = 0; row < end; row++) {
            int big = Integer.MIN_VALUE;
            if (arr[row]>big) {
                big = arr[row];
            }
            return big;
        }
        return -1;
    }
}
