package Exercises.Streams;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileInputStreamPractice {
    public static void main(String[] args) throws IOException {
        //Get input from files
//        try {
//            FileInputStream fileInputStream = new FileInputStream("src/Exercises/Streams/newfile.txt");
//            byte[] inputFromFile = new byte[fileInputStream.available()];
//            fileInputStream.read(inputFromFile);
//            System.out.write(inputFromFile);
//            System.out.flush();
//            System.out.println(Arrays.toString(inputFromFile));
//
//
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//        //Write Output to files
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("src/Exercises/Streams/outputStreams");
//
//            int[] readme = new int[System.in.read()];
//          //  fileInputStream.read(readme);
//            for (int i = 0; i < readme.length; i++) {
//                readme[i] = System.in.read();
//            }
//            for (int j : readme) {
//                fileOutputStream.write(j);
//            }
////            System.out.println(Arrays.toString(readme));
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        //file Streams

        //File input Streams
        FileInputStream input = null;
        try{
            input = new FileInputStream("src/Exercises/Streams/files/thing.txt");
          byte[] data  = input.readAllBytes();
          System.out.write(data);
            System.out.flush();
        }catch (IOException e){
            System.out.println(e);
        }finally {
            input.close();
        }

    }
}
