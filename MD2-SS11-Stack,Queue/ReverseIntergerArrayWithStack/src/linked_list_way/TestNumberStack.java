package linked_list_way;

public class TestNumberStack {
    public static void main(String[] args) {
        NumberStack<Integer> stack1 = new NumberStack<>();
        int[] array = {1,2,3,4,5};
        stack1.push(array[0]);
        stack1.push(array[1]);
        stack1.push(array[2]);
        stack1.push(array[3]);
        stack1.push(array[4]);

        array[0] = stack1.pop();
        array[1] = stack1.pop();
        array[2] = stack1.pop();
        array[3] = stack1.pop();
        array[4] = stack1.pop();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
