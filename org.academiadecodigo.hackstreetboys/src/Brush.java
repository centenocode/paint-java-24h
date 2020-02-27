import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Brush extends Rectangle {

    HashMap hashMap;
    Rectangle rectangle;

    public Brush(HashMap hashMap){
        this.rectangle = new Rectangle(200,0,20,20);
        this.hashMap = hashMap;
    }

    public void init(){
        this.rectangle.setColor(Color.BLACK);
        this.rectangle.fill();
        this.rectangle.draw();

    }

    public void paint(){
        System.out.println(this.rectangle.getX());
        System.out.println(this.rectangle.getY());
        hashMap.put(this.rectangle.getX(),this.rectangle.getY());

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
