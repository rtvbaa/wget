package com.company;

public class Parser {
    private static String numofthreads;
    private static String speed;
    private static String filepath;
    private static String foldername;
    private static String url;

    public static String parser(String[] args) {
        args.toString().trim().split(" +");
        if (args[0].contains("-n")) numofthreads = args[0];
        else if (args[0].contains("-l")) speed = args[0];
        else if (args[0].contains("-f")) filepath = args[0];
        else if (args[0].contains("-o")) foldername = args[0];
        else url = args[0];

        System.out.println(url);
        return url;
    }
}
