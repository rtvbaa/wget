package com.company;

public class SpeedLimit {
    private static long finish;
    private static long start;

    public static void start() {
        start = System.currentTimeMillis();
    }

    public static void finish() throws InterruptedException {
        finish = System.currentTimeMillis() - start;
        Thread.sleep(Config.getSpeed() - finish);
    }
}
