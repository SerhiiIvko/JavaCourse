package service;

import dao.DataSourceFactory;
import dao.UserDao;
import entity.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserManager {

    public static void getUser() throws SQLException {
        System.out.println("Input user number:\n" +
                "1. Create new user\n" +
                "2. Choose user number from users List\n" +
                "3. Exit");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        switch (userChoice) {
            case "1":
                UserManager.registerNewUser();
                break;
            case "2":
                UserManager.getUserFromDB();
                break;
            case "3":
                System.out.println("You successfully quit from game");
                System.exit(1);
                break;
            default:
                System.out.println("Incorrect input");
                MenuManager.showMainMenu();
        }
        scanner.close();
    }

    public static void registerNewUser() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input id in DB");
        int id = Integer.parseInt(scanner.next());
        System.out.println("Input name");
        String name = scanner.next();
        double balance = 100;
        User user = new User(id, name, balance);
        UserDao userDao = new UserDao(DataSourceFactory.getMySQLDataSource());
        userDao.add(user);
        if (userDao.getById(id) != null) {
            System.out.println("User added");
            MenuManager.showMainMenu();
        }
    }

    public static void getUserFromDB() throws SQLException {
        List<User> users;
        UserDao userDao = new UserDao(DataSourceFactory.getMySQLDataSource());
        users = userDao.getAll();
        users.stream()
                .map(User::toString)
                .forEach(System.out::println);
        System.out.println("Input user id");
        Scanner scanner = new Scanner(System.in);
        String userId = scanner.next();
        User currentUser = users.get(Integer.parseInt(userId) - 1);
        if (Integer.parseInt(userId) - 1 < users.size()) {
            System.out.println(currentUser.getName()
                    + " logged in, balance = "
                    + currentUser.getBalance());
            //TODO method create cache
//            CashService.getGameCache(currentUser, );
            BedManager.getBedStatus();
        } else {
            System.out.println("Input correct id");
            getUserFromDB();
        }
    }
}