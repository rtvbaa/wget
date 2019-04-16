package com.company;

import java.io.*;
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
        try {
            InputStream inputStream = url.openStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            Path path = new File(Config.getFoldername() + "/" + filename).toPath();
            if (Files.exists(path)) {
                Files.delete(path);
            }

            File file = new File(Config.getFoldername() + "/" + filename);
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            byte[] buffer = new byte[100];

            SpeedLimit.start();
            while (inputStream.available() > 0)
            {
                int count = inputStream.read(buffer);
//                System.out.println(count);
                fileOutputStream.write(buffer, 0, count);
                while (SpeedLimit.finish() < 200){
                    wait(1000);
                    System.out.println(SpeedLimit.finish());
                }
            }
            System.out.println(SpeedLimit.finish());
            fileOutputStream.close();

        } catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}