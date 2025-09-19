package org.example.FilesIO;

public class FilesIO {
    /**
     * """""""File Handling and IO Streams"""""""
     *
     * JAVAI/O (input and output)
     *
     * inputStream ---> reading
     * outputStream ---> writing
     *
     * java.io package (all classes are abstract and methods are abstract and some have code block)
     *
     * FileIO
     * FileinputStream --- reading
     * FileoutStream --- writting
     *
     * Byte outputStream
     * Character outputStream ----> readerclass writerclass
     *
     * */



    /**
     * There are 6 steps
     * 1.Add import.java.io.*;
     * 2.Create OutputStream calss Object.(this is not possible because this class os abstract)
     * So,we have to create object for subclasses based on the sourc -->we will create object for FileOutputStream.
     *
     * FileOutputStream fos = new FileOutputStream();
     *
     * 3.invoke fos.write(data); to store data into the fileand read()method
     * 4.invoke fos.flush(); to flush data into the file
     * 5.invoke fos.close(); to close the connection or stram Object
     * 6.Handle the exception ===> IOException,
     * FileNotFoundException
     * */


//    print A and B in the file
}
