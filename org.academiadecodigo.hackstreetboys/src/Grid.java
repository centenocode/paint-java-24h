import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import java.util.Iterator;
import java.util.LinkedList;

public class Grid {

    public static final int PADDING = 0;
    private int cols;
    private int rows;
    private int cellSize = 20;
    private Rectangle rectangle;
    private Rectangle field;
    private LinkedList<Rectangle> rectangleContainer = new LinkedList<>();
    private Grid grid;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public void init() {
        this.field = new Rectangle(PADDING, PADDING, cols * cellSize, rows * cellSize);
        this.field.draw();
        this.field.setColor(Color.WHITE);
        this.field.fill();
    }

    public void createCells() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                Rectangle rectangle = new Rectangle(j * 20, i * 20, 20, 20);
                rectangle.draw();
                rectangle.setColor(Color.WHITE);
                rectangleContainer.add(rectangle);
            }
        }
    }

    public Iterator iterator() {
        return rectangleContainer.iterator();
    }

    public LinkedList<Rectangle> getRectangleContainer() {
        return rectangleContainer;
    }
}