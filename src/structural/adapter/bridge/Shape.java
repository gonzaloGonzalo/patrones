package structural.adapter.bridge;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public abstract class Shape {
    //Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color c) {
        this.color = c;
    }

    abstract public void applyColor();
}
