package creational.abstractFactory;

import creational.factoryMethod.Computer;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}