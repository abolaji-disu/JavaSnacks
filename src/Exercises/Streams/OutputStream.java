package Exercises.Streams;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class OutputStream {
    public static void main(String[] args)  {
//        for (int i = 0; i < 127; i++) {
//            System.out.write(i);
//        }
//        System.out.flush();
//    }

        String bolaji = "Bolaji is a cool guy";
        byte[] data = bolaji.getBytes();
        try {
            System.out.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.close();
        }
        System.out.flush();
    }
}


