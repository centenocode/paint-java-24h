import org.academiadecodigo.simplegraphics.graphics.Color;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Grid grid = new Grid(20,20);
        grid.init(Color.BLACK);

        Brush brush = new Brush();
        brush.init();

        System.out.println(brush.rectangle.getX());
        System.out.println(brush.rectangle.getY());
        System.out.println(brush.rectangle.getHeight());
        System.out.println(brush.rectangle.getWidth());

        BrushControls brushControls = new BrushControls();
        brushControls.setBrush(brush);
        brushControls.init();






    }
}
