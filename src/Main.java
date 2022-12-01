// My AFK bot

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Random;

import static java.awt.event.InputEvent.BUTTON1_MASK;
import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_W;


public class Main {


    public static void main(String[] args) throws InterruptedException, AWTException {

            int seconds = 3000;
            int x_coordinate = 200;
            int y_coordinate = 150;


            Robot robot = new Robot();

            Random random = new Random();
            while (true) {
                robot.mousePress(BUTTON1_MASK);
                robot.keyPress(VK_W);
                //robot.mouseMove(random.nextInt(x_coordinate), random.nextInt(y_coordinate));
                Thread.sleep(seconds);
            }

    }
}

// Thanks to Bhuvan for this awesome code:
// https://www.bhuvaneswaran.com/auto-mouse-mover-java-code/