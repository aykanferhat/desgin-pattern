package example1;

public class DecoratorPatternTest {


    public static void main(String[] args) {

        Car sportCar = new SportCar(new BasicCar());

        sportCar.assemble();

        System.out.println("\n*****");


        Car supportLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));

        supportLuxuryCar.assemble();

    }
}
