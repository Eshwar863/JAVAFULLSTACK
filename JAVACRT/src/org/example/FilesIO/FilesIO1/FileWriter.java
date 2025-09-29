package org.example.FilesIO.FilesIO1;

import java.io.Writer;

public class FileWriter {
    public static void main(String[] args) {
        try{
            Writer writer = new java.io.FileWriter("C:\\JAVAFULLSTACK\\JAVACRT\\src\\org\\example\\FilesIO\\File.txt");
            String con = "JAVA WRITER CLASS";
            writer.write(con);
            writer.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
