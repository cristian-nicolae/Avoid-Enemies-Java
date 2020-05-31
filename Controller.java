package edu.tucn.secourseexamples.lesson8.game;

import com.sun.jdi.IntegerValue;
import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.List;
import java.util.function.DoubleToIntFunction;


public class Controller extends JComponent {
    private List<Enemy> enemies;
    private boolean collision;
    private Character character;
    private Graphics g;


    public Controller(List<Enemy> enemies, Character character) {
        this.enemies = enemies;
        this.character = character;
    }

    public void start() {
        collision = false;
        int counter = 0;
        do {
            enemies.forEach(e -> {

                e.setLocation(e.getX(), e.getY() + e.getSpeed());


                if (e.getY() >= Utils.WIN_SIZE) {
                    e.setLocation((int) (Math.random() * 450), 20);

                }

                System.out.println(e.getX());
                if (e.getX() < character.getX() + Utils.CHARACTER_SIZE && e.getX() + Utils.CHARACTER_SIZE > character.getX() &&
                        e.getY() < character.getY() + Utils.CHARACTER_SIZE && e.getY() + Utils.CHARACTER_SIZE > character.getY()){
                    JOptionPane.showMessageDialog(new JFrame(), "Game Over", "!!!", JOptionPane.INFORMATION_MESSAGE);

                    collision=true;
            }

            });

            try {
                Thread.sleep(200);
            } catch (InterruptedException ignored) {
            }
        } while (!collision);
    }
}
