package oneinside.task1.Task1.Food;


import oneinside.task1.Task1.Food.FoodMenuItem;
import oneinside.task1.Task1.Food.FoodMenuItemCategory;
import oneinside.task1.Task1.TaxPercentage;
import oneinside.task1.Task1.interfaces.FoodMenuItemInterface;

public class DessertFoodMenuItem extends FoodMenuItem implements FoodMenuItemInterface {
    public DessertFoodMenuItem(String name, String description, double price) {
        super(name, description, price, TaxPercentage.FOOD_ITEM_TAX);
    }

    @Override
    public double getPriceWithFoodMenuItemTax() {
        return this.price * TaxPercentage.FOOD_ITEM_TAX;
    }

    @Override
    public FoodMenuItemCategory getFoodMenuItemCategory() {
        return FoodMenuItemCategory.DESERT;
    }

    @Override
    public double getTaxPercentage() {
        return getPriceWithFoodMenuItemTax();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.name);
        sb.append("Description: ").append(this.description);
        sb.append("Price with tax: ").append(this.getPriceWithFoodMenuItemTax());


        return sb.toString();
    }

//    @Override
//    public String toString() {
//        return "DessertFoodMenuItem{" +
//                "name='" + this.name + '\'' +
//                ", description='" + this.description + '\'' +
//                ", price with tax =" + this.getPriceWithFoodMenuItemTax() +
//                '}';
//    }
}
