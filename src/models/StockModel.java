package models;

public class StockModel {

    String productID;
    String manufacturer;
    String productName;
    double price;
    int quantity;

    public StockModel(String productID, String manufacturer, String productName, double price, int quantity) {
        this.productID = productID;
        this.manufacturer = manufacturer;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
}
