package Exercises.Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOSimpleApp {
    public static void main(String[] args) {

        FileInputStream fin = null;
        FileOutputStream fout = null;
        try{
            fin = new FileInputStream("src/Exercises/Streams/files/first.txt");
            fout = new FileOutputStream("src/Exercises/Streams/files/second.txt");
          byte[] data = fin.readAllBytes();
          fout.write(data);
        }catch (IOException e){
            System.out.println(e);
        }finally {
            try{

                fout.close();
                fin.close();
            }catch (IOException e){
                System.out.println(e);
            }
        }

    }
}
