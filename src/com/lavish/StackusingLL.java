package com.lavish;

public class StackusingLL {
    static class Node {
        int data;
       Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
    static class Stack {
        static Node head = null;
        public static boolean isempty() {
            return head==null;
        }
        public static void push(int x) {
            Node newNode = new Node(x);
            if(isempty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop() {
            if(isempty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek() {
            if(isempty()) {
                return -1;
            }
            return head.data;
        }
    }


    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        while(!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
