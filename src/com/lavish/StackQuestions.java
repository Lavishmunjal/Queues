package com.lavish;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StackQuestions {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        String str = "lavish";
//        System.out.println(reverseS(str));
        String result = reverseS(str);
        System.out.println(result);
        pushatbottom(s,4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
//            s.pop();
        }
        String st = "Hello";
        st.valueOf(s);

    }
    public static String reverseS(String str) {
        Stack<Character> s = new Stack<>();
        int i =0;
        while (i<str.length()) {
            s.push(str.charAt(i));

            i++;

        }
        StringBuilder res = new StringBuilder("");

        while (!s.isEmpty()) {
            char curr = s.pop();
            res.append(curr);
        }
        str = res.toString();
        return str;
    }

    private static void pushatbottom(Stack<Integer> s, int i) {
        if(s.isEmpty()) {
            s.push(i);
            return;
        }
        int top = s.pop();
        pushatbottom(s,i);
        s.push(top);
    }
    public boolean isPerfectSquare(int num) {
        int s = 1;
        int e = num;
        while(s<=e) {
            int mid = s + (e-s)/2;
            if(mid*mid == num) {
                return true;
            }
            if(mid*mid > num) {
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return false;
    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int min = 0;
        int max = 0;
        for(int i =0; i<arr.size()-2;i++) {
            min += arr.get(i);
        }
        for(int i =1;i<arr.size();i++) {
            max += arr.get(i);
        }
        System.out.print(min + " "+ max);

    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int count = 0;
        int max = candles.get(0);

        for(int i = 0; i<candles.size(); i++) {
            if(candles.get(i) >= max) {
                max = candles.get(i);
                count ++;
            }
        }
        return count;
    }
}
