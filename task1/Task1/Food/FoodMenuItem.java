package oneinside.task1.Task1.Food;

import oneinside.task1.Task1.menu.MenuItem;

public abstract class FoodMenuItem extends MenuItem {


    public FoodMenuItem(String name, String description, double price, float taxPercentage) {
        super(name, description, price, taxPercentage);
    }

}
