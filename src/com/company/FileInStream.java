package com.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Cofig.getFileInStream;

public class FileInStream {


    public static void fileInStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(getFileInStream());
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ArrayList<String> set = new ArrayList<>();
        Scanner scanner = new Scanner(fileInputStream);
        while(scanner.hasNextLine()){
            set.add(scanner.nextLine());
        }

        for (String t: set) {
            System.out.println(t);
        }
    }
}
