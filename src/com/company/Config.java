package com.company;

import java.util.Map;

public class Config {
    private static int numofthreads = 10;
    private static Long speed = (long)1024*1024 ;
    private static String filepath;
    private static String foldername;
    private static Map<String, String> filenameAndUrl;
    public static int buffersize = 1000;

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
        if (Integer.parseInt(numofthreads) !=  0) {
            Config.numofthreads = Integer.parseInt(numofthreads);
        } else System.out.println("Неверное количество потоков: " + numofthreads + " Загружается 10 потоков");
    }

    public static Long getSpeed() {
        return speed;
    }

    public static void setSpeed(String speed) {
        if (speed != null && speed.length() > 0 && speed.charAt(speed.length() - 1) == 'k') {
            Config.speed = Long.parseLong(speed.substring(0, speed.length() - 1)) * 1024;
        } else
            if (speed != null && speed.length() > 0 && speed.charAt(speed.length() - 1) == 'm') {
                Config.speed = Long.parseLong(speed.substring(0, speed.length() - 1)) * 1024 *1024;
            } else Config.speed = Long.parseLong(speed);
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
