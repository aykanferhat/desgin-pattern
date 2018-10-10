package chainOfResponsibility;

public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int reminder = currency.getAmount() % 10;
            System.out.println("Dispensing " + num + " 10$ note");

            if (reminder != 0)
                this.dispenseChain.dispense(new Currency(reminder));
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
