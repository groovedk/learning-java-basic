package com.example.chat2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatThread extends Thread {

    private String name;
    private BufferedReader br;
    private PrintWriter pw;
    private Socket socket;
    List<ChatThread> list;


    public void sendMessage(String msg) {
        pw.println(msg);
        pw.flush();
    }

    @Override
    public void run() {
        super.run();
        //broadcast

        try {
            broadcast(name + " connect", false);
            String line = null;
            try {
                while ((line = br.readLine()) != null) {
                    if ("/quit".equals(line)) {
                        break;
                    }
                    broadcast(name + " : " + line, false);

                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            broadcast(name + " disconnect!!", false);
            this.list.remove(this);
            try {
                br.close();
            } catch (Exception ex) {

            }
            try {
                pw.close();
            } catch (Exception ex) {

            }
            try {
                socket.close();
            } catch (Exception ex) {

            }
        }
    }

    public ChatThread(Socket socket, List<ChatThread> list) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

        this.br = br;
        this.pw = pw;
        this.socket = socket;
        this.name = br.readLine();
        this.list = list;
        this.list.add(this);


    }

    private void broadcast(String msg, boolean includeMe) {
        List<ChatThread> chatThreads = new ArrayList<>();

        for (int i = 0; i < this.list.size(); i++) {
            chatThreads.add(list.get(i));
        }

        Collections.copy(chatThreads, this.list);
        try {
            for (int i = 0; i < chatThreads.size(); i++) {
                ChatThread ct = chatThreads.get(i);
                if (!includeMe) {
                    if (ct == this) {
                        continue;
                    }
                }

            }
        } catch (Exception ex) {
            System.out.println("//");
        }
    }
}
