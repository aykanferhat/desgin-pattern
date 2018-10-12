package example2;

import java.math.BigDecimal;

public class DarkRoast implements Coffee {

    @Override
    public String getDescription() {
        return "Core Coffe";
    }

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(1.5);
    }
}
