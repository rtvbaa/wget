package com.company;

public class Cofig {
    private static String numofthreads;
    private static String speed;
    private static String filepath;
    private static String foldername;
    private static String url;
    private static String filename = "google.png";

    public static String getNumofthreads() {
        return numofthreads;
    }

    public static void setNumofthreads(String numofthreads) {
        Cofig.numofthreads = numofthreads;
    }

    public static String getSpeed() {
        return speed;
    }

    public static void setSpeed(String speed) {
        Cofig.speed = speed;
    }

    public static String getFilepath() {
        return filepath;
    }

    public static void setFilepath(String filepath) {
        Cofig.filepath = filepath;
    }

    public static String getFoldername() {
        return foldername;
    }

    public static void setFoldername(String foldername) {
        Cofig.foldername = foldername;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        Cofig.url = url;
    }

    public static String getFilename() {
        return filename;
    }

    public static void setFilename(String filename) {
        Cofig.filename = filename;
    }
}
