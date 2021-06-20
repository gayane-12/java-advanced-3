package timer.services;

import timer.models.Timer;
import timer.models.TimerThread;

import java.text.DecimalFormat;

public class TimerService {
    public static void countDownStart(Timer timer) {
        TimerThread newTimerThread = new TimerThread(timer);
        newTimerThread.start();
        try {
            newTimerThread.join(timer.getMinute() * 60 * 1000 + timer.getSecond() * 1000 + 3000);
//            the last 3000 milliseconds were added just for our guarantee
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Timer has been ended. Thank you.");
    }

    public static String formatTimeToDecimal(Timer timer) {
        DecimalFormat df = new DecimalFormat("00");
        return df.format(timer.getMinute()) + " : " + df.format(timer.getSecond());
    }
}
