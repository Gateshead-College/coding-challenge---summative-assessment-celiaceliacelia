package controllers;

import models.StockModel;

import java.util.Scanner;
import java.util.ArrayList;

public class StockCheckController {

    public static void main(String[] args) {
        StockCheckController stock = new StockCheckController();
        stock.checkStock();
        stock.updateStock();
        stock.addStock();
        stock.removeStock();
    }

    //Create the scanner
    Scanner myScanner = new Scanner(System.in);

    //Initialise array list
    ArrayList<StockModel> stock = new ArrayList<>();

    //populate array list
    public void stockItems () {
        stock.add(new StockModel("C6295", "HP", "Computer", 749.99, 100));
        stock.add(new StockModel("C1758", "Thomann", "Cello", 575.00, 30));
        stock.add(new StockModel("C6017", "Bakery Ltd.", "Croissant", 0.45, 150));
        stock.add(new StockModel("C5854", "Stationery Co.", "Chalkboard", 45.00, 30));
        stock.add(new StockModel("C1112", "Rains", "Cagoule", 55.00, 50));
        stock.add(new StockModel("C3141", "Laura Ashley", "Curtains", 89.00, 40));
        stock.add(new StockModel("C4775", "Prada", "Cufflinks", 420.00, 35));
        stock.add(new StockModel("C9009", "Jacques of London", "Chess board", 21.99, 180));
        stock.add(new StockModel("C2674", "EK Archery", "Crossbow", 85.99, 50));
        stock.add(new StockModel("C2223", "Marlboro", "Cigarettes", 11.99, 200));
        stock.add(new StockModel("C0023", "Smeg", "Cooker", 2489.00, 15));
    }

    //stock menu interface - Check stock, Update stock levels, Add stock item, Remove stock item
    public void stockMenu() {
        System.out.println("Welcome to C-Only!");
        System.out.println("-----------------------------------------------------------");
        System.out.println("What would you like to do?");
        System.out.println("1 - Check stock");
        System.out.println("2 - Update stock levels");
        System.out.println("3 - Add a new stock item");
        System.out.println("4 - Remove a stock item");
        System.out.println("-----------------------------------------------------------");
        System.out.println("5 - Exit");
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
                System.out.println("Goodbye!");
        }
    }

    //TO-DO: Sort this out so that the variables pull from where they were initialised at the top
    public void checkStock() {
        System.out.println("Here is a full list of our current stock:");
        System.out.println("-----------------------------------------------------------");

        System.out.println("ID: " + productID + " - Manufacturer: " + manufacturer + " - Name: " + productName + " - Price: £"
                + price + " - Stock: " + quantity);

    }

    //TO-DO: Complete the remaining methods logic
    private void updateStock() {

    }

    private void addStock() {

    }

    private void removeStock() {

    }

}
