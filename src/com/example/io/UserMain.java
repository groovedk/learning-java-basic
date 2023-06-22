package com.example.io;

public class UserMain {

    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        UserDao userDao = new UserDao("/tmp/users01.dat");
//        List<User> users = userDao.getUsers();
        UserService userService = new UserServiceInMemory(userDao.getUsers());

        while (true) {
            int menuId = userUI.menu();
            if (menuId == 5) {
                System.out.println("프로그램을 종료합니다.");
                userDao.saveUser(userService.getUsers());
                break;
            } else if (menuId == 1) {
                User user = userUI.regUser();
                userService.addUser(user);

                System.out.println("등록되었습니다. ");
                System.out.println();
            } else if (menuId == 2) {
                userUI.printUserList(userService.getUsers());

            } else if (menuId == 3) {
                String email = userUI.inputEmail();
                boolean isFindEmail = userService.exists(email);

                if (!isFindEmail) {
                    System.out.println("입력한 이메일주소를 가진 회원이 없습니다.");
                } else {
                    User updateUser = userUI.inputUser(email);
                    userService.updateUser(updateUser);
                    System.out.println("수정되었습니다. ");
                    System.out.println();

                }

            } else if (menuId == 4) {
                String email = userUI.inputEmail();
                boolean isFindEmail = userService.exists(email);

                if (!isFindEmail) {
                    System.out.println("입력한 이메일주소를 가진 회원이 없습니다.");
                } else {
                    userService.deleteUser(email);
                    System.out.println("삭제되었습니다. ");
                    System.out.println();
                }
            }
        }
    }
}
