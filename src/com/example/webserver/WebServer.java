package com.example.webserver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(10000);
        System.out.println("대기중");
        try {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("클라이언트 접속");

//                run(clientSocket);
                ClientThread ct = new ClientThread(clientSocket);
                ct.start();
            }
        } finally {
            serverSocket.close();
        }


    }


}

class ClientThread extends Thread {

    private Socket clientSocket;

    public ClientThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        super.run();
        try {
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream));

            String firstLine = br.readLine();
            System.out.println(firstLine);

            String msg = "";
            if (firstLine.indexOf("/hello") >= 0) {
                msg = "hello";
            } else if (firstLine.indexOf("/hi") >= 0) {
                msg = "hi";
            } else {
                msg = "empty";
            }

            String line = null;

            while (!(line = br.readLine()).equals("")) {
                System.out.println(line);
            }

            System.out.println("응답을 한다.");

            //header
            pw.println("HTTP/1.1 200 OK");
            pw.println("name: kim");
            pw.println("email: kim@dong.keun");
            pw.println();
            pw.flush();

            //response body
            pw.println("<html");
            pw.println("<h1>" + msg + " response</h1>");
            pw.println("</html");
            pw.flush();

            pw.close();
            br.close();
            clientSocket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}