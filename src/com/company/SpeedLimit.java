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
        System.out.println(100000000/(Config.getSpeed() - time));
        if (time > 0) {
            Thread.sleep((Config.getSpeed() - time));

        }
//        System.out.print("#");
//        System.out.println(start.getTime());
//        System.out.println(finish.getTime());
    }
}
