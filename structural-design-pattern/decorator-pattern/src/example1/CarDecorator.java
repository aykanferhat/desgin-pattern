package example1;

public class CarDecorator implements Car{

    /*

    Decorator class implement the component interface and it has a HAS-A relation ship with the
    component interface. The component variable should be accessible to the child decorator classes,
    so we will make this variable protected.

     */

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
