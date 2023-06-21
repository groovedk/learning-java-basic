package com.example.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExam {

    public static void main(String[] args) throws Exception {
        User user = new User("groovedk@gmail.com", "Groovedk", 1981);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/tmp/user.dat"));
        out.writeObject(user);
        out.close();
    }

}
