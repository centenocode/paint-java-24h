import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    public static final int PADDING = 0;
    private int cols;
    private int rows;
    private int cellSize = 10;
    private Rectangle rectangle;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public void init(Color color) {
        this.rectangle = new Rectangle(0,0,400,400);
        this.rectangle.draw();
        this.rectangle.setColor(color);

    }
}