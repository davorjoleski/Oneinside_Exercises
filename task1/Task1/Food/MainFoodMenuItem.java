package oneinside.task1.Task1.Food;


import oneinside.task1.Task1.TaxPercentage;
import oneinside.task1.Task1.interfaces.FoodMenuItemInterface;

public class MainFoodMenuItem extends FoodMenuItem implements FoodMenuItemInterface {
    public MainFoodMenuItem(String name, String description, double price) {
        super(name, description, price, TaxPercentage.FOOD_ITEM_TAX);
    }

    @Override
    public double getPriceWithFoodMenuItemTax() {
        return this.price * TaxPercentage.FOOD_ITEM_TAX;
    }

    @Override
    public FoodMenuItemCategory getFoodMenuItemCategory() {
        return FoodMenuItemCategory.MAIN;
    }

    @Override
    public double getTaxPercentage() {
        return getPriceWithFoodMenuItemTax();
    }
}
