package timer.models;

import timer.services.TimerService;

public class TimerThread extends Thread {
    Timer timer;

    public TimerThread(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        while (timer.getMinute() >= 0) {
            System.out.println(TimerService.formatTimeToDecimal(timer));
            timer.decrementSecond();
            if (timer.getSecond() < 0) {
                timer.setSecond(59);
                timer.decrementMinute();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
