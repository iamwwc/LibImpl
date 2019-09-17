package com.chaochaogege.LibImpl.interview;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IsValidIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        try {
            InetAddress address = InetAddress.getByName(ip);
            if (address instanceof Inet4Address) {
                System.out.println("IPv4");
            }else if (address instanceof Inet6Address) {
                System.out.println("IPv6");
            }else {
                System.out.println("Neither");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }


}
