package by.pleshki.model;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Герой атакует " + enemy + " с пулемётом");
        enemy.takeDamage(32);
    }
}
