package edu.tucn.secourseexamples.lesson8.game;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;


public class MainWindow extends JFrame {

    private Character character;

    MainWindow(Character character, List<Enemy> enemies) {
        super("Test");
        this.setLayout(null);

        this.character = character;
        this.character.setLocation(240, 420);

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'a') {
                    character.setLocation(character.getX() - 10, character.getY());
                } else if (e.getKeyChar() == 'd') {
                    character.setLocation(character.getX() + 10, character.getY());
                }
                else if (e.getKeyChar() == 'w') {
                    character.setLocation(character.getX() , character.getY()-10);
                }
                else if (e.getKeyChar() == 's') {
                    character.setLocation(character.getX(), character.getY()+10);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        setSize(Utils.WIN_SIZE, Utils.WIN_SIZE);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(this.character);

        int distance = Utils.WIN_SIZE / enemies.size();
        int[] c = {0};

        enemies.forEach(e -> {
            e.setLocation(10 + c[0] * distance, 0);
            MainWindow.this.add(e);
            c[0] += 1;
        });

        setVisible(true);
    }
}
