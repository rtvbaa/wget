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
        if (Files.exists(new File(Cofig.getFoldername() + Cofig.getFilename()).toPath())) {
            Files.delete(new File(Cofig.getFoldername() + Cofig.getFilename()).toPath());
        }
        Files.copy(inputStream, new File(Cofig.getFoldername() + Cofig.getFilename()).toPath());
    }

}
