package example1;

import java.awt.*;

public class Line implements Shape {

    public Line() {
        System.out.println("Creating line object");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics graphics, int x, int y, int width, int height, Color color) {
        System.out.println("Drawing line");
        graphics.setColor(color);
        graphics.drawLine(x, y, width, height);
    }
}
