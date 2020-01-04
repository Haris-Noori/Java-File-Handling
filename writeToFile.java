package com.fileHandling;

import java.io.File;
import java.io.FileWriter;    //import the file writer class
import java.io.IOException;

public class writeToFile {

    public static void main(String[] args) {
        try {
            FileWriter myFileWriter = new FileWriter("testFile.txt");
            myFileWriter.write("Java is fun to learn, you should try!");
            myFileWriter.close();
            System.out.println("File successfully updated !!");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred...");
            e.printStackTrace();
        }
    }
}
