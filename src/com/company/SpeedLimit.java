package com.company;

public class SpeedLimit {
    private static long finish;
    private static long start;

    public static void start(){
        start = System.currentTimeMillis();


    }

    public static long finish(){

        finish = System.currentTimeMillis() - start;
        return finish;

    }

}
