package com.example.io;

import java.util.Iterator;

public interface UserService {

    public void addUser(User user);

    public boolean updateUser(User user);

    public boolean deleteUser(String email);

    public Iterator<User> getUsers();

    public boolean exists(String email);

}
