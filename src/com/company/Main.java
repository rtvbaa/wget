package com.company;

import java.io.FileNotFoundException;

import static com.company.FileInStream.fileInStream;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Parser.parser(args);
        try {
            fileInStream();
            Threads.threadsdownloads();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при чтении файла: " + e);
        }
    }
}
