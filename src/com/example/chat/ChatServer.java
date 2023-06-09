package com.example.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatServer {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        List<PrintWriter> outList = Collections.synchronizedList(new ArrayList<>());

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("connect: " + socket);

            ChatThread chatThread = new ChatThread(socket, outList);
            chatThread.start();
        }
    }

}

class ChatThread extends Thread {

    private Socket socket;
    private List<PrintWriter> outList;
    private PrintWriter out;
    private BufferedReader in;


    public ChatThread(Socket socket, List<PrintWriter> outList) {
        this.socket = socket;
        this.outList = outList;

        try {
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            outList.add(out);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void run() {
        super.run();

        String line = null;
        try {
            while ((line = in.readLine()) != null) {
                for (int i = 0; i < outList.size(); i++) {
                    PrintWriter pw = outList.get(i);
                    pw.println(line);
                    pw.flush();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally { //접속이 끊어질때
            try {
                outList.remove(out);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            for (int i = 0; i < outList.size(); i++) {
                PrintWriter pw = outList.get(i);
                pw.println("some client disconnected!");
                pw.flush();
            }
            try {
                socket.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }


    }
}