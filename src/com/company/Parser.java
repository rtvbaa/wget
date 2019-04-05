package com.company;

public class Parser {
    private static String numofthreads;
    private static String speed;
    private static String filepath;
    private static String foldername;
    private static String url;
    private static String filename;

    public static String parser(String[] args) {
        args.toString().trim().split(" +");
        for (int i = 0; i < args.length; i++) {
            param(args[i]);
        }
        System.out.println(filepath);
        return url;
    }

    public static void param(String args) {
        if (args.contains("-n")) numofthreads = args;
        else if (args.contains("-l")) speed = args;
        else if (args.contains("-f")) filepath = args;
        else if (args.contains("-o")) foldername = args;
        else if (args.contains("http")) url = args;
        else filename = args;
    }
}

