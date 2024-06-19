package oneinside.task1.Task1.menu;

import oneinside.task1.Task1.Beverage.AlcoholicBeverageMenuItem;
import oneinside.task1.Task1.Beverage.NonAlcoholicBeverageMenuItem;
import oneinside.task1.Task1.Food.DessertFoodMenuItem;

import java.util.List;

public class Menu {
    private String id;
    private List<MenuItem> menuItems;

    public Menu() {
        this.id = "Masa 0";
        this.menuItems = List.of(
                new DessertFoodMenuItem(
                        "Dessert ",
                        "Dessert -  description",
                        33.00
                ),
                new AlcoholicBeverageMenuItem(
                        "Alcohol  ",
                        "Alcohol  description",
                        12.00),
                new NonAlcoholicBeverageMenuItem(
                        "NonAlcohol ",
                        "NonAlcohol description",
                        44.00)
        );
    }

    public Menu(List<MenuItem> menuItems) {
        this.id = "Masa 1";
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public void removeMenuItem(String Name) {
        this.menuItems.removeIf(menuItem -> menuItem.getName().equals(Name));
    }

    public void getInformationAboutMenuItem() {
        this.menuItems.forEach(menuItem -> System.out.println(menuItem.toString()));
    }
}
