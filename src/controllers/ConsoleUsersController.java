package controllers;

import models.ConsoleLoginUsers;
import views.ConsoleLoginView;

import java.util.ArrayList;

//import models.User;
//import views.LoginView;

public class ConsoleUsersController {


        public static ArrayList<ConsoleLoginUsers> users;

        public static void main(String[] args) {
            ConsoleUsersController suc = new ConsoleUsersController();
            suc.createUsers();
        }

        private void createUsers() {
            users = new ArrayList<>();
            users.add(new ConsoleLoginUsers("Celia", "Perry", "CP0028C", "cperry", "Password999", true));
            users.add(new ConsoleLoginUsers("Rohan", "George", "RG7485C", "rgeorge", "minecraft1", true));
            users.add(new ConsoleLoginUsers("Teddy", "Fuller", "TF9304C", "tfuller", "iamadog", false));
            ConsoleLoginView slv = new ConsoleLoginView();
            slv.displayLoginScreen();
        }
    }
