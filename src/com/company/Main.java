package com.company;

import java.io.IOException;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        Parser.parser(args);
        for (Map.Entry entry : FileInStream.fileInStream().entrySet()) {
            Config.setFilename(entry.getKey().toString());
            Config.setUrl(entry.getValue().toString());

            System.out.println(Config.getNumofthreads());
            System.out.println(Config.getSpeed());
            System.out.println(Config.getFilepath());
            System.out.println(Config.getFoldername());
            System.out.println(Config.getUrl());
            System.out.println(Config.getFilename());

            Threads.threadsdownloads();
        }

    }
}
