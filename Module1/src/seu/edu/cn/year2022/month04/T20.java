package seu.edu.cn.year2022.month04;

import java.util.Stack;

public class T20 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        System.out.println(stack.peek());
        stack.push(3);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

    }
}
