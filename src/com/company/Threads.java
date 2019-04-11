package com.company;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threads {
    public static void threadsdownloads() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(Config.getNumofthreads());

        Config.getFilenameAndUrl().forEach((k, v) -> {
            System.out.println(k + " " + v);
            try {
                executor.submit(new Download(k,v));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
//        executor.submit(() -> {
//            for (Map.Entry entry : Config.getFilenameAndUrl().entrySet()) {
//
//                try {
//                    System.out.println("start" + entry);
//                    downloadFile(entry.getKey().toString(), entry.getValue().toString());
//                    System.out.println("stop" + entry);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//
//            }
//        });
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
}