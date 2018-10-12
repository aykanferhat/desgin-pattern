package example2;

import java.math.BigDecimal;

public class MochaCoffe extends CoffeDecorator {

    public MochaCoffe(Coffee coffee) {
        super(coffee);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().multiply(BigDecimal.valueOf(1));
    }
}
