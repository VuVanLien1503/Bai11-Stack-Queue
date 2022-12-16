package BT_Ktra_DauNgoac;

import java.util.Scanner;
import java.util.Stack;

public class StackBracket {
    public static void main(String[] args) {
        System.out.println( check());
    }
    public static boolean check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Math expression");
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char check = input.charAt(i);
            if (check=='(') {
                stack.push(check);
            } else if (check == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.pop() ==')') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
