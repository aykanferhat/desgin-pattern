package example2;

import java.math.BigDecimal;

public class WhipCoffee extends CoffeDecorator {

    public WhipCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(BigDecimal.valueOf(2.5));
    }
}
