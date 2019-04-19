package com.company;

import java.io.IOException;
import java.util.Date;

import static com.company.FileInStream.fileInStream;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        Date currentTime = new Date();
        System.out.println(currentTime.getMinutes() + "." + currentTime.getSeconds());

        Parser.parser(args);
        fileInStream();

        Statistics statistics = new Statistics();

        statistics.start();

        Threads.threadsdownloads();

        Date currentTime2 = new Date();
//        System.out.prin0tln(currentTime2.getMinutes() + "." + currentTime2.getSeconds());
        statistics.showResult();
    }
}
