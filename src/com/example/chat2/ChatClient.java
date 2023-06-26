package com.example.chat2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("usage: java com.example.chat2.ChatClient Nickname");
            return;
        }

        String name = args[0];
        Socket socket = new Socket("127.0.0.1", 8888);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        // 닉네임 전송
        pw.println(name);
        pw.flush();

        //백라운드에서 서버가 보내준 메세지를 읽어 화면에 출력함
        InputThread inputThread = new InputThread(br);
        inputThread.start();

        //입력 메세지 서버 전송
        try {
            String line = null;
            while ((line = kb.readLine()) != null) {
                if ("/quit".equals(line)) {
                    pw.println("/quit");
                    pw.flush();
                    break;
                }
                pw.println(line);
                pw.flush();
            }
        } catch (Exception ex) {
            System.out.println(" 메세지 전송오류............... ");
        }

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

class InputThread extends Thread {

    BufferedReader br;

    public InputThread(BufferedReader br) {
        this.br = br;
    }

    @Override
    public void run() {
//        super.run();

        try {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
        } catch (Exception ex) {
            System.out.println(" ............... ");
        }

    }
}