package com.example.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class VerySimpleWebServer {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9000);

        System.out.println("접속대기");
        Socket socket = ss.accept();

        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        InputStream in = socket.getInputStream();

        /*
        byte[] buffer = new byte[512];
        int readCount = 0;
        while ((readCount = in.read(buffer)) != -1) {
            System.out.write(buffer, 0, readCount);
        }
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String firstLine = br.readLine();

        List<String> headers = new ArrayList<>();
        String line = null;
        while (!(line = br.readLine()).equals("")) {
            headers.add(line);
        }

        System.out.println("firstLine = " + firstLine);
        for (int i = 0; i < headers.size(); i++) {
            System.out.println(headers.get(i));
        }

        pw.println("HTTP/1.1 200 OK");
        pw.println("name: kim");
        pw.println("email: kim@dong.keun");
        pw.println();
        pw.println("<html");
        pw.println("<h1>html world</h1>");
        pw.println("</html");
        pw.close();

//        System.out.println(socket.toString());

        ss.close();
        System.out.println("서버 종료");
    }

}
