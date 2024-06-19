package oneinside.task1.Task1.Food;


import oneinside.task1.Task1.Food.FoodMenuItem;
import oneinside.task1.Task1.Food.FoodMenuItemCategory;
import oneinside.task1.Task1.TaxPercentage;
import oneinside.task1.Task1.interfaces.FoodMenuItemInterface;

public class StarterFoodMenuItem extends FoodMenuItem implements FoodMenuItemInterface {

    public StarterFoodMenuItem(String name, String description, double price) {
        super(name, description, price, TaxPercentage.FOOD_ITEM_TAX);
    }

    @Override
    public double getPriceWithFoodMenuItemTax() {
        return this.price * TaxPercentage.FOOD_ITEM_TAX;
    }

    @Override
    public FoodMenuItemCategory getFoodMenuItemCategory() {
        return FoodMenuItemCategory.STARTER;
    }

    @Override
    public double getTaxPercentage() {
        return getPriceWithFoodMenuItemTax();
    }
}
