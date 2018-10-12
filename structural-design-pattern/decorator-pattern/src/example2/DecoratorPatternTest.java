package example2;

public class DecoratorPatternTest {

    public static void main(String[] args) {

        Coffee darkRoast = new DarkRoast();

        System.out.println(darkRoast.getCost());

        Coffee mocha = new MochaCoffe(new DarkRoast());

        System.out.println(mocha.getCost());

        Coffee whip = new WhipCoffee(new MochaCoffe(new DarkRoast()));

        System.out.println(whip.getCost());

    }
}
