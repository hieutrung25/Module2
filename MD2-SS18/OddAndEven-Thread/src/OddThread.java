public class OddThread extends Thread {
    @Override
    public void run() {
        int number = 1;
        while (number <= 30) {
            if (number % 2 != 0)
                System.out.println(number);
            number++;
            try {
                this.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
