package com.company;

public class Parser {

    public static void parser(String[] args) {
        args.toString().trim().split(" +");
        for (int i = 0; i < args.length; i++) {
            param(args[i]);
        }
    }

    public static void param(String args) {
        if (args.contains("-n")) Cofig.setNumofthreads(args);
        else if (args.contains("-l")) Cofig.setSpeed(args);
        else if (args.contains("-f")) Cofig.setFilepath(args);
        else if (args.contains("-o")) Cofig.setFoldername(args);
        else if (args.contains("http")) Cofig.setUrl(args);
        else Cofig.setFilename(args);
    }
}

