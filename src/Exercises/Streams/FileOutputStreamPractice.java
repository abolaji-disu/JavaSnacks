package Exercises.Streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamPractice {
    public static void main(String[] args) {


        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("src/Exercises/Streams/files/pap.txt", true);
            while(true){
                int input = System.in.read();
                if(input == 10){
                    break;
                }else {
                    outputStream.write(input);
                }
            }
//            System.out.flush();


        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
