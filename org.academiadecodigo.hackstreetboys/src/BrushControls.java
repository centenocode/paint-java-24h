import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class BrushControls implements KeyboardHandler {
    private Keyboard keyboard;
    private Brush brush;

    public void init() {

        keyboard = new Keyboard(this);

        // --DLEFT -- //
        KeyboardEvent dlPressed = new KeyboardEvent();
        dlPressed.setKey(KeyboardEvent.KEY_LEFT);
        dlPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(dlPressed);

        // -- DRIGHT -- //
        KeyboardEvent drPressed = new KeyboardEvent();
        drPressed.setKey(KeyboardEvent.KEY_RIGHT);
        drPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(drPressed);

        // -- UP -- //
        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_UP);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(upPressed);

        // -- DOWN -- //
        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_DOWN);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(downPressed);

        // -- SPACE -- //
        KeyboardEvent spacePressed = new KeyboardEvent();
        spacePressed.setKey(KeyboardEvent.KEY_SPACE);
        spacePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(spacePressed);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_LEFT:
                brush.moveLeft();
                break;

            case KeyboardEvent.KEY_RIGHT:
                brush.moveRight();
                break;

            case KeyboardEvent.KEY_UP:
                brush.moveUp();
                break;

            case KeyboardEvent.KEY_DOWN:
                brush.moveDown();
                break;

            case KeyboardEvent.KEY_SPACE:
                brush.paint();
                brush.drawHistory();

                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }

    public void setBrush(Brush brush) {
        this.brush = brush;
    }


}
