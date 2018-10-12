package example2;

import java.math.BigDecimal;

public class Espresso implements Coffee {

    @Override
    public String getDescription() {
        return "Core coffee";
    }

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(2);
    }
}
