package ch18.exam24;

import java.net.InetAddress;
import static java.net.InetAddress.getAllByName;
import java.net.UnknownHostException;

public class InetAddressExample {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getLocalHost();
        String address = ia.getHostAddress();
        System.out.println(address);

//        InetAddress iaNaver = InetAddress.getByName("www.naver.com");
//        String addressNaver = iaNaver.getHostAddress();
//        System.out.println(addressNaver);
        InetAddress[] iaNavers = InetAddress.getAllByName("www.naver.com");
        for (InetAddress i : iaNavers) {
            System.out.println(i.getHostAddress());
        }
    }
}
