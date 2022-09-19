package Exercises;

import java.io.*;
import java.util.Arrays;

public class StreamsExercise {
//    public static void main(String[] args) {
//        DataInputStream dataInputStream = new DataInputStream(System.in);
//
//        try{
//            byte [] bytes = new byte[15];
//            dataInputStream.readNBytes(bytes, 0, 8);
//            System.out.println(Arrays.toString(bytes));
//            System.out.print("actual string rep:: ");
//
//           for (byte  b: bytes){
//               if (b != 0) System.out.print((char) b);
//           }
//
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//
//    }

    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            int number = Integer.decode(line);
            System.out.println("my number is :: " + number);
            reader.close();
            bufferedReader.close();
        } catch(IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}

