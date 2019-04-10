package com.company;

public class Parser {

    public static void parser(String[] args) {
        args.toString().trim().split(" +");
        for (int i = 1; i < args.length; i++) {
            param(args[i-1], args[i]);
        }
    }

    public static void param(String argm1, String arg) {
        if (argm1.contains("-n")) Cofig.setNumofthreads(arg);
        else if (argm1.contains("-l")) Cofig.setSpeed(arg);
        else if (argm1.contains("-f")) Cofig.setFilepath(arg);
        else if (argm1.contains("-o")) Cofig.setFoldername(arg);
//        else if (argm1.contains("http")) Cofig.setUrl(arg);
//        else Cofig.setFilename(arg);
    }
}

