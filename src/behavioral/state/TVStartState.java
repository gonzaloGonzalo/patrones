package behavioral.state;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class TVStartState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }

}