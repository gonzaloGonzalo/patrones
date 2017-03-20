package structural.adapter.bridge;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class Triangle extends Shape {

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }

}