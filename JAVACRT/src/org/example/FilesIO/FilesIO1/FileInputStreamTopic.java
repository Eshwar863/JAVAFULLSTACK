package org.example.FilesIO.FilesIO1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTopic {
    public static void main(String[] args) throws IOException {
        try{
            FileInputStream fileInputStream = new FileInputStream("C:\\JAVAFULLSTACK\\JAVACRT\\src\\org\\example\\FilesIO\\File.txt");
//            int i = fileInputStream.read(); /// to read a single char
//            System.out.println((char) i);
//            fileInputStream.close();
            ///  to read multiple lines
            int j = 0;
            while ((j=fileInputStream.read())!=-1){
                System.out.print((char)j);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
