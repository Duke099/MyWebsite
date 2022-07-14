package com.company;

public class A28_1_OrderAgnosticBinarySearch_RubbishCode { //here array is sorted but order(Ascending or Descending) is unknown to the user.
    public static void main(String[] args) {
        int[] arr = {-10,-2,15,26,38,44,54,78,114,156,236,345,389};
        //To know whether the order is ascending or descending then we compare first & last nummbers.
        //What if many number repeats and the two numbers you choose happens to be the same numbers thats why first and last.
        int target = 54;
        int ans = search(arr, target);
        System.out.println(ans);

    }
    static int search(int[] arr, int target) {
        int Startposition = 0;
        int endposition = arr.length-1;
        int start = arr[0];
        int end = arr[arr.length-1];
        int mid = Startposition + (endposition - Startposition) / 2;

        while (true) {
            if (end > start) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

                else if (start > end) {
                    if (target > arr[mid]) {
                        end = mid - 1 ;
                    } else if (target < arr[mid]) {
                        start = mid + 1;
                    }else {
                        return mid;
                    };
                }
            }
//        return -1;

        }
    }
