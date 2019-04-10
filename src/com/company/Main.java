package com.company;

import java.io.IOException;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        Parser.parser(args);
        for (Map.Entry entry : FileInStream.fileInStream().entrySet()) {
            Cofig.setUrl(entry.getKey().toString());
            Cofig.setFilename(entry.getValue().toString());

        }
        System.out.println(Cofig.getNumofthreads());
        System.out.println(Cofig.getSpeed());
        System.out.println(Cofig.getFilepath());
        System.out.println(Cofig.getFoldername());
        System.out.println(Cofig.getUrl());
        System.out.println(Cofig.getFilename());

        Threads.threadsdownloads();
    }
}
