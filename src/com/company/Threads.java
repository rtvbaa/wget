package com.company;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threads {
    public static void threadsdownloads() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(Config.getNumofthreads());
        executor.submit(() -> {
            try {
                Download.downloadFile(Config.getUrl());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
}