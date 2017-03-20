package behavioral.chainOfResponsability;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}