package com.company;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Download {


    public static void downloadFile(String filename, String ur) throws IOException {
        URL url = new URL(ur);
        InputStream inputStream = url.openStream();
        Path path = new File(Config.getFoldername() + "/" + filename).toPath();
        if (Files.exists(path)) {
            Files.delete(path);
        }
        Files.copy(inputStream, path);
    }

}
