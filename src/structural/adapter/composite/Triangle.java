package structural.adapter.composite;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color " + fillColor);
    }

}