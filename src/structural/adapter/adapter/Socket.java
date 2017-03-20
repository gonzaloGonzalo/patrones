package structural.adapter.adapter;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}