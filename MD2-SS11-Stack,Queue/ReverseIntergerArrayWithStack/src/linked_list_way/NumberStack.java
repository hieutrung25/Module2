package linked_list_way;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class NumberStack<T> {
    public LinkedList<T> stack;
    public NumberStack(){
        stack = new LinkedList<T>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty() {
        if (stack.size()==0){
            return true;
        }
        return false;
    }

}
