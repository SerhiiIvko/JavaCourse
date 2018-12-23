import service.MenuManager;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            MenuManager.showMainMenu();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}