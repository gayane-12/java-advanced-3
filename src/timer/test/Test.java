package timer.test;

import timer.exceptions.NonNegativeException;
import timer.models.Timer;
import timer.services.TimerService;

import java.util.Scanner;

public class Test {
    public static void startTimer() throws NonNegativeException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to our Timer App");
        System.out.println("Enter the minutes of timer:");
        int minutesInputted = scan.nextInt();
        System.out.println("Enter the seconds of timer:");
        int secondsInputted = scan.nextInt();
        if (minutesInputted < 0 || secondsInputted < 0) {
            throw new NonNegativeException("Both minutes and seconds must have positive values.");
        }
        if (secondsInputted >= 60) {
            minutesInputted += secondsInputted / 60;
            secondsInputted %= 60;
        }
        Timer timer = new Timer(minutesInputted, secondsInputted);
        TimerService.countDownStart(timer);
    }
}
