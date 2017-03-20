package creational.singleton;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class Singleton {
    private static final Singleton instance = new Singleton();

    //private constructor to avoid client applications to use constructor
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
