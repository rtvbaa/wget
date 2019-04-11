package com.company;

public class Config {
    private static int numofthreads;
    private static String speed;
    private static String filepath;
    private static String foldername;
    private static String url;
    private static String filename;

    public static int getNumofthreads() {
        return numofthreads;
    }

    public static void setNumofthreads(String numofthreads) {
        Config.numofthreads = Integer.parseInt(numofthreads);
    }

    public static String getSpeed() {
        return speed;
    }

    public static void setSpeed(String speed) {
        Config.speed = speed;
    }

    public static String getFilepath() {
        return filepath;
    }

    public static void setFilepath(String filepath) {
        Config.filepath = filepath;
    }

    public static String getFoldername() {
        return foldername;
    }

    public static void setFoldername(String foldername) {
        Config.foldername = foldername;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        Config.url = url;
    }

    public static String getFilename() {
        return filename;
    }

    public static void setFilename(String filename) {
        Config.filename = filename;
    }
}
