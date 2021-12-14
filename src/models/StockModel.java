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

    public String getProductID() {
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
    }
}
