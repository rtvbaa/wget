package com.company;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;

public class Download implements Runnable {
    private URL url;
    private String filename;

    public Download(String filename, String ur) throws IOException {
        url = new URL(ur);
        this.filename = filename;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = url.openStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            Path path = new File(Config.getFoldername() + "/" + filename).toPath();
            if (Files.exists(path)) {
                Files.delete(path);
            }

            File file = new File(Config.getFoldername() + "/" + filename);
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            byte[] buffer = new byte[1024];

            long filesize = 0;


            while (inputStream.available() > 0)
            {
                SpeedLimit.start();
                int count = inputStream.read(buffer);
                filesize = filesize + count;
                fileOutputStream.write(buffer, 0, count);
                SpeedLimit.finish();
            }
            Statistics.addBytes(filesize);
            fileOutputStream.close();

        } catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}