package org.example.TestCodes;
import java.io.*;

public class Fileread {

    public static void main(String[] args) throws IOException {
        //StringBuilder builder = new StringBuilder();
        String path = "D:\\code\\Java\\Scaler\\src\\main\\java\\org\\example\\TestCodes\\Testfile.txt";
        String outfileName="D:\\code\\Java\\Scaler\\src\\main\\java\\org\\example\\TestCodes\\Outfile.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(outfileName));
        try (
                BufferedReader br
                        = new BufferedReader(new FileReader(path))) {

            // Declaring a new string
            String str;

            while ((str = br.readLine()) != null) {

                // Printing the file data
                String sep=":";
                int pos=str.indexOf(sep);
                String s2=str.substring(pos+sep.length());
                System.out.println(s2);
                writer.write(s2);
                writer.newLine();


            }
                writer.close();
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
