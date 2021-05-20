package stack_way;

import java.util.Iterator;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack();
        int[] array = {1, 2, 3, 4, 5};
        stack1.push(array[0]);
        stack1.push(array[1]);
        stack1.push(array[2]);
        stack1.push(array[3]);
        stack1.push(array[4]);
        Iterator<Integer> iterator1 = stack1.iterator();
        while (iterator1.hasNext()) {
            System.out.println("Stack1: " + iterator1.next());
        }
        Stack<Integer> stack2 = new Stack<Integer>();
        for (int i = 0; i < 5; i++) {
            int removeOnes = stack1.pop();
            stack2.push(removeOnes);
        }
        Iterator<Integer> iterator2 = stack2.iterator();
        while (iterator2.hasNext()) {
            System.out.println("Stack2: " + iterator2.next());
        }
    }
}
