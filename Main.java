package edu.tucn.secourseexamples.lesson8.game;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        character.setSize(Utils.CHARACTER_SIZE, Utils.CHARACTER_SIZE);
        Random r=new Random();
        int speed;
        List<Enemy> enemies = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Enemy enemy = new Enemy(r.nextInt(40)+10);

            enemy.setSize(Utils.CHARACTER_SIZE, Utils.CHARACTER_SIZE);
            enemies.add(enemy);
        }

        new MainWindow(character, enemies);

        new Controller(enemies,character).start();
    }
}
