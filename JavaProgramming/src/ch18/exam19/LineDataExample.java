package ch18.exam19;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class LineDataExample {

    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStre("src/ch18/exam19/test.txt");
//        OutputStreamWriter osw = new OutputStream(fos);
//        osw.write("abcde\r\n");
//        osw.write("12345\r\n");
//        osw.write("가나다라마");
//        osw.flush();
//        osw.close();

        FileOutputStream fos = new FileOutputStream("src/ch18/exam19/test.txt");
        PrintStream out = new PrintStream(fos);
        out.println("abcde");
        out.println("123456");
        out.println("가나다마라");
        out.flush();
        fos.flush();
        out.close();
        fos.close();

        FileInputStream fis = new FileInputStream("src/ch18/exam19/test.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
    }
}
