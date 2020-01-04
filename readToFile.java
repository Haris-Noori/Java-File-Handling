package com.fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class readToFile {

    public static void main(String[] args) {
        try
        {
            File myFile = new File("testFile.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine())
            {
                String line = myReader.nextLine();
                System.out.println(line);
            }
            myReader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("An error occurred...");
        }

    }

}