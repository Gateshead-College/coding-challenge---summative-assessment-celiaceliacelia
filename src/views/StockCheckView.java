package views;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StockCheckView {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


   /* public void displayMainMenu() {
        MainMenuView mmv = new MainMenuView();
        handleChoice(mmv.displayMainMenu());
    }

    private void handleChoice(int selection) {
        switch(selection) {
            case 1:
                //AccountsMenuController accountMenuController = new AccountsMenuController();
//                    accountMenuController
                System.out.println("View Accounts selected");
                break;
            case 2:
                System.out.println("Create New Account selected");
                break;
            case 3:
                System.out.println("Logout selected");
                break;

            default:
                System.out.println("Invalid option selected, please try again:");
                displayMainMenu();
        }
    }


}
