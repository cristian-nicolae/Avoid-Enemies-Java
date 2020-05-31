package edu.tucn.secourseexamples.lesson8.game;

import javax.swing.*;
import java.awt.*;


public class Enemy extends JComponent {
   int speed;

public Enemy(int s)
{
    speed=s;

}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(0, 0, Utils.CHARACTER_SIZE, Utils.CHARACTER_SIZE);
    }
}
