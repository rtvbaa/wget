package com.company;

import java.util.Date;

public class SpeedLimit {
    private Date finish;
    private Date start;
    private long time;

    public void start() {
        start = new Date();
    }

    public void finish() throws InterruptedException {
        finish = new Date();
        time = finish.getTime() - start.getTime();
        if ((Config.buffersize / Config.getSpeed() - this.time) > 0){
            Thread.sleep(Config.buffersize / Config.getSpeed() - this.time);
        }
    }
}
