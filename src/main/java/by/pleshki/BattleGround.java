package by.pleshki;

import by.pleshki.model.Archer;
import by.pleshki.model.Enemy;
import by.pleshki.model.Mage;
import by.pleshki.model.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy1 = new Enemy("Инстасамка", 50, 10);
        Enemy enemy2 = new Enemy("Мелстрой", 40, 15);
        Enemy enemy3 = new Enemy("Милохин", 40, 20);
        Enemy enemy4 = new Enemy("Киркоров", 25, 1);

        Warrior warrior1 = new Warrior("Мизулина", 100, 25);
        Mage mage1 = new Mage("Рамзан", 90, 30);
        Archer archer1 = new Archer("Газманов", 110, 10);

        //да начнется великая битва
        archer1.attackEnemy(enemy4);
        mage1.attackEnemy(enemy2);
        warrior1.attackEnemy(enemy1);
        archer1.attackEnemy(enemy2);
        mage1.attackEnemy(enemy3);
        archer1.attackEnemy(enemy2);

    }
}
