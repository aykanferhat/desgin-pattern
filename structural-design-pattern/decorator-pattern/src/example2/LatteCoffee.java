package example2;

import java.math.BigDecimal;

public class LatteCoffee extends CoffeDecorator {

    public LatteCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Special Lattle ";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().multiply(BigDecimal.valueOf(3));
    }
}
