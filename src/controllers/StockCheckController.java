package controllers;

import models.StockModel;
import views.MainMenuView;
import java.util.Scanner;
import java.util.ArrayList;

public class StockCheckController {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    String productID;
    String manufacturer;
    String productName;
    double price;
    int quantity;

    public static void main(String[] args) {
        StockCheckController stock = new StockCheckController();
        stock.stockMenu();
        stock.checkStock();
        stock.updateStock();
        stock.addStock();
        stock.removeStock();
    }

    //Create the scanner and initialise array list
    Scanner myScanner = new Scanner(System.in);
    public static ArrayList<StockModel> totalStock;
    //ArrayList<StockModel> totalStock = new ArrayList<>();

    //populate array list
    public void stockItems() {
        totalStock.add(new StockModel("C6295", "HP", "Computer", 749.99, 100));
        totalStock.add(new StockModel("C1758", "Thomann", "Cello", 575.00, 30));
        totalStock.add(new StockModel("C6017", "Bakery Ltd.", "Croissant", 0.45, 150));
        totalStock.add(new StockModel("C5854", "Stationery Co.", "Chalkboard", 45.00, 30));
        totalStock.add(new StockModel("C1112", "Rains", "Cagoule", 55.00, 50));
        totalStock.add(new StockModel("C3141", "Laura Ashley", "Curtains", 89.00, 40));
        totalStock.add(new StockModel("C4775", "Prada", "Cufflinks", 420.00, 35));
        totalStock.add(new StockModel("C9009", "Jacques of London", "Chess board", 21.99, 180));
        totalStock.add(new StockModel("C2674", "EK Archery", "Crossbow", 85.99, 50));
        totalStock.add(new StockModel("C2223", "Marlboro", "Cigarettes", 11.99, 200));
        totalStock.add(new StockModel("C0023", "Smeg", "Cooker", 2489.00, 15));
    }

    //stock menu interface - Check stock, Update stock levels, Add stock item, Remove stock item
    public void stockMenu() {
        System.out.println(ANSI_PURPLE + "What would you like to do today?" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "-----------------------------------" + ANSI_RESET);
        System.out.println("1 - Check stock");
        System.out.println("2 - Update stock levels");
        System.out.println("3 - Add a new stock item");
        System.out.println("4 - Remove a stock item");
        System.out.println("");
        System.out.println(ANSI_RED + "5 - Back to Main Menu" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "-----------------------------------" + ANSI_RESET);
        int selection = Integer.parseInt(myScanner.nextLine());


        switch(selection) {
            case 1:
                checkStock();
                break;

            case 2:
                updateStock();
                break;

            case 3:
                addStock();
                break;

            case 4:
                removeStock();
                break;

            case 5:
                //displayMainMenu();
                break;
        }
    }

    //TO-DO: Sort this out so that the variables pull from where they were initialised at the top
    public void checkStock() {
        System.out.println(ANSI_PURPLE + "What would you like to check?" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "-----------------------------------" + ANSI_RESET);
        System.out.println("1 - A list of all stock");
        System.out.println("2 - Stock details for a particular item");
        int selection = Integer.parseInt(myScanner.nextLine());

        switch(selection) {
            case 1:
                allStock();
                break;

            case 2:
                individualStock();
                break;

            case 3:
                stockMenu();
                break;
        }
    }


    private void updateStock() {

    }

    private void addStock() {

    }

    private void removeStock() {

    }

    private void allStock() {
        System.out.println("Here is a list of all current stock:");
        System.out.println(ANSI_YELLOW + "-----------------------------------------" + ANSI_RESET);
        for (StockModel sm : totalStock) {
            System.out.println("ID: " + productID + " - Manufacturer: " + manufacturer + " - Name: " + productName + " - Price: £"
                    + price + " - Stock: " + quantity);
        }
//WORK OUT HOW TO RETURN LITERALLY JUST THE WHOLE ARRAY LIST OF PRODUCTS IN THE RIGHT ORDER???
    }



    private void individualStock() {
        System.out.println("Which item would you like to check stock levels for?");
        String productName = myScanner.nextLine();
    }

    /*public String getProductID() {
        return productID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }*/
}
