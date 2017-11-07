package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    private FileOutputStream fos;
    public static String fileName = "C:/tmp/result.txt";
    AmigoOutputStream(FileOutputStream fos) throws FileNotFoundException {
        super(fileName);
        this.fos = fos;
    }
    @Override
    public void flush() throws IOException
    {
        fos.flush();
    }

    @Override
    public void write(int b) throws IOException
    {
        fos.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException
    {
        fos.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException
    {
        fos.write(b, off, len);
    }
    public void close() throws IOException {
        fos.flush();
        fos.write("JavaRush © All rights reserved.".getBytes());
        fos.close();
    }
    @Override
    public FileChannel getChannel()
    {
        return fos.getChannel();
    }


    @Override
    public void finalize() throws IOException
    {
        super.finalize();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }


}