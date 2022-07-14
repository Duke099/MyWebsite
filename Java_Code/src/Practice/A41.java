package Practice;

import java.util.Arrays;

public class A41 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}


//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
        };
        int target = 15;

        System.out.println(Arrays.toString(search(arr, target)));
//        System.out.println(Arrays.toString(search2(arr, target, 2)));
    }

    static int[] search2(int[][] arr, int target, int start) {

        for (int row = start; row <= start ; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] arr, int target) {

        int r = 0;
        int c = arr.length-1;

        while (r < arr.length && c >= 0) {
            int mid = (r + c) / 2;

            if (arr[r][c] == target) {
                return new int[]{r, c};
            }

            if (arr[r][mid] == target) {

                return new int[]{r, mid};
            }
            if (arr[r][mid] > target) {
                c = mid - 1;
            } else if (arr[r][mid] < target && arr[r][arr.length-1] >= target) {
                return search2(arr, target, r);
            } else if (arr[r][mid] < target) {
                r++;
            }
        }
        return new int[] {-1, -1};
    }

}
