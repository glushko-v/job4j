package Threads;

import javafx.scene.shape.Rectangle;

public class RectangleMove implements Runnable {

    private final Rectangle rect;

    public RectangleMove(Rectangle rect) {
        this.rect = rect;
    }


    public void run() {

        while (true) {
            if (this.rect.getX() == 0) {
                for (int i = 0; i < 300; i++) {
                    this.rect.setX(this.rect.getX() + 1);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                this.rect.setX(this.rect.getX() - 1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}







