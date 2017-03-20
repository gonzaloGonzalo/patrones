package structural.adapter.decorator;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}