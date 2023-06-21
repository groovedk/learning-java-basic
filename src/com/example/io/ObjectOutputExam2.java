package com.example.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputExam2 {

    public static void main(String[] args) throws Exception {
        User user1 = new User("groovedk@gmail.com", "groovedk", 1981);
        User user2 = new User("groove@gmail.com", "groove", 1982);
        User user3 = new User("dk@gmail.com", "dk", 1983);
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/tmp/userlist.dat"));
        out.writeObject(list);
        out.close();
    }

}
