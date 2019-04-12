package com.company;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Download implements Runnable {
    private URL url;
    private String filename;

    public Download(String filename, String ur) throws IOException {
        url = new URL(ur);
        this.filename = filename;


    }

    @Override
    public void run() {
        InputStream inputStream = null;
        try {
            inputStream = url.openStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            Path path = new File(Config.getFoldername() + "/" + filename).toPath();
            if (Files.exists(path)) {
                Files.delete(path);
                Files.copy(bufferedInputStream, path);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
