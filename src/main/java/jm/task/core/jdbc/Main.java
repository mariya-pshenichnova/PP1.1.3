package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Adolf", "Dasslier", (byte) 77);
        userService.saveUser("Rudolf", "Dasslier", (byte) 76);
        userService.saveUser("Phil", "Knight", (byte) 84);
        userService.saveUser("Michael", "Jordan", (byte) 59);

        userService.getAllUsers();
        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
