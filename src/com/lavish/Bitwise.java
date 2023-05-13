package com.lavish;

import java.util.ArrayList;
import java.util.Arrays;

public class Bitwise {
    public int[] singleNumber(int[] nums) {
        // Code here
        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            ans[i] = (nums[i]);
        }
        return ans;

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};

    }

    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int left = 0;
        int right = n - 1;
        int a = 1;
        while (left < right) {
            ans[left] = a;
            left++;
            ans[right] = -a;
            right--;
            a++;

        }
        return ans;
    }

    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2 * n];
        int s = 0;
        int end = n;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            ans[j] = nums[s++];
            ans[j+1] = nums[end++];
        }
        return ans;
    }
//    public static boolean isLongPressedName(String name, String typed) {
//        name.toLowerCase();
//        typed.toLowerCase();
//
////        int i  =0;
////        int j = 0;
//
//
//    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>(-1);

         int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for(int  i =0; i<n; i++) {
            if(freq[i] > 1) {
                ans.add(i);
            }

        }
        if(ans.isEmpty()) {
            ans.add(-1);
            return ans;
        }
        return ans;

    }


//    public void sumZero(int n) {
//        int ans[] =
//    }
public int pivotIndex(int[] nums) {
    int[] leftsum = new int[nums.length];
    int[] rightsum = new int[nums.length];
    leftsum[0] = nums[0];
    rightsum[nums.length-1] = nums[nums.length-1];
    for(int i = 0; i<nums.length; i++) {
        for(int j = 1; j<nums.length; j++) {
            leftsum[j] += nums[j];
        }
        for(int k = nums.length-2; k>0; k--) {
            rightsum[k] += nums[k];
        }
        if(leftsum[i] == rightsum[i]) {
            return nums[i];
        }
        Arrays.sort(nums);
    }
    return -1;
}





    static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n/x));

            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }
        return root;
    }
    public static void main(String[] args) {
        int[] sample  = new int[4];
//
        for(int  i =0; i<sample.length; i++) {
            System.out.println(sample[i]);
        }
//        isLongPressedName("LAVISH", "MUNJAL");
        System.out.println(sqrt(40));

    }
}
