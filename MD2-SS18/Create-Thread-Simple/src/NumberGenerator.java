public class NumberGenerator implements Runnable{
    String name;

    @Override
    public void run() {
        int number = 1;
        for (int i=0; i<10; i++){
            System.out.println(number);
            System.out.println(this.name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            number++;
        }
    }

    public void setName(String name){
        this.name = name;
    }
}
