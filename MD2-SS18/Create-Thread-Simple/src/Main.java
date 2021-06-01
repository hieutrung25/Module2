public class Main {
    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator();
        Thread generator1Thread = new Thread(generator1);
        generator1.setName("Generator A");
        generator1Thread.setPriority(Thread.MIN_PRIORITY);

        NumberGenerator generator2 = new NumberGenerator();
        Thread generator2Thread = new Thread(generator2);
        generator2Thread.setPriority(Thread.MAX_PRIORITY);
        generator2.setName("Generator B");

        generator1Thread.start();
        generator2Thread.start();

    }
}
