package oneinside.task1.Task1;


import oneinside.task1.Task1.menu.MenuItemQuantity;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order implements Comparable<Order>{
    private String id;
    private LocalDateTime timeOfOrderPlacement;
    private List<MenuItemQuantity> menuItems;
    private double tippedAmount;
    private double totalBalance;
    private double totalEarning;

    public Order() {
        this.id = "1";
        this.menuItems = new ArrayList<>();
        this.timeOfOrderPlacement= LocalDateTime.now();
        this.totalBalance = 0;
        this.totalEarning = 0;
        this.tippedAmount = 0;
    }

    public Order(String id, LocalDateTime timeOfOrderPlacement, List<MenuItemQuantity> menuItems, float tippedAmount) {
        this.id = id;
        this.timeOfOrderPlacement = timeOfOrderPlacement;
        this.menuItems = menuItems;
        this.tippedAmount = tippedAmount;
    }

    public String getId() {
        return this.id;
    }

    public double getTotalBalance() {
        return this.menuItems.stream()
                .mapToDouble(MenuItemQuantity::getTotalPrice)
                .sum();
    }

    public double getTotalEarning() {

        double totalPriceFromMenuItemsWithTax = this.menuItems.stream()
                .mapToDouble(MenuItemQuantity::getTotalPrice)
                .sum();



        return this.totalBalance + totalPriceFromMenuItemsWithTax + tippedAmount;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order num. " + this.id + "\n");

        for(MenuItemQuantity menuItem : menuItems) {
            sb.append("\t"+menuItem.toString()+"\n");
        }

        return sb.toString();
    }

    @Override
    public int compareTo(@NotNull Order other) {
        return this.timeOfOrderPlacement.compareTo(other.timeOfOrderPlacement);
    }
}
