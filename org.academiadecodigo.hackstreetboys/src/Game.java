import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.HashMap;

public class Game {
    HashMap hashMap;
    Grid grid;
    Brush brush;
    BrushControls brushControls;

    public Game() {
        this.hashMap = new HashMap();
        this.grid = new Grid(20, 20);
        this.brush = new Brush(hashMap);
        this.brushControls = new BrushControls();
    }

    public void init() {
        System.out.println("Hello World!");
        grid.init(Color.BLACK);
        brush.init();
        brushControls.setBrush(brush);
        brushControls.init();

        while(true){getPaintedArea();}
    }

    public void getPaintedArea() {
        for (int i = 0; i > grid.getRows(); i++) {
            if (hashMap.containsKey(i)) {
                Rectangle rectangle = new Rectangle(i, ((int) hashMap.get(i)), 20, 20);
                rectangle.draw();
                rectangle.setColor(Color.BLACK);
                rectangle.fill();
            }
        }
    }
}

