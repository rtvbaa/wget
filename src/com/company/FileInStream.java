package com.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.company.Config.getFilepath;

public class FileInStream {


    public static void fileInStream() throws FileNotFoundException {
        BufferedInputStream bufferedInputStream = null;

        bufferedInputStream = new BufferedInputStream(new FileInputStream(getFilepath()));

        Map<String, String> paramListFromFile = new HashMap<>();
        Scanner scanner = new Scanner(bufferedInputStream);

        while(scanner.hasNextLine()){
            String fileSplit[] = scanner.nextLine().split(" +");
            String url = fileSplit[0];
            String filename = fileSplit[1];
            paramListFromFile.put(filename, url);
        }
        Config.setFilenameAndUrl(paramListFromFile);

    }

}
