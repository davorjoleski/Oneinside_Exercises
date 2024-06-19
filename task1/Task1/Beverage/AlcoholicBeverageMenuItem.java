package oneinside.task1.Task1.Beverage;


import oneinside.task1.Task1.TaxPercentage;
import oneinside.task1.Task1.interfaces.AlcoholicBeverageMenuItemInterface;
import oneinside.task1.Task1.interfaces.BeverageMenuItemInterface;

public class AlcoholicBeverageMenuItem extends BeverageMenuItem
        implements BeverageMenuItemInterface, AlcoholicBeverageMenuItemInterface {

    public AlcoholicBeverageMenuItem(String name, String description, double price) {
        super(name, description, price, TaxPercentage.ALCOHOLIC_TAX);
    }



    @Override
    public double getTaxPercentage() {
        return getPriceWithAlcoholicTax();
    }

    @Override
    public boolean isBeverageMenuItemAlcoholic() {
        return true;
    }

    @Override
    public double getPriceWithAlcoholicTax() {
        return this.price * TaxPercentage.ALCOHOLIC_TAX;
    }
}
