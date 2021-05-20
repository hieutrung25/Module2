public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head = 0;
    public int tail = -1;
    public int currentSize;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[queueSize];
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }

    public boolean isEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
    //Phương thức enqueue để thêm một đối tượng vào queue
    public void enqueue(int item){
        if (isQueueFull()){
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++; // nếu hàng đợi không đầy, tăng con trỏ để trỏ tới vị trí bộ nhớ trống tiếp theo.
            if (tail == capacity - 1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }
    // dequeue để xoá một đối tượng khỏi queue.
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}