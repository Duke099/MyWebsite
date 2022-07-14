package com.company;
//Q: Find Ceiling; Ceiling = number greater or equal to target.
public class A29_Binary_CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int target = 3;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }

    //My code using Binary loop

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        int mid = start + (end - start)/2;

        while (start <= end) {
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            return arr[start];
        }
        return arr[start];
    }

//    //My Code using for loop
//    static int ceiling(int[] arr,int target){
//        for (int i = 0; i < arr.length; i++) {
//            int ceiling = arr[i];
//            if (ceiling >= target) {
//                return ceiling;
//            }
//        }
//        return -1;
//    }









}
