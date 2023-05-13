package com.lavish;

import java.util.Arrays;
import java.util.Collections;

public class prr {

    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0.0;
        for(int  i =0; i<salary.length; i++) {
            sum = sum + salary[i];

        }
        return (sum - (salary[0] + salary[salary.length-1])) / salary.length-2;

    }
    public int arraySign(int[] nums) {
        int ans = 1;
        for(int i: nums) {
            if(i==0) {
                return 0;
            }
            if(i<0) {
                ans = -ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] process = {1,2,3,4,5};
        int[] arrivaltime = {0};

        int n;


    }
}
