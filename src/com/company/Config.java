package com.company;

import java.util.Map;

public class Config {
    private static int numofthreads;
    private static Long speed;
    private static String filepath;
    private static String foldername;
    private static Map<String, String> filenameAndUrl;
    public static int buffersize = 100000;

    public static Map<String, String> getFilenameAndUrl() {
        return filenameAndUrl;
    }

    public static void setFilenameAndUrl(Map<String, String> filenameAndUrl) {
        Config.filenameAndUrl = filenameAndUrl;
    }

    public static int getNumofthreads() {
        return numofthreads;
    }

    public static void setNumofthreads(String numofthreads) {
        Config.numofthreads = Integer.parseInt(numofthreads);
    }

    public static Long getSpeed() {
        return speed;
    }

    public static void setSpeed(String speed) {
        Config.speed = Long.parseLong(speed);
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
}
