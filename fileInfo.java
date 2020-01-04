package com.fileHandling;

import java.io.File;

public class fileInfo {

    public static void main(String[] args) {
        File myFile = new File("testFile.txt");    //you can name/create another file, I am using the previous one

        if(myFile.exists())
        {
            System.out.println("File name: " + myFile.getName());
            System.out.println("Absolute Path: " + myFile.getAbsolutePath());
            System.out.println("Writeable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("File size in bytes: " + myFile.length());
        }
        else
        {
            System.out.println("File not found..");
        }
    }
}
