import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Color;

/**
 * Class BallDemo - provides a demonstration of the
 * BouncingBall and Canvas classes. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2010.11.30
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;

    /**
     * Create a BallDemo object.
     * Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", WIDTH, HEIGHT);
        myCanvas.setVisible(true);
    }
 
    /**
     * Simulate two bouncing balls
     */
    public void bounce()
    {
        int ground = HEIGHT - 20 - 3;   // position of the ground line
        int xStart = 20 + 3;    // x-start of the ground line
        int xLimit = WIDTH - 20 - 3;   // x-limit of the ground line

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(xStart, ground, xLimit, ground);

        // crate and show the balls
        BouncingBall ball = new BouncingBall(xStart, 50, 16, Color.blue, ground, myCanvas);
        ball.draw();
        BouncingBall ball2 = new BouncingBall(xStart + 20, 80, 20, Color.red, ground, myCanvas);
        ball2.draw();

        // Make them bounce until both have gone beyond the xLimit.
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            ball.move();
            ball2.move();
            // stop once ball has travelled a certain distance on x axis
            if(ball.getXPosition() >= xLimit && ball2.getXPosition() >= xLimit) {
                finished = true;
            }
        }
        ball.erase();
        ball2.erase();
    }

    /**
     *
     * This method displays a frame in the canvas object by
     * drawing a rectangle within the edge of the canvas, 
     * at a distance of 20 pixels.
     *
     */
    public void drawDemo()
    {
        // the shape to draw and move
        Dimension size = myCanvas.getSize();

        int xTam = size.width;
        int yTam = size.height;
        int xPos = 20;
        int yPos = 20;

        Rectangle rect = new Rectangle( xPos, yPos, xTam - (2*xPos),
                                        yTam - (2*yPos));

        myCanvas.erase();
        //myCanvas.eraseOutline(rect);
        rect.setLocation(xPos, yPos);
        myCanvas.draw(rect);

        // at the end of the move, draw and fill once more so that it remains visible
        myCanvas.fill(rect);
    }

    
}
