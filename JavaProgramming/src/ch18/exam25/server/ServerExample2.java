package ch18.exam25.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            // ServerSocket 생성
            serverSocket = new ServerSocket();
            // 포트와 바인딩
            serverSocket.bind(new InetSocketAddress(50001));
            // 연결 기다리기
            while (true) {
                Socket socket = serverSocket.accept();
                // 클라이언트의 정보 얻기

                // 통신 하기
                InputStream is = socket.getInputStream();
                byte[] data = new byte[100];
                int readBytes = is.read(data);
                if (readBytes == -1) {
                    throw new IOException("클라이언트가 정상 종료됨");
                }
                String strData = new String(data, 0, readBytes, "EUC-KR");
                System.out.println("받은 데이터 : " + strData);

                OutputStream os = socket.getOutputStream();
                data = strData.getBytes();
                os.write(data);
                os.flush();
                System.out.println("데이터 보내기 성공");

                //연결 끊기
                socket.close();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        // ServerSocket이 50001을 현재 사용하고 있느냐?
        if (serverSocket != null && !serverSocket.isClosed()) {
            // ServerSocket 닫기 (50001번을 해제한다.)
            try {
                serverSocket.close();
            } catch (IOException ex1) {
            }
        }
    }
}
