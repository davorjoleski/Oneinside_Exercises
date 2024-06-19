package oneinside.task1.Task1.Beverage;


import oneinside.task1.Task1.TaxPercentage;
import oneinside.task1.Task1.interfaces.BeverageMenuItemInterface;
import oneinside.task1.Task1.interfaces.NonAlcoholicBeverageMenuItemInterface;

public class NonAlcoholicBeverageMenuItem extends BeverageMenuItem
        implements BeverageMenuItemInterface, NonAlcoholicBeverageMenuItemInterface {

    public NonAlcoholicBeverageMenuItem(String name, String description, double price) {
        super(name, description, price, TaxPercentage.NON_ALCOHOLIC_TAX);
    }

    @Override
    public double getTaxPercentage() {
        return getPriceWithNonAlcoholicTax();
    }

    @Override
    public boolean isBeverageMenuItemAlcoholic() {
        return false;
    }

    @Override
    public double getPriceWithNonAlcoholicTax() {
        return this.price * TaxPercentage.NON_ALCOHOLIC_TAX;
    }
}
