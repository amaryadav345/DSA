package org.example.TestCodes;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Fileread {

    public static void main(String[] args) {
        //StringBuilder builder = new StringBuilder();
        String path = "D:\\code\\Java\\Scaler\\src\\main\\java\\org\\example\\TestCodes\\Testfile.txt";
        try (
                BufferedReader br
                        = new BufferedReader(new FileReader(path))) {

            // Declaring a new string
            String str;

            // It holds true till threre is content in file
            while ((str = br.readLine()) != null) {

                // Printing the file data
                String sep=":";
                int pos=str.indexOf(sep);
                System.out.println(str.substring(pos+sep.length()));
               // System.out.println("debug");
            }
        }

        // Catch block to handle the exceptions
        catch (
                IOException e) {

            // Display pop up message if exceptionn occurs
            System.out.println(
                    "Error while reading a file.");
        }

    }
}
