package com.company;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;

public class Download {
    public static void downloadFile(String ur) throws IOException {
        URL url = new URL(ur);
        InputStream inputStream = url.openStream();
        Files.copy(inputStream, new File("Download/" + Cofig.getFilename()).toPath());
    }

}
