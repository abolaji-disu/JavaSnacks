package Exercises.Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class ChunkOfData {
    public static void main(String[] args) {
//        try{
//            byte[] input = new byte[20];
//            System.in.read(input);
//            for (int i = 0; i < input.length; i++) {
//                System.out.write(input[i]);
//            }
//            System.out.flush();
//        }catch (IOException e){
//            System.out.print(e);
//        }
//    }
        FileInputStream fileInputStream = null;
        try {
             fileInputStream = new FileInputStream("src/Exercises/Streams/newfile.txt");
            byte[] readfile = new byte[fileInputStream.available()];
            fileInputStream.read(readfile);
            for (int i = 0; i < readfile.length; i++) {
                System.out.write(readfile[i]);
            }
            System.out.flush();
        }catch (IOException e){
            System.out.println(e);
        }finally{
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
