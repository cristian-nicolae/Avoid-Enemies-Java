package edu.tucn.secourseexamples.lesson8.game;

import javax.swing.*;
import java.awt.*;


public class Character extends JComponent {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Utils.CHARACTER_SIZE, Utils.CHARACTER_SIZE);
    }
}
