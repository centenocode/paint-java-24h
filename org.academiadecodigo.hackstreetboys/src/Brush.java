import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Brush extends Rectangle {

    private HashMap <Integer, Integer> hashMap;
    private Rectangle rectangle;

    public Brush(HashMap<Integer, Integer> hashMap){
        this.rectangle = new Rectangle(200,0,20,20);
        this.hashMap = hashMap;
    }

    public void init(){
        this.rectangle.setColor(Color.BLACK);
        this.rectangle.fill();
        this.rectangle.draw();

    }

    public void paint(){
        System.out.println(hashMap.get(rectangle.getX()));
        if(((hashMap.get(rectangle.getX()) != null) && (hashMap.containsValue(rectangle.getY())))){
            Rectangle rectangle2 = new Rectangle(rectangle.getX(), (hashMap.get(rectangle.getX())), 20, 20);
            rectangle2.draw();
            rectangle2.setColor(Color.WHITE);
            rectangle2.fill();
            hashMap.remove(rectangle.getX(),hashMap.get(rectangle.getX()));
            System.out.println("delete");

        } else {
            hashMap.put(rectangle.getX(), rectangle.getY());
            System.out.println("draw");
        }
    }


    public void drawHistory(){
        for (int i = 0; i <= 399; i++) {
            if (hashMap.containsKey(i)) {
                Rectangle rectangle = new Rectangle(i, (hashMap.get(i)), 20, 20);
                rectangle.draw();
                rectangle.setColor(Color.BLACK);
                rectangle.fill();
            }
        }
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
