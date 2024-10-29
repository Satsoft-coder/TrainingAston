package by.pleshki;

import by.pleshki.model.*;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy1 = new Enemy("Чак Норис", 50);
        Enemy enemy2 = new Enemy("Арнольд Черный Негр", 40);
        System.out.println(enemy1);
        System.out.println(enemy2);

        Warrior warrior1 = new Warrior("Иван Сусанин");
        warrior1.attackEnemy(enemy1);
        System.out.println(enemy1);
        System.out.println(enemy2);

        Mage mage1 = new Mage("Баба Яга");
        mage1.attackEnemy(enemy2);
        System.out.println(enemy1);
        System.out.println(enemy2);

        Archer archer1 = new Archer("Robin Hood");
        archer1.attackEnemy(enemy2);
        System.out.println(enemy1);
        System.out.println(enemy2);

        archer1.attackEnemy(enemy2);
        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy1.isAlive());
        System.out.println(enemy2.isAlive());
    }
}