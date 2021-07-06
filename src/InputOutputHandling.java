//Input/Output handling.
//
//        Java.IO package - This is all the classes required for input and output operation. Procees the input and produce the output.
//
//
//        Stream is sequence of data :compiler to transit binary code(ex:0101)
//        In Java data is all about in stream format ( example system.out.print : to print the output)- produce the output to console
//        2.System.in -which is Input from the console.
//        3. system.err - it's error stream
//
//
//        Input stream class: Reading data from any file, array, network socket called Input stream class.
//File output stream class methods:
//
//        methods:
//
//        1. write() - to write content to the file
//        2. close() - to close the connection
//
//        Create an obj for file output stream:
//        FileOutputStream obj = new FileOutputStreamOf("location of file ex:/c/filename")

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InputOutputHandling {

    public static void main(String[] args) {
        try {
            FileOutputStream OS = new FileOutputStream("C:/Users/e678332/JavaProgrammingPractice/file.txt");
            String s = "file output stream example";
            byte[] b = s.getBytes();
            OS.write(b);
            OS.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
