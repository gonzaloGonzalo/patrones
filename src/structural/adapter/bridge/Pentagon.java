package structural.adapter.bridge;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class Pentagon extends Shape {

    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }

}
