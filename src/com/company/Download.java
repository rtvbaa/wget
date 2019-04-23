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



        File file = new File(Config.getFoldername() + "/" + filename);
        long filesize = 0;

        try
        {

            if (Files.exists(file.toPath())) {
                Files.delete(file.toPath());
            }

            InputStream inputStream = url.openStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(dataBuffer, 0, 1024)) != -1) {
                filesize = filesize + dataBuffer.length;
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
            System.out.println("Размер файла " + file.length());
            Statistics.addBytes(filesize);
        } catch (IOException e) {
        }
//        try {
//            InputStream inputStream = url.openStream();
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
//
//            Path path = new File(Config.getFoldername() + "/" + filename).toPath();
//            if (Files.exists(path)) {
//                Files.delete(path);
//            }





//            File file = new File(Config.getFoldername() + "/" + filename);
//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//
//            byte[] buffer = new byte[1024];
//
//            long filesize = 0;
//
//
//            while (inputStream.available() > 0)
//            {
////                SpeedLimit.start();
//                int count = inputStream.read(buffer);
////                filesize = filesize + count;
//                fileOutputStream.write(buffer, 0, count);
////                SpeedLimit.finish();
//            }
//            Statistics.addBytes(filesize);
//            fileOutputStream.close();

//        } catch(IOException  e){
//            e.printStackTrace();
//        }
    }
}