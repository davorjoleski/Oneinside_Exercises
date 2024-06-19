package oneinside.task1.Task1.menu;

public abstract class MenuItem {
    protected String name;
    protected String description;
    protected double price;
    protected double taxPercentage;


    public MenuItem(String name, String description, double price, double taxPercentage) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.taxPercentage = taxPercentage;
    }

    public abstract double getTaxPercentage();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }



}
