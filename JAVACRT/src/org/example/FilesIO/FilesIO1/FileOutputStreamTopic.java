package org.example.FilesIO.FilesIO1;

import java.io.FileOutputStream;

public class FileOutputStreamTopic {

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\JAVAFULLSTACK\\JAVACRT\\src\\org\\example\\FilesIO\\File.txt");
            String a = "Hello World";
            byte  b[]  = a.getBytes();
            fileOutputStream.write(b);

            fileOutputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
