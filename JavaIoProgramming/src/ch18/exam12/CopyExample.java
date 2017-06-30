package ch18.exam12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream is = new FileInputStream("src/ch18/exam12/Desert.jpg");
        FileOutputStream os = new FileOutputStream("src/ch18/exam12/Desert2.jpg");

        byte[] data = new byte[1024];

        int readBytes = -1;
        while (true) {
            if ((readBytes = is.read(data)) != -1) {
                os.write(data, 0, readBytes);
            } else {
                break;
            }

        }

        os.flush();
        os.close();
        is.close();

    }

}
