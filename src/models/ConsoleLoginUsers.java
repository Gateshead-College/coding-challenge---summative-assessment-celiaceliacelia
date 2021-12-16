package models;

import java.util.ArrayList;

public class ConsoleLoginUsers {

    private String forename;
    private String surname;
    private String employeeID;
    private String username;
    private String password;
    boolean admin;
    ArrayList<ConsoleLoginUsers> accounts;

    public ConsoleLoginUsers(String forename, String surname, String employeeID, String username, String password, boolean admin) {
        this.forename = forename;
        this.surname = surname;
        this.employeeID = employeeID;
        this.username = username;
        this.password = password;
        this.admin = admin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
