import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

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
    private static final int WIDTH = 500;
    private static final int HEIGHT = 600;

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
     *
     * @param n number of balls
     */
    public void bounce( int n )
    {
        Dimension size = myCanvas.getSize();

        int ground = size.height - 20 - 10;   // position of the ground line
        int xStart = 20;    // x-start of the ground line
        int xLimit = size.width - 20;   // x-limit of the ground line

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(xStart, ground, xLimit, ground);

        ArrayList<BouncingBall> arrayBalls = new ArrayList<BouncingBall>();
        int diameters[] = new int[n]; 

        if ( n <= 0 ) {
            n = 1;
        }
        
        Random gerador = new Random();

        for (int i = 0; i < n; i++ ) {
            int yAleat = ( gerador.nextInt (size.height - (size.height/2) ) + 20 );
            int xAleat = ( gerador.nextInt (size.width - (size.width/2) ) + 20 );
            int dimAleat = ( gerador.nextInt ( 10 ) + 10);
            Color colorAleat = new Color(gerador.nextInt(256), gerador.nextInt(256), gerador.nextInt(256));
            arrayBalls.add( new BouncingBall(xAleat, yAleat, dimAleat, colorAleat, ground, myCanvas) );
            diameters[i] = ( dimAleat );
        }

        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);
            boolean finishedAux = true;
            for (int i = 0; i < n; i++ ) {
                finishedAux = finishedAux && (arrayBalls.get(i).getXPosition() >= xLimit-diameters[i] - 1);
                if (arrayBalls.get(i).getXPosition() >= xLimit-diameters[i] - 1) {
                    arrayBalls.get(i).draw();
                }
                else
                    arrayBalls.get(i).move();
            }
            finished = finishedAux;
        }
        for (int i = 0; i < n; i++ ) {
            arrayBalls.get(i).erase();
        }
/*
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
        ball2.erase();*/
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
        //myCanvas.fill(rect);
    }

    
}
