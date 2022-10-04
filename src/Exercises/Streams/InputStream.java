package Exercises.Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
//        try {
//            int[] data =  new int[10];
//            for (int i = 0; i < data.length; i++) {
//                data[i] = System.in.read();
//            }
//            System.out.println("Input collected");
//            for (int i = 0; i < data.length; i++) {
//                System.out.write(data[i]);
//            }
//            System.out.flush();
//        } catch (IOException e) {
//            System.out.println(e);
//        }


        // -1 means end of input

            try {
                FileInputStream input = new FileInputStream("src/Exercises/Streams/newfile.txt");
                while(true){
                    int data = input.read();
                    if(data == -1) {
                        System.out.println("End of Stream");
                        break;
                    }
                    else{
                        System.out.write(data);
                    }
                    System.out.flush();
                }
            } catch (IOException e) {
                System.out.println(e);
            }

    }
}
