package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Parser.parser(args);
        Threads.threadsdownloads();
    }
}
