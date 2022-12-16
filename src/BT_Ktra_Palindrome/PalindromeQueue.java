package BT_Ktra_Palindrome;

import java.util.*;

public class PalindromeQueue {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter String");
        String inPut = scanner.nextLine();

        for (int i = 0; i < inPut.length(); i++) {
            queue.add(inPut.charAt(i));
            stack.push(inPut.charAt(i));
        }
        String outPutStack="";
        String outPutQueue="";
       while (!queue.isEmpty()){
           outPutQueue+=queue.remove();
       }
        System.out.println("outPutQueue = "+ outPutQueue);
        while (!stack.isEmpty()){
            outPutStack +=stack.pop();
        }
        System.out.println("outPutStack = "+ outPutStack);

        if (outPutQueue.equals(outPutStack)){
            System.out.println("True");
        }else {
            System.out.println("false");
        }

    }
}
