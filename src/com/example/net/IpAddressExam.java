package com.example.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressExam {

    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getLocalHost();
            System.out.println(ia.getHostAddress());
        } catch (UnknownHostException uhe) {
            uhe.printStackTrace();
        }

        System.out.println(" ============== ");

        try {
            InetAddress[] iaArray = InetAddress.getAllByName("www.google.com");

            for (InetAddress inetAddress : iaArray) {
                System.out.println(inetAddress.getHostAddress());
            }
        } catch (UnknownHostException uhe) {
            uhe.printStackTrace();
        }
    }

}
