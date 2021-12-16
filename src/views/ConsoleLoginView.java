package views;

import controllers.ConsoleLoginController;

public class ConsoleLoginView {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void displayLoginScreen() {
        ConsoleLoginController lc = new ConsoleLoginController();
        System.out.println(ANSI_PURPLE + "Hello! Welcome to the C-Only Admin Console" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "Please enter your username: " + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "----------------------------------------------------" + ANSI_RESET);
        lc.getUsername();
        System.out.println(ANSI_PURPLE + "Please enter your password: " + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "----------------------------------------------------" + ANSI_RESET);

        lc.getPassword();
        if(lc.checkDetails()) {
            System.out.println(ANSI_GREEN + "Correct details entered\nLoading Main Menu..." + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "----------------------------------------------------" + ANSI_RESET);

            lc.loadMainMenu();
        } else {
            System.out.println(ANSI_RED + "Username or password not recognised, please try again" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "----------------------------------------------------" + ANSI_RESET);

            displayLoginScreen();
        }
    }
}
