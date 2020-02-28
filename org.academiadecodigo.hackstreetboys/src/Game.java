import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.HashMap;
import java.util.Iterator;

public class Game {

    private Grid grid;
    private Brush brush;
    private BrushControls brushControls;

    public Game() {
        this.grid = new Grid(20, 20);
        this.brush = new Brush();
        this.brushControls = new BrushControls();
    }

    public void init() {
        System.out.println("Hello World!");
        grid.init();
        grid.createCells();
        brush.setGrid(grid);
        brushControls.setBrush(brush);
        brush.appear();
        brushControls.init();


    }
}

