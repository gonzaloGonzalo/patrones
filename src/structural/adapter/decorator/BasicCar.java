package structural.adapter.decorator;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

}