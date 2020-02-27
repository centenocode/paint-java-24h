import org.academiadecodigo.simplegraphics.graphics.Color;
import java.util.HashMap;

public class Game {

    private HashMap  <Integer, Integer> hashMap;
    private Grid grid;
    private Brush brush;
    private BrushControls brushControls;

    public Game() {
        this.hashMap = new HashMap<Integer, Integer>();
        this.grid = new Grid(20, 20);
        this.brush = new Brush(hashMap);
        this.brushControls = new BrushControls();
    }

    public void init() {
        System.out.println("Hello World!");
        grid.init(Color.WHITE);
        brush.init();
        brushControls.setBrush(brush);
        brushControls.init();

    }
}

