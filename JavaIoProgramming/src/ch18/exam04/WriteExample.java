package ch18.exam04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
//        String path = WriteExample.class.getResource("test.txt").getPath();
        OutputStream os = new FileOutputStream("src/ch18/exam04/test.txt");
        
//        os.flush();
//        os.close();

    }
}
