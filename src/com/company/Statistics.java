package com.company;

import java.util.Date;

public class Statistics {

    long  bytes;

    Date start;

    Date finish;

    public void showResult() {
        System.out.println(bytes / (start - finish));
    }

    public void start() {
        start = new Date();
    }
}
