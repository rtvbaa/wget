package com.company;

import java.io.IOException;

import static com.company.FileInStream.fileInStream;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        fileInStream();
        Parser.parser(args);
        Threads.threadsdownloads();
    }
}
