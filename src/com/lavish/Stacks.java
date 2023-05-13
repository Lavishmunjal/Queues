package com.lavish;

import java.util.ArrayList;

public class Stacks {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next  = next;
        }
    }
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isempty() {
            return list.size()==0;
        }
        public static void push(int x) {
            list.add(x);
        }
        public static int pop() {
            if(isempty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek() {
            if(isempty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
        }



    }
}
