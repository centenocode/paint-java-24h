import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.lang.reflect.Array;

public class Brush extends Rectangle {

    int[] painted;

    Rectangle rectangle;

    public Brush(){
        this.rectangle = new Rectangle(0,0,20,20);

    }
    public void init(){
        this.rectangle.setColor(Color.BLACK);
        this.rectangle.fill();
        this.rectangle.draw();

    }

    public void paint(){
        System.out.println(this.rectangle.getX());
        System.out.println(this.rectangle.getY());
        System.out.println(this.rectangle.getHeight());
        System.out.println(this.rectangle.getWidth());






    }


    public void moveRight(){
        this.rectangle.translate(20,0);
    }
    public void moveLeft(){
        this.rectangle.translate(-20,0);
    }
    public void moveUp(){
        this.rectangle.translate(0,-20);
    }
    public void moveDown(){
        this.rectangle.translate(0,20);
    }





}
