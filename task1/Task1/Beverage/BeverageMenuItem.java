package oneinside.task1.Task1.Beverage;


import oneinside.task1.Task1.menu.MenuItem;

public abstract class BeverageMenuItem extends MenuItem {

    public BeverageMenuItem(String name, String description, double price, double taxPercentage) {
        super(name, description, price, taxPercentage);
    }
}
