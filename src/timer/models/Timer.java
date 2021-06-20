package timer.models;

public class Timer {
    private int minute;
    private int second;

    public Timer(int minute, int second) {
        this.minute = minute;
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void decrementMinute() {
        minute--;
    }

    public void decrementSecond() {
        second--;
    }
}
