package controllers;

import models.ConsoleLoginUsers;

import java.util.Scanner;

public class ConsoleLoginController {

        private String username = "";
        private String password = "";

        public void getUsername(){
            username = new Scanner(System.in).nextLine();
        }

        public void getPassword(){
            password = new Scanner(System.in).nextLine();
        }

        public boolean checkDetails() {

            for(ConsoleLoginUsers u : ConsoleUsersController.users) {
                if(u.getUsername().equalsIgnoreCase(username) &&
                        u.getPassword().equals(password)) {
                    return true;
                }
            }
            return false;
        }

        public void loadMainMenu() {
            MainMenuController mmc = new MainMenuController();
            mmc.displayMainMenu();
        }
    }
