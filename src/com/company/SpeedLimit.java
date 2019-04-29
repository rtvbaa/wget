package com.company;

import java.util.Date;

public class SpeedLimit {
    private Date finish;
    private Date start;
    private long time;
    private long millis;

    public void start() {
        start = new Date();
    }

    public void finish(long filesize) throws InterruptedException {
        finish = new Date();
        time = finish.getTime() - start.getTime();
        millis = filesize / Config.getSpeed() - time;
        if (millis > 0) Thread.sleep(millis);
    }
}
