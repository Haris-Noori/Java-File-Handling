package com.fileHandling;

import java.io.File;    //import the file class
import java.io.IOException;    //import the IO Exception class to handle errors


public class createFile {

     public static void main(String[] args) {
        try
        {
            File myFile = new File("testFile.txt");
            if(myFile.createNewFile())    //if new file is created
            {
                System.out.println("File created: " + myFile.getName());
            }
            else    //if already exists
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occured..");
            e.printStackTrace();
        }
    }
}
