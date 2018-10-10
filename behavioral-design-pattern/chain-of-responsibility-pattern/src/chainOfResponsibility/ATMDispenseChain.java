package chainOfResponsibility;

import java.util.Scanner;

public class ATMDispenseChain {

    private DispenseChain dispenseChain;

    public ATMDispenseChain() {
        this.dispenseChain = new Dollar50Dispenser();
        DispenseChain dispenseChainTwo = new Dollar20Dispenser();
        DispenseChain dispenseChainThree = new Dollar10Dispenser();

        this.dispenseChain.setNextChain(dispenseChainTwo);
        dispenseChainTwo.setNextChain(dispenseChainThree);
    }

    public static void main(String[] args) {

        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();

        while (true) {

            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            atmDispenseChain.dispenseChain.dispense(new Currency(amount));
        }
    }
}
