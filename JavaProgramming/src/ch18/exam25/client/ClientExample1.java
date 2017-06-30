package ch18.exam25.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample1 {

    public static void main(String[] args) {
        Socket socket = null;
        try {
            // how1
            // socket = new Socket("192.168.3.34", 50001);

            // how2
            socket = new Socket();
            socket.connect(new InetSocketAddress("192.168.3.34", 50001)); // 연결하고 끊고를 반복하는 작업일 때

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (!socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException ex) {
            }
        }
    }
}
