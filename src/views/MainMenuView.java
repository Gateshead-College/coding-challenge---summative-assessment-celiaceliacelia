package views;

import java.util.Scanner;

public class MainMenuView {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public int displayMainMenu() {
        System.out.println(ANSI_PURPLE + "What would you like to do today?" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "----------------------------------------------------" + ANSI_RESET);
        System.out.println("1 - Check and amend stock");
        System.out.println("2 - Check and amend Admin Console user information");
        System.out.println("");
        System.out.println(ANSI_RED + "3 - Log out" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "----------------------------------------------------" + ANSI_RESET);
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
}
