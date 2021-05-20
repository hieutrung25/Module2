import java.util.Calendar;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    Calendar celendar = Calendar.getInstance();
    long currenTime = celendar.getTimeInMillis();

    public void start() {
        this.startTime = currenTime;
    }

    public void stop() {
        this.endTime = currenTime;
    }

    public StopWatch() {
    }

    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }
}
