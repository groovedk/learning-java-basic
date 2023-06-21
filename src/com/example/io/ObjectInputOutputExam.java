package com.example.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectInputOutputExam {

    public static void main(String[] args) throws Exception {
        User user1 = new User("groovedk@gmail.com", "groovedk", 1981);
        User user2 = new User("groove@gmail.com", "groove", 1982);
        User user3 = new User("dk@gmail.com", "dk", 1983);
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

//        ArrayList<User> list2 = list;
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println("list2.get(i) = " + list2.get(i));
//        }

        ArrayList<User> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
        }

        System.out.println("<<<copy>>>");

        ArrayList<User> list3 = copy(list);

        for (int i = 0; i < list3.size(); i++) {
            System.out.println("list3.get(i) = " + list3.get(i));
        }

        list.remove(2);
        System.out.println("list1.size() = " + list.size());
        System.out.println("list2.size() = " + list2.size());
        System.out.println("list3.size() = " + list3.size());

    }

    private static ArrayList<User> copy(ArrayList<User> list)
        throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);
        out.writeObject(list);
        out.close();
        bout.close();

        byte[] ba = bout.toByteArray();
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(ba));
        ArrayList<User> list3 = (ArrayList) in.readObject();
        in.close();

        return list3;
    }
}
