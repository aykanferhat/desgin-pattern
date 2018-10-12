package example2;

import java.math.BigDecimal;

public class CoffeDecorator implements Coffee {

    private final Coffee coffee;

    public CoffeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return "Special coffee";
    }

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(6).add(coffee.getCost());
    }
}
