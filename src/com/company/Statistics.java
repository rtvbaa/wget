package com.company;

import java.util.Date;

public class Statistics {

    static long  bytes;

    Date start;

    Date finish;

    public void showResult() {
        System.out.println("Cкорость скачивания " + bytes / (finish.getSeconds() - start.getSeconds()));
    }

    public void start() {
        start = new Date();
    }

    public void finish() {
        finish = new Date();
    }

    public static void addBytes(long bytes) {
        Statistics.bytes = bytes;
    }

}
