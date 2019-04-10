package com.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Cofig.getFilepath;

public class FileInStream {


    public static ArrayList<String> fileInStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(getFilepath());
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ArrayList<String> paramListFromFile = new ArrayList<>();
        Scanner scanner = new Scanner(bufferedInputStream);
        while(scanner.hasNext()){
            paramListFromFile.add(scanner.next());
        }
        return paramListFromFile;
    }
}
