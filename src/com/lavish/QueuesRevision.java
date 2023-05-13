package com.lavish;

import java.util.*;

public class QueuesRevision {
    public static void main(String[] args) {
        queu();
    }
    public static void queu() {
        Queue<Integer> q = new LinkedList<>() {
        };
        q.add(2);
        q.add(3);
        q.add(23);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
    public static void queuUsingtwostack() {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        if(s1.isEmpty()) {
//            return s1.isEmpty();
        }
    }
}
