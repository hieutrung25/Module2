import java.util.*;

public class Solution {

    public void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.setData(value);
        if (q.getFront() == null)
            q.setFront(temp);
        else
            q.getRear().setLink(temp);

        q.setRear(temp);
        q.getRear().setLink(q.getFront());
    }

    public int deQueue(Queue q) {
        if (q.getFront() == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int value;
        if (q.getFront() == q.getRear()) {
            value = q.getFront().getData();
            q.setFront(null);
            q.setRear(null);
        } else {
            Node temp = q.getFront();
            value = temp.getData();
            q.setFront(q.getFront().getLink());
            q.getRear().setLink(q.getFront());
        }

        return value;
    }

    public void displayQueue(Queue q) {
        Node temp = q.getFront();
        System.out.println("Elements in Circular Queue are: ");
        while (temp.getLink() != q.getFront()) {
            System.out.println(" "+ temp.getData());
            temp = temp.getLink();
        }
        System.out.println(" "+ temp.getData());
    }

}
