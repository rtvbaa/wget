package com.company;

import java.io.IOException;
import java.util.Date;

import static com.company.FileInStream.fileInStream;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        Parser.parser(args);
        fileInStream();

        Threads.threadsdownloads();

    }
}
