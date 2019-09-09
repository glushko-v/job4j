package Threads;

import javafx.scene.shape.Rectangle;

public class RectangleMove implements Runnable {

    private final Rectangle rect;

    public RectangleMove(Rectangle rect) {
        this.rect = rect;
    }


    public void run() {
        int count = (int) (this.rect.getX());


        while (true) {


            if (count != 0 && count != 290) {
                while (count < 290) {
                    count++;
                    runRight();
                }
            }
            if (count == 290) {
                while (count > 0) {
                    count--;
                    runLeft();

                }
            }
            if (count == 0) {
                while (count < 290) {
                    count++;
                    runRight();
                }
            }
        }


    }

    void runLeft() {
        this.rect.setX(this.rect.getX() - 1);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void runRight() {

        this.rect.setX(this.rect.getX() + 1);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}







