/**
 * @purpose : Four Balls Problem With Procedural Attempt,Where I Want To Get All Four Balls Move With The Speed Mentioned Below As An Output
 * @author : Akshay kumar
 */
import processing.core.PApplet;

public class FourBalls extends PApplet{
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 500;
    public static final int DIAMETER_OF_CIRCLE = 20;
    int ball1,ball2,ball3,ball4 = 0;
    int speed1 = 1,speed2 = 2,speed3 = 3,speed4 = 4;
    int ball1Distance = HEIGHT / 5, ball2Distance = HEIGHT * 2 / 5, ball3Distance = HEIGHT * 3 / 5, ball4Distance = HEIGHT * 4 / 5;

    /**
     * @purpose : To Move Ball 1 With Speed 1
     */
    private void drawCircle1() {
        ellipse(ball1, ball1Distance, DIAMETER_OF_CIRCLE,DIAMETER_OF_CIRCLE);
        ball1 += speed1;
    }

    /**
     * @purpose : To Move Ball 2 With Speed 2
     */
    private void drawCircle2(){
        ellipse(ball2,ball2Distance,DIAMETER_OF_CIRCLE,DIAMETER_OF_CIRCLE);
        ball2 += speed2;
    }

    /**
     * @purpose : To Move Ball 3 With Speed 3
     */
    private void drawCircle3(){
        ellipse(ball3,ball3Distance,DIAMETER_OF_CIRCLE,DIAMETER_OF_CIRCLE);
        ball3 += speed3;
    }

    /**
     * @purpose : To Move Ball 4 With Speed 4
     */
    private void drawCircle4(){
        ellipse(ball4,ball4Distance,DIAMETER_OF_CIRCLE,DIAMETER_OF_CIRCLE);
        ball4 += speed4;
    }

    /**
     * @purpose : To Call Settings From Class PApplet
     * Override This Method To Call size() When Not Using The PDE.
     */
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    /**
     * @purpose : To Call Draw From Class PApplet
     * Override This Method To Call drawCircle1,drawCircle2,drawCircle3,drawCircle4 Method.
     */
    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    /**
     * @purpose : To Execute All Four Balls By Calling Them In Main
     * @param args Defined In The Methods
     */
    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }
}