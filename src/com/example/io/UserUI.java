package com.example.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class UserUI {

    private BufferedReader br;

    public UserUI() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int menu() {
        System.out.println("1. 회원등록");
        System.out.println("2. 회원목록보기");

        System.out.println("3. 회원수정");
        System.out.println("4. 회원삭제");

        System.out.println("5. 종료");
        System.out.println();

        int menuId = -1;
        try {
            String line = br.readLine();
            menuId = Integer.parseInt(line);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return menuId;

    }

    public User regUser() {
        try {
            System.out.println("이메일을 입력해 주세요.");
            String email = br.readLine();
            System.out.println("이름을 입력해 주세요.");
            String name = br.readLine();
            System.out.println("생년월일을 입력해 주세요.");
            String strBirthYear = br.readLine();
            int birthYear = Integer.parseInt(strBirthYear);

            User user = new User(email, name, birthYear);
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void printUserList(Iterator<User> iter) {
        System.out.println("email           name        birthOfYear");
        System.out.println("=======================================");

        if (iter == null) {
            System.out.println("등록된 회원이 없습니다");
            System.out.println();
        } else {
//            for (int i = 0; i < users.size(); i++) {
            while (iter.hasNext()) {
                User user = iter.next();

                System.out.print(user.getEmail());
                System.out.print("  ");
                System.out.print(user.getName());
                System.out.print("  ");
                System.out.print(user.getBirthYear());
                System.out.println();
                System.out.println();
            }
        }
    }

    public String inputEmail() {
        System.out.println("수정할 회원의 이메일을 입력해 주세요.");
        String email = "";
        try {
            email = br.readLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return email;
    }

    public User inputUser(String email) {
        try {
            System.out.println(email + " 회원의 정보를 수정합니다. .");
            System.out.println("이름을 입력해 주세요.");
            String name = br.readLine();
            System.out.println("생년월일을 입력해 주세요.");
            String strBirthYear = br.readLine();
            int birthYear = Integer.parseInt(strBirthYear);

            User user = new User(email, name, birthYear);
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void deleteUser(List<User> users) {
    }
}
