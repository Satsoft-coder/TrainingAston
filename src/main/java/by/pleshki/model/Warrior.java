package by.pleshki.model;

public class Warrior extends Hero {

    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Герой " + getName() + " атакует " + enemy + " с пулемётом");
        enemy.takeDamage(getDamage());
    }
}
