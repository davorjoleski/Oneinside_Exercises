package oneinside.task1.Task1;

import oneinside.task1.Task1.Beverage.AlcoholicBeverageMenuItem;
import oneinside.task1.Task1.Beverage.NonAlcoholicBeverageMenuItem;
import oneinside.task1.Task1.Food.DessertFoodMenuItem;
import oneinside.task1.Task1.Food.MainFoodMenuItem;
import oneinside.task1.Task1.Food.StarterFoodMenuItem;
import oneinside.task1.Task1.menu.MenuItem;
import oneinside.task1.Task1.menu.MenuItemQuantity;

import java.time.LocalDateTime;
import java.util.List;

public class RestaurantTest {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Restaurant 1", "address no.1");

        MenuItem menuItem1 = new MainFoodMenuItem("pica","desc pizza", 17);
        MenuItem menuItem2 = new StarterFoodMenuItem("SOpska","des salad", 25);
        MenuItem menuItem3 = new DessertFoodMenuItem("Palacinka","desc cake", 30);

        MenuItemQuantity menuItemQuantity1 = new MenuItemQuantity(menuItem1, 2);
        MenuItemQuantity menuItemQuantity2 = new MenuItemQuantity(menuItem2, 1);
        MenuItemQuantity menuItemQuantity3 = new MenuItemQuantity(menuItem3, 1);

        List<MenuItemQuantity> menuItemList1 = List.of(menuItemQuantity1, menuItemQuantity2, menuItemQuantity3);

        Order order1 = new Order(
                "1",
                 LocalDateTime.now(),
                menuItemList1,
                5
        );

        restaurant.addOrder(order1);

        MenuItem menuItem4 = new AlcoholicBeverageMenuItem("Pelin","desc gin", 35);
        MenuItem menuItem5 = new NonAlcoholicBeverageMenuItem("Cedevita","desc cedevita", 15);

        MenuItemQuantity menuItemQuantity4 = new MenuItemQuantity(menuItem4, 4);
        MenuItemQuantity menuItemQuantity5 = new MenuItemQuantity(menuItem5, 2);

        List<MenuItemQuantity> menuItemList2 = List.of(menuItemQuantity4, menuItemQuantity5);


        Order order2 = new Order(
                "2",
                LocalDateTime.now(),
                 menuItemList2,
                15
        );

        restaurant.addOrder(order2);

        System.out.println(String.format("Total balance for order: %.2f", restaurant.totalBalanceForAnOrder()));
        System.out.println(String.format("Total balance for order: %.2f", restaurant.totalEarningsFromAnOrder()));

        restaurant.getAllOrders();


        restaurant.removeOrder("1");

        System.out.println("  AFTER REMOVING ORDER  ");

        restaurant.getAllOrders();



    }
}
