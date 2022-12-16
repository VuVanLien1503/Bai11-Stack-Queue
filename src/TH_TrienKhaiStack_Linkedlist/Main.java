package TH_TrienKhaiStack_Linkedlist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack sau khi pop");
        stack.pop();
        for (Integer i :
                stack) {
            System.out.println(i);
        }
    }
}
