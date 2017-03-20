package structural.adapter.flyweight;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public interface Shape {

    public void draw(Graphics g, int x, int y, int width, int height,
                     Color color);
}