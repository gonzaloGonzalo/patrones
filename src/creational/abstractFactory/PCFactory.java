package creational.abstractFactory;

import creational.factoryMethod.Computer;
import creational.factoryMethod.PC;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }

}
