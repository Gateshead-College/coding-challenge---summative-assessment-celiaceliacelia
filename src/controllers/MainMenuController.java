package controllers;

import views.MainMenuView;

public class MainMenuController {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void displayMainMenu() {
        MainMenuView mmv = new MainMenuView();
        handleChoice(mmv.displayMainMenu());
    }

    private void handleChoice(int selection) {
        switch(selection) {
            case 1:
               //if 1 is selected, this needs to direct to the check and amend stock menu

                break;
            case 2:
                //if 2 is selected, this needs to direct to the admin console/user info menu

                break;
            case 3:
                System.out.println(ANSI_GREEN + "Logging out..." + ANSI_RESET);
                System.out.println("");
                System.out.println(ANSI_PURPLE + "Thank you for using the C-Only Admin Console. Have a nice day!" + ANSI_RESET);
                System.out.println(ANSI_YELLOW + "----------------------------------------------------" + ANSI_RESET);
                break;

            default:
                System.out.println("Invalid option selected, please try again:");
                displayMainMenu();
        }
    }
}
