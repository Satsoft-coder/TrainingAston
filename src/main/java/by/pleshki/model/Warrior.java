package by.pleshki.model;

public class Warrior extends Hero{

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Герой атакует с пулемётом");
        enemy.takeDamage(32);
    }
}
