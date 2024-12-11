package utils;

import messages_console.MessageTimeSleepWait;

public class TimeSleepWait {

    public static void waitInMs(Integer milliseconds)  {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            System.out.println(MessageTimeSleepWait.time_sleep_wait + " " + e);
        }
    }

}
