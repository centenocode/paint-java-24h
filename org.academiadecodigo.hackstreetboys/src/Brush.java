import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Brush extends Rectangle {

    private Rectangle rectangle;
    private Grid grid;
    private boolean isOnGrid;
    private Direction direction;


    public Brush (){
        this.rectangle = new Rectangle(0,0,20,20);
    }

    public void appear () {
        for (Rectangle r: grid.getRectangleContainer()){
            if (r.getX() == this.rectangle.getX() && r.getY() == this.rectangle.getY()) {
                if (r.getColor().equals(Color.BLACK)) {
                    rectangle.setColor(Color.BLUE);
                } else {
                    rectangle.setColor(Color.BLACK);
                }
                rectangle.draw();
                rectangle.fill();
            }
        }
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public void paint() {
        for (Rectangle r: grid.getRectangleContainer()){
            if (r.getX() == this.rectangle.getX() && r.getY() == this.rectangle.getY()) {
                if (r.getColor().equals(Color.BLACK)) {
                    r.setColor(Color.WHITE);
                } else {
                    r.setColor(Color.BLACK);
                }
                r.draw();
                r.fill();
                appear();
            }
        }
    }
/*
    public boolean isOnGrid(){
        return rectangle.getX() == Game.COLS
                || rectangle.getX() == 0
                || rectangle.getY() == Game.ROWS
                || rectangle.getY() == 0;
    }

    public boolean isOnGrid(int x) {
            if (rectangle.getX() + 1 < 380 || rectangle.getY() + 1 < 380) {
                return true;
            } else if (rectangle.getX() - 1 > -1 || rectangle.getY() - 1 > -1) {
                return true;
            }
            return false;
    }

 */

    public int getX(){return rectangle.getX();}

    public int getY(){return rectangle.getY();}


    public void moveRight(){this.rectangle.translate(20,0);}

    public void moveLeft(){this.rectangle.translate(-20,0);}

    public void moveUp(){this.rectangle.translate(0,-20);}

    public void moveDown(){this.rectangle.translate(0,20);}
}