package com.company;

import java.io.IOException;

import static com.company.FileInStream.fileInStream;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        Parser.parser(args);

        Cofig.setUrl(FileInStream.fileInStream().get(0));
        Cofig.setFilename(FileInStream.fileInStream().get(1));

        System.out.println(Cofig.getNumofthreads());
        System.out.println(Cofig.getSpeed());
        System.out.println(Cofig.getFilepath());
        System.out.println(Cofig.getFoldername());
        System.out.println(Cofig.getUrl());
        System.out.println(Cofig.getFilename());

        Threads.threadsdownloads();
    }
}
