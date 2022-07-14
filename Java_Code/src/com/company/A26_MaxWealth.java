package com.company;

public class A26_MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6,7,8},
                {9,10,171,12},
                {15,14,13,18}
        };
        int ans = maximumwealth(arr);
        System.out.println(ans);
    }

    static int maximumwealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum =0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];//This is equal to sum = sum+accounts[person][account]
            }
            if (sum > ans)  {
                ans = sum;
            }

        }
        return ans;
    }

}
