package com.company;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;

public class Download {
    public static void downloadFile() throws IOException {
        URL url = new URL("https://www.google.com.ua/images/srpr/logo11w.png");
        InputStream inputStream = url.openStream();
        Files.copy(inputStream, new File("Download/google.png").toPath());
    }

}
