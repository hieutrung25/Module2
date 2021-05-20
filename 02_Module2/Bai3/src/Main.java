
public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        long realStart = stopWatch.getStartTime();
        int[] array = new int[10000];
        for (int i=1; i < array.length; i++){
            array[i] = (int) Math.round(Math.random()*10000);
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i] + "\n";
        }
        System.out.println(str);
        stopWatch.stop();
        long realStop = stopWatch.getEndTime();
        System.out.println("Start Time: " + realStart);
        System.out.println("Stop time: " + realStop);
        long elapse = realStart - realStop;
        System.out.println("Elapsed time is: " + elapse);
    }
}
