package structural.adapter.bridge;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class BridgePatternTest {

    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }

}